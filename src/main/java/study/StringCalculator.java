package study;

import java.util.Scanner;

public class StringCalculator {

    public void run() {
        String value = InputView.getUserInput();
        String[] values = value.split(" ");
        int result = Integer.parseInt(values[0]);

        for (int i = 1; i < values.length - 1; i++) {
            if (i % 2 == 1) {
                if ("+".equals(values[i])) {
                    result += Integer.parseInt(values[i + 1]);
                }
                if ("-".equals(values[i])) {
                    result -= Integer.parseInt(values[i + 1]);
                }
                if ("*".equals(values[i])) {
                    result *= Integer.parseInt(values[i + 1]);
                }
                if ("/".equals(values[i])) {
                    result /= Integer.parseInt(values[i + 1]);
                }
            }
        }
        System.out.println(result);

    }
}
