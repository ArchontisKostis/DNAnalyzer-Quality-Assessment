# `ProteinFinder` Class

## Methods

### `public static List<Protein> findProteins(DNA dna, String aminoAcid)`
This method finds proteins in a DNA sequence. It takes in a DNA object and an amino acid string as its parameters, and returns a list of `Protein` objects.

### `private ProteinFinder()`
A private constructor for the `ProteinFinder` class, which ensures that no instances of this class can be created.

### `public static void addProtein(DNA dna, Collection<Protein> proteinList, int startIndex)`
This method adds a protein to a list of proteins. It takes in a DNA object, a collection of `Protein` objects, and an int representing the start index of the protein to be added.
