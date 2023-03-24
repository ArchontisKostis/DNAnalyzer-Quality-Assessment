# ReadingFrames

The `ReadingFrames` class represents a data structure that stores the highest occurring codons in a given reading frame.

## Properties
- `codonCounts`: A `Map` of codon sequences and their corresponding counts in the specified reading frame.
- `codonFrame`: A `CodonFrame` object representing the reading frame to be analyzed.

## Methods
- `buildCodonMap()`: Builds the `codonCounts` map by looping over the DNA sequence in steps of 3 and storing the codon and its corresponding count.
- `printCodonCounts(PrintStream out)`: Prints the codon counts in the specified reading frame to the given `PrintStream`.
- `getCodonCounts()`: Returns the `codonCounts` map.
- `getCodonFrame()`: Returns the `codonFrame` object.