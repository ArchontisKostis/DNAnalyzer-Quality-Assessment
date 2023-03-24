package analysis;

import model.ReadingFrames;
import model.protein.Protein;

import java.util.List;
import java.util.Map;

public class AnalysisResult {
    private String inputAminoAcid;
    private List<Protein> dnaProteins;
    private double gcContent;
    private Map<String, Long> nucleotideCountMap;
    private Map<String, Integer> highCoverageRegions;
    private Protein longestProtein;
    private ReadingFrames readingFrames;
    private int proteinSequenceIndex;
    private boolean dnaIsRandom = false;

    public AnalysisResult(String inputAminoAcid) {
        this.inputAminoAcid = inputAminoAcid;
    }

    public String getInputAminoAcid() {
        return inputAminoAcid;
    }

    public void setInputAminoAcid(String inputAminoAcid) {
        this.inputAminoAcid = inputAminoAcid;
    }

    public List<Protein> getDnaProteins() {
        return dnaProteins;
    }

    public void setDnaProteins(List<Protein> dnaProteins) {
        this.dnaProteins = dnaProteins;
    }

    public double getGcContent() {
        return gcContent;
    }

    public void setGcContent(double gcContent) {
        this.gcContent = gcContent;
    }

    public Map<String, Long> getNucleotideCountMap() {
        return nucleotideCountMap;
    }

    public void setNucleotideCountMap(Map<String, Long> nucleotideCountMap) {
        this.nucleotideCountMap = nucleotideCountMap;
    }

    public Map<String, Integer> getHighCoverageRegions() {
        return highCoverageRegions;
    }

    public void setHighCoverageRegions(Map<String, Integer> highCoverageRegions) {
        this.highCoverageRegions = highCoverageRegions;
    }

    public Protein getLongestProtein() {
        return longestProtein;
    }

    public void setLongestProtein(Protein longestProtein) {
        this.longestProtein = longestProtein;
    }

    public ReadingFrames getReadingFrames() {
        return readingFrames;
    }

    public void setReadingFrames(ReadingFrames readingFrames) {
        this.readingFrames = readingFrames;
    }

    public int getProteinSequenceIndex() {
        return proteinSequenceIndex;
    }

    public void setProteinSequenceIndex(int proteinSequenceIndex) {
        this.proteinSequenceIndex = proteinSequenceIndex;
    }

    public boolean isDnaIsRandom() {
        return dnaIsRandom;
    }

    public void setDnaIsRandom(boolean dnaIsRandom) {
        this.dnaIsRandom = dnaIsRandom;
    }
}
