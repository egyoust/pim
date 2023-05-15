package idusw.java.other;

public class SwitchTest { // public class 이름과 파일 이름은 같아야 한다
    public static void main(String[] args) {
        IfTester it = new IfTester(); // 클래스로 정의로 부터 객체 생성(new), 참조변수(it)에 배정
        it.printTestingResult(7); // 객체의 메소드 호출(상호 작용)
        SwitchTester st = new SwitchTester();
        st.printTestingResult(Day.Thursday);
        st.printEnhancedSwitch();
        it.printTestingResult(10, 20);
        it.printTestingResult(30, 20);
    }
}

class SwitchTester {
    public void printEnhancedSwitch() {
        int var = 17;
        var animal = "독수리";
        String kind = switch(animal) { // yield, var : 예약어가 추가됨
            case "호랑이", "사자" -> "포유류";
            case "독수리", "참새" -> "조류";
            case "상어", "돌고래" -> "어류";
            default -> "동물류";
        };
        System.out.println(kind);
    }
    public void printTestingResult(Day day) {
        System.out.println("SwitchTester printTestingResult");
        switch (day) { // if ~ else if ~ else 구문으로 표현이 가능함, 정수형 (1.7이전), 문자열형, 열거형 (1.7이후),
            case Sunday:
                System.out.println("일요일");
                break;
            case Monday:
                System.out.println("월요일");
                break;
            case Tuesday:
                System.out.println("화요일");
                break;
            case Wednesday:
                System.out.println("수요일");
                break;
            case Thursday:
                System.out.println("목요일");
                break;
            case Friday:
                System.out.println("금요일");
                break;
            case Saturday:
                System.out.println("토요일");
                break;
            default:
                System.out.println("요일 정보 오류");
                break;
        }
    }
}

class IfTester {
    public void printTestingResult(int i, int j) {
        // 메소드 오버로딩(overloading) : 메소드 이름 같고, 매개변수 갯수, 매개변수 타입 다른 경우 -> 메소드 시그니쳐(서명)
        if(i > j)
            System.out.println(i + "는 " + j + "보다 크다");
        else
            System.out.println(i + "는 " + j + "보다 작거나 같다");
    }
    public void printTestingResult(int i) {
        System.out.println("IfTester printTestingResult");
        if((i % 2) == 0)
            System.out.print("2의 배수,");
        if((i % 3) == 0)
            System.out.print("3의 배수,");
        if((i % 5) == 0)
            System.out.print("5의 배수,");
        if((i % 2) != 0 && (i % 3) != 0 && (i % 5) != 0)
            System.out.print("2, 3, 5의 배수가 아님");
    }
}