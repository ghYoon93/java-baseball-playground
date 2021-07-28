package baseball;

import java.util.*;

public class Baseball {
    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        play();
        end();
    }

    private static void end() {
        System.out.println("3 스트라이크");
        System.out.println("3개의 숫자를 모두 맞히셨습니다! 게임 종료");
        System.out.println("게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요.");
        String choice = scanner.nextLine();
        if ("1".equals(choice)) {
            play();
            end();
        }
    }

    private static void play() {
        // 컴퓨터 숫자 생성
        String com = generateNumbers();
        while (true) {
            // 숫자 입력
            System.out.print("숫자를 입력해주세요 : ");
            String input = scanner.nextLine();

            // 숫자 검사
            int ball = 0;
            int strike = 0;
            boolean[] check = new boolean[3];
            for (int i = 0; i < 3; i++) {
                if (input.charAt(i) == com.charAt(i)) {
                    strike++;
                    check[i] = true;
                }
            }
            if (strike == 3) {
                break;
            }
            for (int i = 0; i < 3; i++) {
                if (!check[i]) {
                    for (int j = 0; j < 3; j++) {
                        if (input.charAt(i) == com.charAt(j)) {
                            ball++;
                        }
                    }
                }
            }
            // 결과 출력
            StringBuilder result = new StringBuilder("");
            if (ball != 0) {
                result.append(ball + "볼 ");
            }
            if (strike != 0) {
                result.append(strike + "스트라이크");
            }
            if (Objects.equals(result, "")) {
                result.append("nothing");
            }
            System.out.println(result);
        }
    }

    private static String generateNumbers() {
        StringBuilder sb = new StringBuilder();
        Set<Integer> set = new HashSet<>();

        Random random = new Random();
        while(sb.length() < 3) {
            int number = random.nextInt(9) + 1;
            if (!set.contains(number)) {
                sb.append(number);
                set.add(number);
            }
        }
        return sb.toString();
    }
}
