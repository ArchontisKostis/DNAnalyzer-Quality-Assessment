package controller;

import picocli.CommandLine;
import picocli.CommandLine.Parameters;
import picocli.CommandLine.Option;
import picocli.CommandLine.Command;

import java.io.File;

@Command(name = "DNAnalyzer", mixinStandardHelpOptions = true, description = "A program to analyze DNA sequences.")
public class ArgumentParser {
    public static class Options {
        @Option(names = {"--gui"}, description = "Start in GUI mode")
        Boolean startGUI = false;

        @Option(names = {"--amino"}, description = "The amino acid representing the start of a gene.")
        String aminoAcid;

        @Option(names = {"--min"}, description = "The minimum count of the reading frame.")
        int minCount = 0;

        @Option(names = {"--max"}, description = "The maximum count of the reading frame.")
        int maxCount = 0;

        @Option(names = {"--dna"}, description = "The FASTA file to be analyzed.")
        File dnaFile = new File("C:\\Users\\Archontis\\Desktop\\test.fasta");

        @Option(names = {"--find"}, description = "The DNA sequence to be found within the FASTA file.")
        File proteinFile;

        @Option(names = {"--reverse", "-r"}, description = "Reverse the DNA sequence before processing.")
        boolean reverse;
    }


    public Options parse(String[] arguments) {
        Options options = new Options();
        CommandLine commandLine = new CommandLine(options);
        commandLine.parse(arguments);
        return options;
    }
}
