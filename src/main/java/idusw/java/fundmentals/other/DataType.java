package idusw.java.other;

public class DataType {
    public void printDataType() {
        byte b = 10;
        b = Byte.MAX_VALUE; // 정적 상수 변수, 이탤릭, 대문자와 언더바로 표현됨
        short s = 128; // Short.MAX_VALUE
        s = Short.MAX_VALUE; // short 형에 저장할수 있는 최대값은 32767, 16bit 표현할 수 있는 값의 범위 -32768 ~ +32767
        int i = 32768;
        i = Integer.MIN_VALUE - 1; // Overflow : 표현 범위를 넘어서 값이 손상됨
        // Integer.MAX_VALUE = 2147483647 = 0x7fffffff ,  Integer.MIN_VALUE
        System.out.println(i);
        // Integer : int 자료형의 Wrapper Class 임. int 형을 효과적으로 다루기 위해 정의한 클래스,
        // 기본형 8가지에 대한 8개의 Wrapper Class가 존재함
        System.out.println("0x" + Integer.toHexString(200412000));
        System.out.println("0b" + Integer.toBinaryString(200412000));
    }
    public void printMessage() {
        int i = 10; // i 변수는 정수형을 보관할 수 있는 기억공간에 대한 식별자
        var j = "haha"; // var 타입 추론, Java SE 10 이후에 등장
        var k = 10.1;
        System.out.println(i + (j + k));
    }
    public void printCode() {
        int i = 10; // 4byte
        int j = 3;  // 4byte
        double d = 3.3; // 8byte
        System.out.println(i / j); // 3 : 정수형의 연산 결과는 정수
        System.out.println(i / d); // 3.33333333  i를 실수형으로 변환, 광역화 형변화 4byte int -> 8byte double
        d = (double) j; // 명시적 형변환, 광역화 형변환 (명시적으로 표현하는 것은 선택), 컴파일러
        j = (int) d; // 명시적 형병환, 협소화 형변화 (명시적으로 표현하는 것이 필수), 개발자

        char ch = 'A';
        i = ch; // char 는 2byte 문자형, 내부적으로 0 ~ 65535 로 매칭됨 2 -> 4byte 정수형으로 묵시적 형변환
        j = 70;
        ch = (char) j; // 협소화 형변화, 명시적 형변환, 개발자가 형변환해주어야 한다.

        /*
        boolean b = true;
        i = (int) b; // boolean 형은 형변환 금지
        b = (boolean) j;

         */
    }
    public static void main(String[] args) {
        // 객체를 생성하고 바로 메소드 호출, 익명 클래스라고 함 - 참조 변수가 없어서 다음에 참조할 수 없다.
        new DataType().printMessage();
        // 객체를 생성하고, dt 라는 참조변수에 배정, dt를 통해 객체를 활용할 수 있다.
        DataType dt = new DataType();
        dt.printMessage();
        dt.printCode();
        dt.printDataType();
    }
}
