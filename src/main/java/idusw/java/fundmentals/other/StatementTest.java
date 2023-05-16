package idusw.java.fundmentals.other;

class StatementTest {
    public static final double PI = 3.141592; // PI : 상수 변수 (대문자를 사용함), 3.141592 : 실수 리터럴
    public static double noFinal = 3.141592; // noFinal : 변수, 3.141592 : 실수 리터럴

    public static void main(String[] args) {
        // PI = 3.14;   // final은 수정 불가
        // noFinal = 3.14;

        int i = Integer.MAX_VALUE;
        i = i + 1;
        System.out.println(i);

        float f1 = 214.15921f * 1000000000;
        float f2 = 214.15922f * 1000000000;
        int k = 2141592101; // 21415922202
        boolean b = true; // 1;
        System.out.println(f1 + " : " + f2);
        IfStatement ifStmt1 = new IfStatement(10, 5);
        IfStatement ifStmt2 = new IfStatement(10, 20);
        ifStmt1.printIfTest();

        ifStmt2.printIfTest();

    }
}

class IfStatement {
    private int i; // 인스턴스, private 접근 수정자를 사용하는 경우가 많음
    private int j;
    public IfStatement(int i, int j) { // 객체 초기화 시 i, j 값이 결정됨
        this.i = i; // i는 매개변수, this.i 는 인스턴스(현재 클래스로 부터 생성된 객체) 변수
        this.j = j;
    }
    public void printIfTest() {
        System.out.println(StatementTest.PI);
        if(j <= i)
            System.out.println(i + "와 " + j + "를 비교했을 때 큰 것은 " + i);
        else
            System.out.println(i + "와 " + j + "를 비교했을 때 큰 것은 " + j);
    }
}
