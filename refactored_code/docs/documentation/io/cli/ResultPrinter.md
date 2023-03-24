# `ResultPrinter` Class

## Properties
- `result`: an instance of `AnalysisResult` class, which contains the result of the analysis.

## Methods

### `public void printProteinAnalysis()`
Prints the proteins coded for the amino acid specified in the input.

### `public void printHighCoverageAreas()`
Prints the high coverage regions of the DNA sequence.

### `public void printLongestProtein()`
Prints the longest protein found in the DNA sequence.

### `public void printNucleotideCount()`
Prints the count of each nucleotide in the DNA sequence.

### `public void printReadingFrames()`
Prints the codons in the reading frame specified in the input.

### `public void printProteinSequenceResults()`
Prints the result of searching for the input protein sequence in the DNA sequence.

### `public void printRandomDnaInfo()`
Prints whether or not the DNA sequence is random.

### `public AnalysisResult getResult()`
Returns the `AnalysisResult` instance.

### `public void setResult(AnalysisResult result)`
Sets the `AnalysisResult` instance.
