import java.util.Scanner;


public class ex1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the first number: ");
        if (args.length != 3) {
            System.out.println("다시 입력하세요!");
            System.exit(0);
        }

        int num1 = Integer.parseInt(args[0]);
        char op = args[1].charAt(0);
        int num2 = Integer.parseInt(args[2]);
        int result = 0;

        switch (op) {
            case '+':
                result = (int) num1 + num2;
                break;
            case '-':
                result = (int) num1 - num2;
                break;
            case '*':
                result = (int) num1 * num2;
                break;
            case '/':
                result = (int) num1 / num2;
                break;
            default:
                System.out.println("계산 불가! ");
        }
        System.out.println("결과:"+result);
    }
}