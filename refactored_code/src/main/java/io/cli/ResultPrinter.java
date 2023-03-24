package io.cli;

import analysis.AnalysisResult;
import model.ReadingFrames;
import model.aminoAcid.AminoAcid;
import model.aminoAcid.AminoAcidFactory;
import model.codon.CodonFrame;
import model.protein.Protein;

import java.util.List;
import java.util.Map;

public class ResultPrinter {
    private AnalysisResult result;

    public void printProteinAnalysis() {
        // Changes the 1 letter or 3 letter abbreviation of the amino acids into the
        // full name
        final AminoAcid acid = AminoAcidFactory.getAminoAcid(result.getInputAminoAcid());

        System.out.println("Proteins coded for: " + acid.getFullName() + ": ");
        System.out.println("-----------------------------------------------------------");

        short count = 1;
        for (final Protein gene : result.getDnaProteins()) {
            System.out.println(count + ". " + gene.getSequence());
            count++;
        }
    }

    public void printHighCoverageAreas() {
        System.out.println("\nHigh coverage regions: ");
        System.out.println();

        Map<String, Integer> highCoverageRegions = result.getHighCoverageRegions();
        for (Map.Entry<String, Integer> mapEntry : highCoverageRegions.entrySet()){
            String gene = mapEntry.getKey();
            int count = mapEntry.getValue();
            System.out.println(count + ". " + gene);
        }
    }

    public void printLongestProtein() {
        String proteinSequence = result.getLongestProtein()
                .getSequence();
        int proteinLength = result.getLongestProtein()
                .length();

        System.out.println(
                "\nLongest gene ("
                        + proteinLength
                        + " nucleotides): "
                        + proteinSequence);
    }

    public void printNucleotideCount() {
        Map<String, Long> nucleotideCountMap = result.getNucleotideCountMap();
        for(Map.Entry<String, Long> nucleotide : nucleotideCountMap.entrySet()) {
            String nucleotideName = nucleotide.getKey();
            Long nucleotideCount = nucleotide.getValue();

            System.out.println(
                    nucleotideName + ": "
                            + nucleotideCount + " %"
            );
        }

    }

    public void printReadingFrames() {
        CodonFrame codonFrame = result.getReadingFrames()
                .getCodonFrame();
        Map<String, Integer> codonCounts = result.getReadingFrames()
                .getCodonCounts();

        String title = "Codons in reading frame " + codonFrame.getReadingFrame() + " (" + codonFrame.getMin() + "-"
                + codonFrame.getMax() + " occurrences)" + ":";


        System.out.println(title);
        System.out.println("-----------------------------------------------------------");

        for (final Map.Entry<String, Integer> entry : codonCounts.entrySet()) {
            if (codonCounts.get(entry.getKey()) >= codonFrame.getMin()
                    && codonCounts.get(entry.getKey()) <= codonFrame.getMax()) {
                String codonKey = entry.getKey().toUpperCase();
                Integer codonCount = codonCounts.get(entry.getKey());
                System.out.println( codonKey + ": " + codonCount);
            }
        }
    }

    public void printProteinSequenceResults() {
        int sequenceIndex = result.getProteinSequenceIndex();

        if(sequenceIndex == -1)
            System.out.println("\nProtein sequence not found in the DNA sequence.");
        else
            System.out.println("\nProtein sequence found at index " + sequenceIndex + " in the DNA sequence.");
    }

    public void printRandomDnaInfo() {
        if(result.isDnaIsRandom())
            System.out.println("\nThe DNA Sequence Detected to be Random.");
    }

    public AnalysisResult getResult() {
        return result;
    }

    public void setResult(AnalysisResult result) {
        this.result = result;
    }
}
