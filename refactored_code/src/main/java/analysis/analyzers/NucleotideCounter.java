package analysis.analyzers;

import model.dna.DNA;

import java.util.Map;

public class NucleotideCounter {
    private DNA dna;

    public NucleotideCounter(DNA dna) {
        this.dna = dna;
    }

    public long[] count() {
        long adenine = countAdenine();
        long thymine = countThymine();
        long guanine = countGuanine();
        long cytosine = countCytosine();

        return new long[] {adenine, thymine, guanine, cytosine};
    }

    private long countAdenine() {
        String dnaSequence = dna.getSequence();
        return dnaSequence.chars()
                .filter(c -> (c == 'A' || c == 'a'))
                .count();
    }

    private long countThymine() {
        String dnaSequence = dna.getSequence();
        return dnaSequence.chars()
                .filter(c -> (c == 'T' || c == 't'))
                .count();
    }

    private long countGuanine() {
        String dnaSequence = dna.getSequence();
        return dnaSequence.chars()
                .filter(c -> (c == 'G' || c == 'g'))
                .count();
    }

    private long countCytosine() {
        String dnaSequence = dna.getSequence();
        return dnaSequence.chars()
                .filter(c -> (c == 'C' || c == 'c'))
                .count();
    }

}
