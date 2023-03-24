# `Sequence` Abstract Class

## Properties
- `sequence`: The sequence of the DNA or protein 

## Methods

### `public abstract class Sequence(String sequence)`
The constructor for the Sequence class, that initializes the properties of the class.

### `public double calculateGCContent()`
This method calculates the GC content of the sequence, which is the percentage of G (guanine) and C (cytosine) in the sequence. It returns the GC content as a double.

### `private int calculateGcLength()`
This method calculates the number of G and C in the sequence. It's used as a helper method for `calculateGCContent()`

### `public int length()`
This method returns the length of the sequence.

### `public String getSequence()`
This method returns the sequence.

### `public void setSequence(String sequence)`
This method sets the sequence.
