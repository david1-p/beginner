package phone;

public class Person {
    String name;
    ApplePhone applePhone;

    String modelName;
    Person(String name) {
        this.name = name;
    }

//    public void buy(String modelName) { // 2) String name) {
//        // 난,, 손가가 아닌데,,, 어떻게 해결할까요?
//        // 1) String name = "songa";
//        // 영원히.. 아이폰12mini를 사야하는 운명
//        System.out.println(name + "가 " + modelName + "를 샀습니다.");
//        this.modelName = modelName; // 가진다 = 저장해둔다
//    }

    public void buy(ApplePhone applePhone) {
        //ApplePhone iPhone12mini = new ApplePhone(modelName);
        this.applePhone = applePhone; // 사람객체가 applephone을 산것!
        System.out.println(name + "가" + applePhone.modelName + "을 샀습니다."); // . : 애플폰~의! 모델명
    }
    // 자랑 메소드 : 출력 "나 modelName 폰 샀다!"
    public void sayJarang() { // ()위에서 ApplePhone = applePhone으로 저장해서 공통적으로 살수 있게 했음.
        System.out.println("name " + applePhone.modelName + "폰 샀다!");
    }
}