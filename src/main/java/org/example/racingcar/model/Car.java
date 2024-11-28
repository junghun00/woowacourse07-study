package org.example.racingcar.model;

public class Car {
    private final String name;
    private int moveCount;

    public Car(String name) {
        validate(name);
        this.name = name;
    }

    public void move() {
        moveCount++;
    }

    private void validate(String name) {
        checklenght(name);
        checkLetterOrDigit(name);
    }

    private void checklenght(String name) {
        if (name.length() > 5) {
            throw new IllegalArgumentException("5글자 이내로 작성해야 합니다.");

        }
    }

    private void checkLetterOrDigit(String name) {
        for (char c : name.toCharArray()) {
            if (!(Character.isLetter(c) || Character.isDigit(c))) {
                throw new IllegalArgumentException("특수문자를 포함할 수 없습니다.");
            }
        }
    }

    public String getName() {
        return name;
    }

    public int getMoveCount() {
        return moveCount;
    }
}
