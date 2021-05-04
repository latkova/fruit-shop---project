package core.basesyntax;

import core.basesyntax.model.dto.FruitRecordDto;
import core.basesyntax.service.FruitRecordParser;
import core.basesyntax.service.impl.FruitRecordParserImpl;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        FruitRecordParser fruitRecordParser = new FruitRecordParserImpl();
        List<FruitRecordDto> dtos = fruitRecordParser.parse(List.of("src/main/java/core/basesyntax/resources/fruitsFrom.csv"));
    }
}
