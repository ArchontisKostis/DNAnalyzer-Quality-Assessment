package model.dna;

import analysis.analyzers.NucleotideCounter;
import model.protein.Protein;
import model.protein.ProteinFinder;

import java.util.Arrays;
import java.util.List;

public class DNAToolkit {

    public static boolean checkIfDnaIsRandom(DNA dna) {
        NucleotideCounter counter = new NucleotideCounter(dna);

        long[] nucleotideCount = counter.count();

        Arrays.sort(nucleotideCount);

        // Only calculate 2 Percentages, as only the highest difference (max - min) is
        // relevant
        int maxPercent = (int) (nucleotideCount[0] / dna.length() * 100);
        int minPercent = (int) (nucleotideCount[3] / dna.length() * 100);

        // If the percentage of each nucleotide is between 2% of one another, then it is
        // random
        return Math.abs(maxPercent - minPercent) <= 2;
    }

    public static String replaceDnaSequence(DNA dna, String charToReplace, String replacement) {
        return dna.getSequence()
                .replace(charToReplace, replacement);
    }

    public static List<Protein> findProteins(DNA dna, String aminoAcid) {
        return ProteinFinder.findProteins(dna, aminoAcid);
    }
}