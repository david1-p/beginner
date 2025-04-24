package david1_p;

// 1. 문자열 값에 따라 사칙연산 구현,
// 2. 입력 문자열의 숫자와 사칙연산 사이네는 빈공백 문자열 있다고 가정
// 3. 입력 순서대로 계산.
// 4. 2 + 3 * 4 / 2 -> 5 * 4 / 2 -> 10으로 출력
// 5. 문자열 사이는 공백문자 있다.
// 6. 들여쓰기 단계를 1단계로 줄인다. (이 말은 for이나 while문, swicth문 하나만 써서 구현하라)
// 7. else 사용 금지!
// 8. 기능 분리 힌트 (테스트 할 수 있는 단위로 나누어 구현 목록을 만든다.)
// 9. try-catch 써서
//      입력 값이 null or 공백 문자일 경우 IllegalArgumentException throw로 예외 만들기
//               사칙연산 기호가 아닌 경우 IllegalArgumentException throw로 예외 만들기
// 10. 공백 문자열을 빈 공백 문자로 분리하려면, String.split(" ") 메소드 활용!


/* 1. scanner로 받은 문자열을 저장
   2. 문자열에서 빈공백 문자열로 분리 string.split(" ") 사용
   3. 해당 문자열을 문자화해서 배열로 저장
      2 + 3 * 4 / 2 -> 2+3*4/2
   4. 숫자 op 숫자 형태로 저장할 것을
 */

public class NewCalculate {
    public static void main(String[] args) {
        System.out.println("2+3*4/2:" + 2+3*4/2);
        System.out.println("2+3:" + 2+3);
        System.out.println("5*4:" + 5*4);
        System.out.println("20/2:" + 20/2);
        // 앞쪽에서부터 조금씩 계산
    }
}
