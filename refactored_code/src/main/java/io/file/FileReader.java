package io.file;

import model.dna.DNA;

import java.io.File;

public interface FileReader {
    DNA read(File file);
}
