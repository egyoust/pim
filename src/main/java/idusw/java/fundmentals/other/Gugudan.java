package idusw.java.fundmentals.other;

public class Gugudan {
    // 인스턴스(클래스로부터 실체화된 객체) 변수
    int from = 2;
    int row = 9;
    static final int COLUMN = 9; // 정적 상수 변수 : 프로그램이 실행 시부터 접근 가능(static 메모리 상주), 수정 불가(final)
    public void printSingle(int r) { // 지정한 단만 출력 : (인스턴스) 메소드
        for(int i = 1; i <= COLUMN; i++) // i : 지역 변수
            System.out.println(r + " * "  + i + " = " + (r * i));
    }
    public void printMultiple(int start, int end) {
        for (int i = start; i <= end; i++) {
            if((i % 3) == 0) // i가 3인 경우 나머지는 1, 0이 아니므로 배수가 아님 , % 연산자가 == 연산자보다 우선순위 높음
                printSingle(i);
            else
                System.out.println(i + "는 3의 배수 아님");
        }
    }
    public static void main(String[] args) { // 정적(static) 메소드
        // System.out.println(COLUMN);
        Gugudan gugudan = new Gugudan(); // 메모리에 객체가 존재함, printSingle(), printMultiple() 코드 영역에 존재
        gugudan.printMultiple(2, 9);
    }
}
