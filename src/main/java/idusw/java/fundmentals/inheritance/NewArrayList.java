package idusw.java.inheritance;

public class NewArrayList<E> extends MyArrayList<E> {
    // < > 는 제너릭(generic) : 컴파일 시점에 타입 체크하여 오류 발생을 방지
    // final 클래스는 정의한 개발자가 수정 불가(상속 불가)로 정의한 클래스
    // 상속은 가져오는 것이 아닌 Super Class를 정의한 개발자가 허용한 것을 사용할 수 있음을 의미함
    public void whoAmI() { // ArrayList 클래스를 상속 받고, 메소드를 추가하여 기능을 추가함, overriding
        System.out.println("I'm NewArrayList ");
    }

    void whoAmI2() { // ArrayList 클래스를 상속 받고, 메소드를 추가하여 기능을 추가함, overriding
        System.out.println("I'm NewArrayList 2 ");
    }
}
