# `DNA` Class

## Properties
- `sequence`: The DNA sequence. (Inherited from `Sequence` class)

## Methods

### `public DNA(String sequence)`
The constructor for the DNA class, that initializes the `sequence` property of the class

### `public boolean isValid()`
This method returns true if the DNA sequence is valid, otherwise throws IllegalArgumentException

### `public void replaceSequence(String charToReplace, String replacement)`
This method replaces the given `charToReplace` with the given `replacement` in the DNA sequence

### `public void reverse()`
This method reverses the DNA sequence

### `public List<Protein> findProteins(String aminoAcid)`
This method returns a list of proteins that contain the given `aminoAcid`

### `public boolean isRandom()`
This method returns true if the DNA sequence is random, otherwise false

### `@Override public String toString()`
This method returns a string representation of the DNA class.
