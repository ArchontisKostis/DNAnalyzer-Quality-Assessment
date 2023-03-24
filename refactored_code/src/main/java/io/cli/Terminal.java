package io.cli;

import analysis.AnalysisResult;
import model.codon.CodonFrame;
import model.ReadingFrames;
import model.aminoAcid.AminoAcid;
import model.aminoAcid.AminoAcidFactory;
import model.protein.Protein;

import java.io.IOException;
import java.util.List;
import java.util.Map;

public class Terminal {
    private static final String CLEAR_COMMAND_WINDOWS = "cmd /c cls";
    private static final String CLEAR_COMMAND_MAC_LINUX = "\u001b[H\u001b[2J";
    private static Terminal instance;
    private String operatingSystem;
    private ResultPrinter resultPrinter;

    private Terminal() {
        this.operatingSystem = System.getProperty("os.name");
        this.resultPrinter = new ResultPrinter();
    }

    public static Terminal getInstance() {
        if (instance == null)
            instance = new Terminal();
        return instance;
    }

    public void printError(String message) {
        System.out.println("DNAnalyzer encountered a fatal Error. The program will now close..." + System.lineSeparator());
        System.out.println("ERROR MESSAGE: " + message + System.lineSeparator());
        System.exit(0);
    }

    public void clear() throws IOException, InterruptedException {
        if(operatingSystem.contains("Windows"))
            clearForWindows();
        else
            clearForMacLinux();
    }

    public void printLine(String textToPrint) {
        System.out.println(textToPrint);
    }

    private void clearForWindows() throws IOException, InterruptedException{
        Runtime.getRuntime().exec(CLEAR_COMMAND_WINDOWS).waitFor();
    }

    private void clearForMacLinux() {
        System.out.println(CLEAR_COMMAND_MAC_LINUX);
        System.out.flush();
    }

    public void printAnalysisResults(AnalysisResult results) {
        this.resultPrinter.setResult(results);

        this.resultPrinter.printProteinAnalysis();
        this.resultPrinter.printHighCoverageAreas();
        this.resultPrinter.printLongestProtein();
        this.resultPrinter.printReadingFrames();
        this.resultPrinter.printProteinSequenceResults();
        this.resultPrinter.printRandomDnaInfo();
    }
}
