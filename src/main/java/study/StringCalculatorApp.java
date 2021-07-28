package study;

import java.util.Scanner;

public class StringCalculatorApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("첫 번째 입력 값 : ");
        int first = scanner.nextInt();
        System.out.println(first);
        System.out.println("사칙 연산 기호 : ");
        String symbol = scanner.next();
        System.out.println("두 번째 입력 값 : ");
        int second = scanner.nextInt();
        System.out.println(second);

        if ("+".equals(symbol)) {
            System.out.println("덧셈 : " + (first + second));
        } else if ("-".equals(symbol)) {
            System.out.println("뺄셈 : " + (first - second));
        } else if ("*".equals(symbol)) {
            System.out.println("곱셈 : " + (first * second));
        } else if ("/".equals(symbol)) {
            System.out.println("나눗셈 : " + (first / second));
        } else {
            System.out.println("사칙 연산 기호가 아닙니다.");
        }
        
//        StringCalculator stringCalculator = new StringCalculator();
//        stringCalculator.run();
    }
}
