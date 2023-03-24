package controller;

import analysis.AnalysisResult;
import analysis.analyzers.Analyzer;
import io.cli.Terminal;
import io.file.FastaReader;
import analysis.Analysis;
import model.dna.DNA;

import java.io.File;
import java.io.IOException;

public class Controller implements Runnable{
    private ArgumentParser argumentParser;
    private ArgumentParser.Options options;
    private Terminal terminal;

    public Controller(String[] args) {
        argumentParser = new ArgumentParser();
        options = argumentParser.parse(args);
        terminal = Terminal.getInstance();
    }

    @Override
    public void run() {
        if(options.startGUI)
            startGUI();
        else
            startCLI();
    }

    private void startGUI() {
//        String[] args = new String[0];
//        DNAnalyzerGUI.launchIt(args);
    }

    private void startCLI() {
        terminal.printLine("DNAnalyzer Started Running...");

        Analysis analysis = startAnalysis();
        Analyzer analyzer = new Analyzer(analysis);

        analyzer.begin(options.reverse);
        analyzer.analyzeProteins();

        analyzer.searchForHighCoverageRegions();
        analyzer.configureReadingFrames(options.minCount, options.maxCount);
        analyzer.analyzeProteinSequence();
        analyzer.findLongestProtein();
        analyzer.checkForRandomDNA();

        AnalysisResult analysisResult =
                analyzer.getResult();

        terminal.printAnalysisResults(analysisResult);
    }

    private Analysis startAnalysis() {
        try {
            String protein = null;
            terminal.clear();

            FastaReader fastaReader = new FastaReader();
            DNA dna = fastaReader.read(options.dnaFile);

            if (options.proteinFile != null)
                protein = fastaReader.read(options.proteinFile)
                        .getSequence();

            Analysis analysis = new Analysis(dna, options.aminoAcid, protein);
            return analysis;
        } catch (IOException | InterruptedException e) {
            terminal.printError("There was an error reading the files...");
        }
        return null;
    }
}
