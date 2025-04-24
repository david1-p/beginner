package star;

import java.util.Scanner;

class StrCalc {
    private String[] splited;   // input받은 문자열을 분리해놓은 배열
    private int[] splitedInt;   // splited배열을 int형으로 바꾼 배열 (기호자리는 그냥 0)

    StrCalc(String input) {
        verifyInput(input);   // 입력값 확인(비어있는지)
        splited = input.split(" ");   // 받은 문자열을 공백을 기준으로 분리해서 splited배열을 초기화한다.
        changeToInt();   // splited배열을 이용해 splitedInt배열을 초기화한다.
    }

    void verifyInput(String input) {
        if(input==null || input.trim().equals(""))   // 스페이스바 여러번 누른 경우도 예외발생하도록..
            throw new IllegalArgumentException("입력해주세요.");
    }

    void changeToInt() {
        splitedInt = new int[splited.length];
        for (int i = 0; i < splitedInt.length; i+=2) {
            splitedInt[i] = Integer.parseInt(splited[i]);
        }
    }

    int calculate() {
        for(int i=1; i<splited.length; i+=2) {  // i는 '기호있는 인덱스'를 의미
            checkSymbol(splited[i], i);
        }
        return splitedInt[splited.length-1];  // 최종결과인 <배열의 마지막값>을 결과로 반환한다.
    }

    void checkSymbol(String symbol, int idx) {   // 기호를 체크해서 해당하는 사칙연산으로 보내준다.
        switch(symbol) {
            case "+": add(idx); break;
            case "-": subtract(idx); break;
            case "*": multiply(idx); break;
            case "/": divide(idx); break;
            default: throw new IllegalArgumentException("사칙연산 기호가 아닙니다.");
        }
    }

    // 기호의 앞뒤 숫자들을 이용해 해당 사칙연산을 수행하고, 뒷숫자에 그 결과를 저장한다.
    void add(int idx) {
        splitedInt[idx+1] += splitedInt[idx-1];
    }
    void subtract(int idx) {
        splitedInt[idx+1] = splitedInt[idx-1] - splitedInt[idx+1];
    }
    void multiply(int idx) {
        splitedInt[idx+1] *= splitedInt[idx-1];
    }
    void divide(int idx) {
        if(splitedInt[idx+1] == 0)
            throw new ArithmeticException("0으로 나눌 수 없습니다.");
        splitedInt[idx+1] = splitedInt[idx-1]/splitedInt[idx+1];
    }
}

class StrCalcTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("== 문자열 사칙연산 계산기 ==");
        System.out.print("입력: ");
        String input = sc.nextLine();
        StrCalc calc = new StrCalc(input);
        System.out.printf("결과: "+calc.calculate());
    }
}