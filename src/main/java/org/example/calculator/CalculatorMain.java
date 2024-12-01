package org.example.calculator;

import org.example.calculator.controller.Controller;
import org.example.calculator.service.Service;
import org.example.calculator.view.InputView;
import org.example.calculator.view.OutputView;

public class CalculatorMain {
    public static void main(String[] args) {
        Controller controller = new Controller(new InputView(), new OutputView(), new Service());
        controller.run();
    }
}