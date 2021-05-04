package core.basesyntax.service.impl;

import core.basesyntax.model.dto.FruitRecordDto;
import core.basesyntax.service.FileWriterInterface;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class FileWriterImpl implements FileWriterInterface {

    @Override
    public void writeToFile(String inputData, String fileName) {
        File file = new File(fileName);
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(file))) {
            writer.write(inputData);
        } catch (IOException e) {
            throw new RuntimeException("Can't write to file" + fileName, e);
        }
    }
}
