package david1_p;

import java.util.Scanner;

class Calculate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("첫번째 숫자 입력: ");
        int num1 = sc.nextInt();

        System.out.print("사칙연산(+,-,*,/)를 입력: ");
        char op = sc.next().charAt(0);

        System.out.print("두번째 숫자 입력: ");
        int num2 = sc.nextInt();

        int result = 0;
        boolean valid = true;

        switch (op) {
            case '+' :
                result = num1 + num2;
                break;
            case '-' :
                result = num1 - num2;
                break;
            case '*' :
                result = num1 * num2;
                break;
            case '/' :
                if (num2 == 0) {
                    System.out.println(" 0으로 나눌수 없습니다.");
                    valid = false;
                } else {
                    result = num1 / num2;
                }
                break;
            default:
                System.out.println("계산 불가!");
                valid = false;
        }
        if (valid) {
            System.out.println("결과: " + result);
        }
sc.close();


    /*
    float divide(int x, int y) { // 작업하기 전 나누는 수 y가 0인지 확인한다.
    if(y==0) {
    s.out.println("0으로 나눌 수 없다.")
    return 0; // 메서드 종료
    }
    return x / (int) y;
    }
    두번째 입력값이 0이 되면 안됨
    if(num2==0)z
    break;
 */
    }
}
