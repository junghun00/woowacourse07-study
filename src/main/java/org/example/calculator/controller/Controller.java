package org.example.calculator.controller;

import java.util.List;
import org.example.calculator.model.Calculator;
import org.example.calculator.service.Service;
import org.example.calculator.view.InputView;
import org.example.calculator.view.OutputView;

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
        List<String> parseStrings = inputDate();
        Calculator calculator = new Calculator(parseStrings);
        addString(calculator);
    }

    private void addString(Calculator calculator) {
        calculator.add();
        outputView.result(calculator);
    }

    private List<String> inputDate() {
        String inputString = inputView.inputDate();
        return service.parseData(inputString);
    }

}