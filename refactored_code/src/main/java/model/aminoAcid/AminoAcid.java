package model.aminoAcid;

import java.util.List;

public class AminoAcid {
    private String fullName;
    private List<String> abbreviations;
    private List<String> codons;

    public AminoAcid(String fullName, List<String> abbreviations, List<String> codons) {
        this.fullName = fullName;
        this.abbreviations = abbreviations;
        this.codons = codons;
    }

    public String getFullName() {
        return fullName;
    }
    public List<String> getCodons() {
        return codons;
    }

}
