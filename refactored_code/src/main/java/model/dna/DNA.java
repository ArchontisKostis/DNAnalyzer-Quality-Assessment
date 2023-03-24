package model.dna;

import model.Sequence;
import model.protein.Protein;

import java.util.*;

public class DNA extends Sequence {

    public DNA(String sequence) {
        super(sequence);
    }

    public boolean isValid() {
        String sequence = super.getSequence();
        if(!sequence.matches("[atgc]+"))
            throw new IllegalArgumentException("Invalid characters present in DNA sequence.");
        return true;
    }

    public void replaceSequence(String charToReplace, String replacement) {
        String newSequence = DNAToolkit.replaceDnaSequence(this, charToReplace, replacement);
        super.setSequence(newSequence);
    }

    public void reverse() {
        String sequence = super.getSequence();
        String reversedDna = new StringBuilder(sequence).reverse().toString();
        this.setSequence(reversedDna);
    }

    public List<Protein> findProteins(String aminoAcid) {
        return DNAToolkit.findProteins(this, aminoAcid);
    }

    public boolean isRandom() {
        return DNAToolkit.checkIfDnaIsRandom(this);
    }

    @Override
    public String toString() {
        return "DNA{" +
                "sequence=" + super.getSequence() + '\'' +
                '}';
    }
}
