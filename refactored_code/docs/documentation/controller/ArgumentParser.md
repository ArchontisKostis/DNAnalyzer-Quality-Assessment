# `ArgumentParser` Class

This class is used to parse command-line arguments for the DNA analyzer program. It uses the `picocli` library to define the options and arguments that the program accepts.

## Properties

- `startGUI`: A boolean flag indicating whether the program should start in GUI mode.
- `aminoAcid`: A string representing the amino acid that the program should use as the start of a gene.
- `minCount`: An integer representing the minimum count of the reading frame.
- `maxCount`: An integer representing the maximum count of the reading frame.
- `dnaFile`: A `File` object representing the FASTA file to be analyzed.
- `proteinFile`: A `File` object representing the DNA sequence to be found within the FASTA file.
- `reverse`: A boolean flag indicating whether the DNA sequence should be reversed before processing.

## Methods

### `public Options parse(String[] arguments)`
This method is used to parse the command-line arguments passed to the program. It creates a new `Options` object and initializes it with the values specified in the arguments. It returns the `Options` object.
