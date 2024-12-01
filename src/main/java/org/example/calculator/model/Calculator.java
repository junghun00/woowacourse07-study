package org.example.calculator.model;

import java.util.List;

public class Calculator {
    private final List<String> numbers;
    private int total;

    public Calculator(List<String> numbers) {
        validate(numbers);
        this.numbers = numbers;
    }

    private void validate(List<String> numbers) {
        for (String digit : numbers) {
            if (digit.isEmpty()) {
                continue;
            }

            if (!digit.matches("\\d+")) {
                throw new IllegalArgumentException("입력 값이 올바르지 않습니다.");
            }
        }
    }

    public int add() {
        for (String number : numbers) {
            if (number.isEmpty()) {
                continue;
            }
            total += Integer.parseInt(number);
        }

        return total;
    }

    public int getTotal() {
        return total;
    }
}
