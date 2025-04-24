package david1_p;

import java.util.Scanner;

public class CalculateTryCatchFinally {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
            try {
                System.out.print("첫번째 숫자 입력: ");
                int num1 = sc.nextInt();

                System.out.print("사칙연산(+,-,*,/)를 입력: ");
                char op = sc.next().charAt(0);

                System.out.print("두번째 숫자 입력: ");
                int num2 = sc.nextInt();

                int result = 0;

                switch (op) {
                    case '+':
                        result = num1 + num2;
                        break;
                    case '-':
                        result = num1 - num2;
                        break;
                    case '*':
                        result = num1 * num2;
                        break;
                    case '/':
                        result = num1 / num2;
                        break;
                    default:
                        System.out.println("계산 불가!");
                        return;
                }
                System.out.println("결과: " + result);
            } catch (ArithmeticException e) {
                System.out.println("예외 발생! 0으로 나눌 수 없습니다.");
            } catch (Exception e) {
                System.out.println("예외 발생! 입력 잘못했어!");
            } finally {
                sc.close();
                System.out.println("종료!");
            }
    }
}
