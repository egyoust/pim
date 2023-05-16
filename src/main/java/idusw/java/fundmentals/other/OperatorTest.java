package idusw.java.fundmentals.other;

import java.math.BigDecimal;

public class OperatorTest {
    public static void main(String[] args) {
        Operator operator = new Operator();
        //operator.printValue();
        operator.printValueByShift();
        operator.printList();
        operator.printGaussian();
    }
}

class Operator {
    int base = 4;
    int multiple = 10; // 2의 10제곱을 의미함
    public void printValue() {
        int result = 1;
        for (int i = 1; i <= multiple; i++) // 제어 변수 비교시 변수를 사용하여서 수정이 용이함
            result = result * base;
        System.out.println(base + "의 " + multiple + "제곱 값은 : " + result);
    }
    public void printValueByShift() {
        int result = (base / 2) << multiple;
        // shift : 2진법 연산, 비트 연산, 왼쪽으로 한비트씩 이동
        // 0000 0100 << 1 -> 0000 1000 으로 쉬프트 연산, 2를 곱한 효과
        System.out.println(base + "의 " + multiple + "2배씩 반복한 값은 : " + result);
        double doubleVar1 = 1.0;
        double doubleVar2= 0.9;
        double diff = doubleVar1 - doubleVar2;
        System.out.println(diff);

        BigDecimal bd1 = new BigDecimal(doubleVar1);
        BigDecimal bd2 = new BigDecimal(doubleVar2);
        BigDecimal bdDiff = new BigDecimal(0.0);
        bdDiff = bd1.subtract(bd2); // 좀 더 정확한 값(더 많은 유효숫자)을 구할 수 있다.
        System.out.println(bdDiff.toString());

    }
    public void printList() { // 1 ~ 100의 합을 출력
        int from, to, result = 0;
        from = 1;
        to = 100000;
        long s = System.nanoTime(); // 1 / 1,000,000,000
        for(int i = from; i <= to; i++) // i : 제어변수 초기화 -> 조건 확인 [-> 제어변수 수정 -> 조건 확인]
            result = result + i;
        long e = System.nanoTime();
        System.out.println(result + ":" + (e - s));
    }
    public void printGaussian() {
        int from, to, result = 0;
        from = 1;
        to = 100000;
        long s = System.nanoTime();
        result = (from + to) * (to - from + 1) / 2;
        long e = System.nanoTime();
        System.out.println(result + ":" + (e - s));
    }
}
