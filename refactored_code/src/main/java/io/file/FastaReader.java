package io.file;
import io.cli.Terminal;
import model.dna.DNA;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

public class FastaReader implements FileReader{

    @Override
    public DNA read(File file) {
        String sequence = "";
        try {
            sequence = Files.readString(file.toPath()).replace("\n", "").toLowerCase();
        } catch (IOException e) {
            Terminal.getInstance().printError("There was an error reading the Files...");
        }
        return new DNA(sequence);
    }
}
