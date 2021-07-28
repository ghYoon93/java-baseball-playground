package study;

import java.util.Scanner;

public class InputView {
    private final static Scanner scanner = new Scanner(System.in);
    
    public static String getUserInput() {
        System.out.println("계산 값 입력:");
        return scanner.nextLine();
    }
}
