# `AminoAcidFactory` Class

## Properties
- `aminoAcidData`: A dictionary containing data about all the amino acids, with the keys being the three letter abbreviation and the values being instances of the `AminoAcid` class

## Methods

### `public AminoAcidFactory()`
The constructor for the AminoAcidFactory class, that initializes the `aminoAcidData` property and populates it with data about all the amino acids

### `public AminoAcid getAminoAcid(String abbreviation)`
Accepts the three letter abbreviation of an amino acid and returns an instance of the `AminoAcid` class for that amino acid

### `public List<AminoAcid> getAllAminoAcids()`
Returns a list of all instances of the `AminoAcid` class, representing all the amino acids
