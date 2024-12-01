package org.example.calculator.view;

import org.example.calculator.model.Calculator;

public class OutputView {
    public void result(Calculator calculator) {
        System.out.print("결과 : ");
        System.out.println(calculator.getTotal());
    }
}
