package core.basesyntax.service;

import core.basesyntax.model.Fruit;

import java.util.Map;

public interface ReportMakerInterface {
    String createReport(Map<Fruit, Integer> fruits);
}
