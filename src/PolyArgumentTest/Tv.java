package PolyArgumentTest;

class Tv extends Product {
    Tv() {
        // 조상클래스의 생성자 Product(int price)를 호출한다.
        super(100); // tv 가격을 100만원으로 한다.
    }
    //Object 클래스의 toString()을 오버라이딩한다.
    public String toString() {return "Tv";}
}
