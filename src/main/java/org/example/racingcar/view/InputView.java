package org.example.racingcar.view;

import java.util.Scanner;

public class InputView {

    public String inputName() {
        System.out.println("경주할 자동차 이름 (이름은 쉼표(,) 기준으로 구분)");
        return new Scanner(System.in).nextLine();
    }

    public String inputTryCount() {
        System.out.println("시도할 횟수는 몇 회인가요?");
        return new Scanner(System.in).nextLine();
    }
}
