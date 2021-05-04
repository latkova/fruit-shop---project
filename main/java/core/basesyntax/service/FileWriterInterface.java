package core.basesyntax.service;

import core.basesyntax.model.dto.FruitRecordDto;

import java.util.List;

public interface FileWriterInterface {
    void writeToFile (String inputData, String fileName);
}
