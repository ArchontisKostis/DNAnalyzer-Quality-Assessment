# `CodonFrame` Class

## Properties
- `dna`: The DNA sequence
- `readingFrame`: The reading frame of the codon
- `min`: The minimum position of the codon
- `max`: The maximum position of the codon

## Methods

### `public CodonFrame(DNA dna, short readingFrame, int min, int max)`
The constructor for the CodonFrame class, that initializes the properties of the class

### `public DNA getDna()`
Returns the DNA of the CodonFrame

### `public short getReadingFrame()`
Returns the reading frame of the CodonFrame

### `public int getMin()`
Returns the minimum position of the codon

### `public int getMax()`
Returns the maximum position of the codon

### `@Override public boolean equals(final Object o)`
Checks if the current CodonFrame is equal to the input Object

### `@Override public int hashCode()`
Returns the hash code of the CodonFrame
