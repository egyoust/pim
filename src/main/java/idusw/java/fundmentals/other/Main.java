package idusw.java.other;

public class Main {
    public String method1() { // 메소드 : 객체가 생성된 후 사용 가능함 ( 객체가 생성된다는 것은 메모리에 적재된다는 것)
        method2();
        return "first";
    }
    public String method2() {
        method3();
        return "second";
    }
    public String method3() {
        return "third";
    }
    public static void main(String[] args) { // main 메소드 - static 메소드
        Main m = new Main(); // Main이라는 클래스로 부터 객체를 생성함(Heap 영역에 적재), m 이라는 참조변수에 배정
        // m은 stack 저장됨, 4byte, 객체의 참조 정보(주소)를 가짐
        m.method1();

        // localization : Notification은 설치 하지 말 것
        System.out.println("안녕하세요 Edit Custom VM Options > -Dfile.encoding=UTF-8");
        {
            int k = 0; // 7 ~ 17
            var l = "10"; // 자료형의 불일치로 인한 오류
            var n = 10;
            {
                int i = 10; // 9 ~ 14
                int j = 100;
                System.out.println(i + j);
                System.out.println(k);
            }
            // System.out.println(i + j);
            System.out.println(k);
        }
    }
}