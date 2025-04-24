package racing;

import java.util.Random;
import java.util.Scanner;

public class RacingGame {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("자동차 대수는 몇 대 인가요?");
        int carCount = scanner.nextInt();
        System.out.println("시도할 횟수는 몇 회 인가요?");
        int attemptCount = scanner.nextInt();

        int[] positions = new int[carCount];

        Random random = new Random();

        System.out.println("\n실행 결과");

        for (int round = 1; round <= attemptCount; round++) {
            for (int i = 0; i < carCount; i++) {
                int randomValue = random.nextInt(10);
                if (randomValue >= 4) {
                    positions[i]++;
                }
            }

            for (int i = 0; i < carCount; i++) {
                System.out.print("차량 " + (i + 1) + " : ");
                for (int j = 0; j < positions[i]; j++) {
                    System.out.print("-");
                }
                System.out.println();
            }
            System.out.println();
        }
        scanner.close();
    }
}
