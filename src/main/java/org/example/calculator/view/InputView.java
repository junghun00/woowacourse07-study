package org.example.calculator.view;

import java.util.Scanner;

public class InputView {

    public String inputDate() {
        System.out.println("덧셈할 문자열을 입력해 주세요.");
        return new Scanner(System.in).nextLine();
    }
}
