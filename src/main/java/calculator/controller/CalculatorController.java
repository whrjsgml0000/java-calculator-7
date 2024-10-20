package calculator.controller;

import calculator.service.CalculatorService;
import camp.nextstep.edu.missionutils.Console;

public class CalculatorController {
    private final CalculatorService calculatorService;

    public CalculatorController() {
        this.calculatorService = new CalculatorService();
    }

    public void input() {
        System.out.println("덧셈할 문자열을 입력해 주세요.");
        String s = Console.readLine();
        output(s);
    }

    private void output(String s) {
        int sum = calculatorService.add(s);
        System.out.println("결과 : " + sum);
    }

}
