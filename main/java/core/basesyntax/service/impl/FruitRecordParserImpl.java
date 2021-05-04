package core.basesyntax.service.impl;

import core.basesyntax.model.dto.FruitRecordDto;
import core.basesyntax.service.FruitRecordParser;

import java.util.ArrayList;
import java.util.List;

public class FruitRecordParserImpl implements FruitRecordParser {
    private static final String DIVIDER = ",";

    @Override
    public List<FruitRecordDto> parse(List<String> input) {
        List<FruitRecordDto> output = new ArrayList<>();
        for (int i = 1; i < input.size(); i++) {
            String[] records = input.get(i).split(DIVIDER);
            FruitRecordDto recordDto = new FruitRecordDto(records[0], records[1],
                    Integer.parseInt(records[2]));
            output.add(recordDto);
        }
        return output;
    }
}
