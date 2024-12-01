package org.example.calculator.service;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Service {
    public List<String> parseData(String inputString) {
        if (isCustomDelimiter(inputString)) {
            char custom = inputString.charAt(2);

            return splitToList(inputString.substring(5).replace(custom, ','));
        }

        return splitToList(inputString);
    }

    private List<String> splitToList(String inputString) {
        if (inputString == null || inputString.isEmpty()) {
            return List.of();
        }
        return Arrays.stream(inputString.split("[,:]"))
                .map(String::trim)
                .collect(Collectors.toList());

    }

    private boolean isCustomDelimiter(String inputString) {
        if (inputString.startsWith("//")) {
            if (inputString.indexOf("\\n", 2) == 3) {
                return true;
            }

            throw new IllegalArgumentException("커스텀 구분자는 한 개만 작성해 주세요.");
        }

        return false;
    }
}
