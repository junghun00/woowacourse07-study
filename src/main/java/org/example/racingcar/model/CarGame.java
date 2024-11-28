package org.example.racingcar.model;

import java.util.ArrayList;
import java.util.List;
import org.example.racingcar.utils.RandomNumber;;

public class CarGame {
    private List<Car> cars;
    private int tryCount;

    public CarGame(List<Car> cars, int tryCount) {
        validate(tryCount);
        this.cars = cars;
        this.tryCount = tryCount;
    }

    private void validate(int tryCount) {
        if (!(tryCount >= 1)) {
            throw new IllegalArgumentException("1회 이상 시도해야 합니다.");
        }
    }

    public void play() {
        for (Car car : cars) {
            int number = RandomNumber.getRandomNumber();

            if (isMove(number)) {
                car.move();
            }
        }
    }

    private boolean isMove(int number) {
        return number >= 4;
    }

    public List<Car> getCars() {
        return cars;
    }

    public List<String> getWinner() {
        int maxMove = maxMove();
        List<String> winners = new ArrayList<>();

        for (Car car : getCars()) {
            if (maxMove == car.getMoveCount()) {
                winners.add(car.getName());
            }
        }

        return winners;
    }

    private int maxMove() {
        int maxMove = 0;

        for (Car car : getCars()) {
            maxMove = Math.max(maxMove, car.getMoveCount());
        }

        return maxMove;
    }

    public int getTryCount() {
        return tryCount;
    }
}