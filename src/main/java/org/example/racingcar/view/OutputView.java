package org.example.racingcar.view;

import java.util.List;
import org.example.racingcar.model.Car;


public class OutputView {
    public void moveMessage(List<Car> cars) {
        System.out.println("실행 결과");

        for (Car car : cars) {
            System.out.println(car.getName() +
                    " : " +
                    "-".repeat(car.getMoveCount()));
        }
        System.out.println();
    }

    public void printWinner(List<String> winners) {
        System.out.print("최종 우승자 : ");
        System.out.println(String.join(", ", winners));
    }
}