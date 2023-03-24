package analysis;
import io.cli.Terminal;
import model.dna.DNA;
import model.ReadingFrames;
import model.codon.CodonFrame;
import model.protein.Protein;

import java.io.PrintStream;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Analysis {
    private DNA dna;
    private String aminoAcid;
    private String protein;

    public Analysis(DNA dna, String aminoAcid, String protein) {
        this.dna = dna;
        this.aminoAcid = aminoAcid;
        this.protein = protein;
    }

    public DNA getDna() {
        return dna;
    }

    public String getAminoAcid() {
        return aminoAcid;
    }

    public void setAminoAcid(String aminoAcid) {
        this.aminoAcid = aminoAcid;
    }

    public String getProtein() {
        return protein;
    }

    public void setProtein(String protein) {
        this.protein = protein;
    }
}
