package core.basesyntax.service;

import core.basesyntax.model.dto.FruitRecordDto;
import core.basesyntax.service.impl.FruitRecordParserImpl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface OperationHandler {
    int apply(FruitRecordDto fruitRecordDto);
    //boolean isApplicable(String operationType);

    /**
     * Feel free to remove this class and create your own.
     */
    class Main {
        public static void main(String[] args) {
            FruitRecordParser fruitRecordParser = new FruitRecordParserImpl();
            List<FruitRecordDto> dtos = fruitRecordParser.parse(List.of(
                    "C:\\Users\\Админ\\IdeaProjects\\jv-fruit-shop.git\\src\\main\\java\\core\\basesyntax\\test"));
            Map<String, OperationHandler> handlers = new HashMap<>();
            for (FruitRecordDto fruitRecordDto : dtos) {
                handlers.get(fruitRecordDto.getOperationType()).apply(fruitRecordDto);
            }
        }


    }
}
