package analysis.analyzers;

import analysis.Analysis;
import analysis.AnalysisResult;
import model.ReadingFrames;
import model.codon.CodonFrame;
import model.dna.DNA;
import model.protein.Protein;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Analyzer {
    private Analysis analysis;
    private ProteinAnalyzer proteinAnalyzer;
    private NucleotideCounter nucleotideCounter;
    private AnalysisResult result;

    public Analyzer(Analysis analysis) {
        this.analysis = analysis;
        this.result = new AnalysisResult(analysis.getAminoAcid());
        init(analysis);
    }

    private void init(Analysis analysis) {
        String aminoAcid = analysis.getAminoAcid();
        DNA dna = analysis.getDna();

        if (!dna.isValid())
            throw new IllegalArgumentException("Invalid characters present in DNA sequence.");

        List<Protein> dnaProteins = dna.findProteins(aminoAcid);

        this.proteinAnalyzer = new ProteinAnalyzer(dnaProteins);
        this.nucleotideCounter = new NucleotideCounter(dna);
    }

    public void begin(boolean reverseIsSelected) {
        DNA dna = analysis.getDna();
        dna.replaceSequence("u", "t");

        if (reverseIsSelected)
            dna.reverse();
    }

    public void analyzeProteins() {
        DNA dna = analysis.getDna();

        String aminoAcid = analysis.getAminoAcid();
        this.result.setDnaProteins(dna.findProteins(aminoAcid));

        double gcContent = dna.calculateGCContent();
        this.result.setGcContent(gcContent);

        // Find Nucleotide Count
        long[] nucleotideCount = nucleotideCounter.count();
        // Put the results to a map
        Map<String, Long> resultsMap = new HashMap<>();
        resultsMap.put("A", nucleotideCount[0]);
        resultsMap.put("T", nucleotideCount[2]);
        resultsMap.put("G", nucleotideCount[3]);
        resultsMap.put("C", nucleotideCount[4]);

        this.result.setNucleotideCountMap(resultsMap);
    }

    public void searchForHighCoverageRegions() {
        Map<String, Integer> highCoverageRegions =
                proteinAnalyzer.findHighCoverageRegions();

        this.result.setHighCoverageRegions(highCoverageRegions);
    }

    public void findLongestProtein() {
        String aminoAcid = analysis.getAminoAcid();
        List<Protein> proteins = analysis.getDna()
                .findProteins(aminoAcid);

        Protein longestProtein = proteinAnalyzer.findLongestProtein(proteins);
        this.result.setLongestProtein(longestProtein);
    }

    public void configureReadingFrames(int minCount, int maxCount) {
        final short READING_FRAME = 1;

        DNA dna = analysis.getDna();
        CodonFrame codonFrame = new CodonFrame(dna, READING_FRAME, minCount, maxCount);
        ReadingFrames readingFrames = new ReadingFrames(codonFrame);

        this.result.setReadingFrames(readingFrames);
    }

    public void analyzeProteinSequence() {
        if(analysis.getProtein() == null)
            throw new IllegalArgumentException("Protein cannot be null.");

        final Pattern pattern = Pattern.compile(analysis.getProtein());
        final Matcher matcher = pattern.matcher(analysis.getDna().getSequence());

        if (matcher.find())
            this.result.setProteinSequenceIndex(matcher.start());

        this.result.setProteinSequenceIndex(matcher.start());
    }

    public void checkForRandomDNA() {
        if (analysis.getDna().isRandom())
            this.result.setDnaIsRandom(true);
    }

    public Analysis getAnalysis() {
        return analysis;
    }
    public void setAnalysis(Analysis analysis) {
        this.analysis = analysis;
    }
    public AnalysisResult getResult() {
        return result;
    }
}
