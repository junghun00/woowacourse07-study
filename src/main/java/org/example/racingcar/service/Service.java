package org.example.racingcar.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.example.racingcar.model.Car;

public class Service {
    public List<Car> parseName(String name) {
        List<String> names = Arrays.asList(name.trim().split(","));
        return createCar(names);
    }

    private List<Car> createCar(List<String> names) {
        List<Car> cars = new ArrayList<>();

        for (String name : names) {
            cars.add(new Car(name));
        }
        return cars;
    }

    public int parseTryCount(String tryCount) {
        try {
            return Integer.parseInt(tryCount);
        } catch (NumberFormatException e) {
            System.out.println("숫자만 입력해 주세요.");
        }
        return 0;
    }
}
