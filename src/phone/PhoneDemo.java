package phone;

/**
 * 실행용 클래스 = 실행하기 위한 클래스 = main 메서드가 있다
 */
public class PhoneDemo {
    public static void main(String[] args) { // 객체지향 세상
        Person songa = new Person("손가");
        ApplePhone iPhone12mini = new ApplePhone("iPhone12mini");

        songa.buy(iPhone12mini); //"아이폰220");
        songa.sayJarang();
        // 여러분 객체 등장! buy() 까지
        Person youngmun = new Person("영문");
        ApplePhone galaxy26 = new ApplePhone("갤럭시26");
        youngmun.buy(galaxy26); // 16번줄을 각주로 바꾸면, null이라는 결과값이 나옴!
        youngmun.sayJarang();
        // 객체 지향세상(main)에서 사람 객체, 애플폰 객체생성
        // 사람 객체는 애플폰 객체를 살 수 있다. = 가질 수 있다.
        // 그래서 자랑할때는 내가 가진 폰을 자랑했다.
    }
}
