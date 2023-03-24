package model.aminoAcid;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AminoAcidFactory {
    private static final Map<String, AminoAcid> aminoAcids = new HashMap<>();

    static {
        AminoAcid alanine = new AminoAcid("Alanine", List.of("a", "alanine", "ala"), List.of("GCT", "GCC", "GCA", "GCG"));
        aminoAcids.put("ALANINE", alanine);

        AminoAcid cysteine = new AminoAcid("Cysteine", List.of("c", "cysteine", "cys"), List.of("TGT", "TGC"));
        aminoAcids.put("CYSTEINE", cysteine);

        AminoAcid asparticAcid = new AminoAcid("Aspartic acid", List.of("d", "aspartic acid", "asp"), List.of("GAT", "GAC"));
        aminoAcids.put("ASPARTIC_ACID", asparticAcid);

        AminoAcid glutamicAcid = new AminoAcid("Glutamic acid", List.of("e", "glutamic acid", "glu"), List.of("GAA", "GAG"));
        aminoAcids.put("GLUTAMIC_ACID", glutamicAcid);

        AminoAcid phenylalanine = new AminoAcid("Phenylalanine", List.of("", "", ""), List.of("", ""));
        aminoAcids.put("PHENYLALANINE", phenylalanine);

        AminoAcid glycine =  new AminoAcid("Glycine", List.of("g", "glycine", "gly"), List.of("GGT", "GGC", "GGA", "GGG"));
        aminoAcids.put("GLYCINE", glycine);

        AminoAcid histidine = new AminoAcid("Histidine", List.of("h", "histidine", "his"), List.of("CAT", "CAC"));
        aminoAcids.put("HISTIDINE", histidine);

        AminoAcid isoleucine = new AminoAcid("Isoleucine", List.of("i", "isoleucine", "ile"), List.of("ATT", "ATC", "ATA"));
        aminoAcids.put("ISOLEUCINE", isoleucine);

        AminoAcid lysine = new AminoAcid("Lysine", List.of("k", "lysine", "lys"), List.of("AAA", "AAG"));
        aminoAcids.put("LYSINE", lysine);

        AminoAcid leucine = new AminoAcid("Leucine", List.of("k", "lysine", "lys"), List.of("AAA", "AAG"));
        aminoAcids.put("LEUCINE", leucine);

        AminoAcid methionine = new AminoAcid("Lysine", List.of("k", "lysine", "lys"), List.of("AAA", "AAG"));
        aminoAcids.put("METHIONINE", methionine);

        AminoAcid asparagine = new AminoAcid("Asparagine", List.of("n", "asparagine", "asn"), List.of("AAT", "AAC"));
        aminoAcids.put("ASPARAGINE", asparagine);

        AminoAcid proline = new AminoAcid("Proline", List.of("p", "proline", "pro"), List.of("CCT", "CCC", "CCA", "CCG"));
        aminoAcids.put("PROLINE", proline);

        AminoAcid glutamine = new AminoAcid("Glutamine", List.of("q", "glutamine", "gln"), List.of("CAA", "CAG"));
        aminoAcids.put("GLUTAMINE", glutamine);

        AminoAcid arginine = new AminoAcid("Arginine", List.of("r", "arginine", "arg"), List.of("CGT", "CGC", "CGA", "CGG", "AGA", "AGG"));
        aminoAcids.put("ARGININE", arginine);

        AminoAcid serine = new AminoAcid("Serine", List.of("s", "serine", "ser"), List.of("TCT", "TCC", "TCA", "TCG", "AGT", "AGC"));
        aminoAcids.put("SERINE", serine);

        AminoAcid threonine = new AminoAcid("Theornine", List.of("t", "threonine", "thr"), List.of("ACT", "ACC", "ACA", "ACG"));
        aminoAcids.put("THREONINE", threonine);

        AminoAcid valine = new AminoAcid("Valine", List.of("v", "valine", "val"), List.of("GTT", "GTC", "GTA", "GTG"));
        aminoAcids.put("VALINE", valine);

        AminoAcid tryptophan = new AminoAcid("Tryptophan", List.of("w", "tryptophan", "trp"), List.of("TGG"));
        aminoAcids.put("TRYPTOPHAN", tryptophan);

        AminoAcid tyrosine = new AminoAcid("Tyrosine", List.of("tyrosine", "y", "tyr"), List.of("TAT", "TAC"));
        aminoAcids.put("TYROSINE", tyrosine);
    }

    public static AminoAcid getAminoAcid(String name) {
        return aminoAcids.get(name);
    }
    public static Map<String, AminoAcid> getAminoAcids() { return aminoAcids; }
}
