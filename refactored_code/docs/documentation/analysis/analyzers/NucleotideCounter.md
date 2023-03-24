# `NucleotideCounter` Class

This class is used to count the number of occurrences of each nucleotide in a given `DNA` object.

## Properties

- `dna`: An object of type DNA, which contains the DNA sequence to be analyzed.

## Methods

### `public NucleotideCounter(DNA dna)`
This constructor creates a new NucleotideCounter object and initializes it with the given DNA object.

### `public long[] count()`
This method counts the number of occurrences of each nucleotide (adenine, thymine, guanine, cytosine) in the DNA object. It returns an array of longs, with the first element being the count of adenine, the second element being the count of thymine, the third element being the count of guanine, and the fourth element being the count of cytosine.

### `private long countAdenine()`
This method counts the number of occurrences of adenine (A or a) in the DNA object.

### `private long countThymine()`
This method counts the number of occurrences of thymine (T or t) in the DNA object.

### `private long countGuanine()`
This method counts the number of occurrences of guanine (G or g) in the DNA object.

### `private long countCytosine()`
This method counts the number of occurrences of cytosine (C or c) in the DNA object.
