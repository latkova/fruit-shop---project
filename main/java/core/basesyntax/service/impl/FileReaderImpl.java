package core.basesyntax.service.impl;

import core.basesyntax.service.FileReaderInterface;

import java.io.BufferedReader;
import java.io.File;
import java.util.List;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderImpl implements FileReaderInterface {
        List<String> records;

    @Override
    public List<String> readFromFile(String fileName) {
        File file = new File(fileName);
        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = reader.readLine()) != null) {
                records.add(line);
            }
        } catch (IOException e) {
            throw new RuntimeException("Can't read data from file" + fileName, e);
        }
        return records;
    }
}
