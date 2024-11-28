package org.example.racingcar;

import org.example.racingcar.controller.Controller;
import org.example.racingcar.service.Service;
import org.example.racingcar.view.InputView;
import org.example.racingcar.view.OutputView;

public class RacingcarMain {
    public static void main(String[] args) {
        Controller controller = new Controller(new InputView(), new OutputView(), new Service());
        controller.run();
    }
}
