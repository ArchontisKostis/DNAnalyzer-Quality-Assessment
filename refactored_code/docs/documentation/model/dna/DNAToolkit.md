# `DNAToolkit` Class

## Methods

### `public static boolean checkIfDnaIsRandom(DNA dna)`
Checks if a given DNA sequence is random by counting the percentage of each nucleotide in the sequence and comparing them to one another. Returns true if the difference between the highest and lowest percentage of nucleotides is less than or equal to 2, otherwise returns false.

### `public static String replaceDnaSequence(DNA dna, String charToReplace, String replacement)`
Takes a DNA sequence, a character to replace, and a replacement character and replaces all instances of the first character with the second character in the DNA sequence's string. Returns the modified DNA sequence as a string.

### `public static List<Protein> findProteins(DNA dna, String aminoAcid)`
Takes a DNA sequence and an amino acid and returns a list of all proteins in the DNA sequence that contain the given amino acid.
