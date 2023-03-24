## Class: Controller

The `Controller` class is responsible for handling the program's flow of execution. It receives command line arguments, parses them using the `ArgumentParser` class, and starts either the CLI or GUI mode of the program.

### Fields
- `argumentParser` : ArgumentParser - an instance of the ArgumentParser class, used to parse the command line arguments passed to the program
- `options` : ArgumentParser.Options - an instance of the ArgumentParser.Options class, used to store the parsed command line arguments
- `terminal` : Terminal - an instance of the Terminal class, used to handle the program's input and output in the CLI mode

### Methods

#### `public Controller(String[] args)`

The constructor of the class, it receives the command line arguments passed to the program, initializes the `argumentParser` and `options` fields and creates an instance of the `Terminal` class.

#### `public void run()`

The entry point of the class, it decides whether to start the CLI or GUI mode based on the `startGUI` option passed as a command line argument.

#### `private void startGUI()`

This method starts the GUI mode of the program, it is not implemented yet.

#### `private void startCLI()`

This method starts the CLI mode of the program, it uses the `terminal` field to print messages to the user, and calls the `startAnalysis()` method to create an instance of the Analysis class, and then creates an instance of the Analyzer class, passing the Analysis instance to its constructor.

It then calls the following methods on the `analyzer` instance:
- `begin(options.reverse)`
- `analyzeProteins()`
- `searchForHighCoverageRegions()`
- `configureReadingFrames(options.minCount, options.maxCount)`
- `analyzeProteinSequence()`
- `findLongestProtein()`
- `checkForRandomDNA()`

And finally, it calls the `getResult()` method on the `analyzer` instance to get the AnalysisResult and prints it using the `terminal` field.

#### `private Analysis startAnalysis()`

This method is responsible for creating and returning an instance of the Analysis class, it uses the `FastaReader` class to read the files passed as command line arguments and creates the Analysis instance by passing the `DNA` object returned by the `FastaReader` and the `aminoAcid` and `protein` options passed as command line arguments.

It also handles the IOException and InterruptedException that can be thrown by the `read()` method of the `FastaReader` class, and prints an error message to the user in case of an exception.
