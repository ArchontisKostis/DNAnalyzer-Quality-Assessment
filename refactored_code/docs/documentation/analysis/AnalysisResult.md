# `AnalysisResult` Class

This class is used to store the result of an analysis of a DNA sequence.

## Properties

- `inputAminoAcid`: A string containing the input amino acid sequence.
- `dnaProteins`: A list of `Protein` objects, each containing a protein sequence and its location in the DNA sequence.
- `gcContent`: A double representing the GC content of the DNA sequence.
- `nucleotideCountMap`: A map containing the number of occurrences of each nucleotide (adenine, thymine, guanine, cytosine) in the DNA sequence.
- `highCoverageRegions`: A map containing the high coverage regions of the DNA sequence.
- `longestProtein`: A `Protein` object containing the longest protein sequence found in the DNA sequence.
- `readingFrames`: An object of type `ReadingFrames` containing the reading frames of the DNA sequence.
- `proteinSequenceIndex`: An integer representing the index of the selected protein sequence.
- `dnaIsRandom`: A boolean indicating whether the DNA sequence is random or not.

## Methods

### `public AnalysisResult(String inputAminoAcid)`
This constructor creates a new `AnalysisResult` object and initializes it with the given input amino acid sequence.

### `public String getInputAminoAcid()`
This method returns the input amino acid sequence.

### `public void setInputAminoAcid(String inputAminoAcid)`
This method sets the input amino acid sequence.

### `public List<Protein> getDnaProteins()`
This method returns the list of `Protein` objects found in the DNA sequence.

### `public void setDnaProteins(List<Protein> dnaProteins)`
This method sets the list of `Protein` objects found in the DNA sequence.

### `public double getGcContent()`
This method returns the GC content of the DNA sequence.

### `public void setGcContent(double gcContent)`
This method sets the GC content of the DNA sequence.

### `public Map<String, Long> getNucleotideCountMap()`
This method returns the map containing the number of occurrences of each nucleotide in the DNA sequence.

### `public void setNucleotideCountMap(Map<String, Long> nucleotideCountMap)`
This method sets the map containing the number of occurrences of each nucleotide in the DNA sequence.

### `public Map<String, Integer> getHighCoverageRegions()`
This method returns the map containing the high coverage regions of the DNA sequence.

### `public void setHighCoverageRegions(Map<String, Integer> highCoverageRegions)`
This method sets the map containing the high coverage regions of the DNA sequence.

### `public Protein getLongestProtein()`
This method returns the longest protein sequence found in the DNA sequence.

### `public void setLongestProtein(Protein longestProtein)`
This method sets the longest protein sequence found in the DNA sequence.

### `public ReadingFrames getReadingFrames()`
This method returns the object containing the reading frames of the DNA sequence.

### `public void setReadingFrames(ReadingFrames readingFrames)`
This method sets the object containing the reading frames of
