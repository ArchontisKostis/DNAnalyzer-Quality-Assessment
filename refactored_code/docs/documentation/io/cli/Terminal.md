# `Terminal` Class

## Properties

- `operatingSystem`: A string that represents the operating system that the program is running on.
- `resultPrinter`: An instance of the ResultPrinter class, used for printing the results of an analysis.

## Methods

### `public static Terminal getInstance()`
Returns the singleton instance of the Terminal class.

### `public void printError(String message)`
Prints an error message to the console and exits the program.

### `public void clear() throws IOException, InterruptedException`
Clears the console, depending on the operating system.

### `public void printLine(String textToPrint)`
Prints a line of text to the console.

### `public void printAnalysisResults(AnalysisResult results)`
Prints the results of an analysis to the console using the ResultPrinter instance.

### `private void clearForWindows() throws IOException, InterruptedException`
Clears the console for a Windows operating system using a command line command.

### `private void clearForMacLinux()`
Clears the console for Mac or Linux operating systems using ANSI escape codes.
