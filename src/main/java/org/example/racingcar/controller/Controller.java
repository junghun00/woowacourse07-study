package org.example.racingcar.controller;

import java.util.List;
import org.example.racingcar.model.Car;
import org.example.racingcar.model.CarGame;
import org.example.racingcar.service.Service;
import org.example.racingcar.view.InputView;
import org.example.racingcar.view.OutputView;

public class Controller {
    private InputView inputView;
    private OutputView outputView;
    private Service service;

    public Controller(InputView inputView, OutputView outputView, Service service) {
        this.inputView = inputView;
        this.outputView = outputView;
        this.service = service;
    }

    public void run() {
        CarGame carGame = inputData();
        gamePlay(carGame);
        winner(carGame);
    }

    private void winner(CarGame carGame) {
        List<String> winners = carGame.getWinner();
        outputView.printWinner(winners);
    }


    private void gamePlay(CarGame carGame) {
        int tryCount = carGame.getTryCount();

        for (int i = 0; i < tryCount; i++) {
            carGame.play();
            outputView.moveMessage(carGame.getCars());
        }

    }

    private CarGame inputData() {
        List<Car> cars = inputName();
        int tryCount = inputTryCount();

        return new CarGame(cars, tryCount);
    }

    private List<Car> inputName() {
        String name = inputView.inputName();
        System.out.println();

        return service.parseName(name);
    }

    private int inputTryCount() {
        String tryCount = inputView.inputTryCount();
        System.out.println();

        return service.parseTryCount(tryCount);
    }

}
