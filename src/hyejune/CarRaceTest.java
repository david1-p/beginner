package hyejune;

import java.util.*;

class CarRace {
    private Car[] cars;
    private final int TOTAL_MOVES;
    private DashPrinter printer;

    CarRace(int totalCars, int totalMoves) {
        cars = new Car[totalCars];    // totalCars 크기의 Car배열을 초기화한다.
        for(int i=0; i<totalCars; i++) {
            cars[i] = new Car();
        }
        TOTAL_MOVES = totalMoves;     // 총 이동횟수
    }

    public void startRace() {
        for(int i=0; i<TOTAL_MOVES; i++) {         // 총 횟수동안
            for(int j=0; j<cars.length; j++) {      // 자동차별로
                cars[j].moveOrNot();                 // 이동할 것인지 구하고
                int moveNum = cars[j].getMoveNum();  // 이동횟수를 받아와서
                printer = new DashPrinter(moveNum);  // 출력해줄 프린터 인스턴스를 생성하고
                printer.printDash();                 // 출력하는 메서드를 호출한다.
            }
            System.out.println();
        }
    }
}

class Car {
    private int moveNum;   // 각 차의 이동(전진)횟수

    public int getMoveNum() {
        return moveNum;
    }

    void moveOrNot() {   // random값이 4 이상이면 이동횟수를 1 증가시킨다.
        Random rand = new Random();
        if(rand.nextInt(10)>=4)
            moveNum++;
    }
}

class DashPrinter {   // dashNum만큼 대쉬기호를 출력해주는 DashPrinter
    private int dashNum;

    DashPrinter(int dashNum) {
        this.dashNum = dashNum;
    }

    void printDash() {
        for(int i=0; i<dashNum; i++) {
            System.out.print('-');
        }
        System.out.println();
    }
}

class CarRaceTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("자동차 대수는 몇 대 인가요?");
        int totalCars = scanner.nextInt();
        System.out.println("시도할 회수는 몇 회 인가요?");
        int totalMoves = scanner.nextInt();
        CarRace carRace = new CarRace(totalCars, totalMoves);
        System.out.printf("%n실행 결과%n");
        carRace.startRace();
    }
}
