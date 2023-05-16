package idusw.java.fundmentals.inheritance;

import java.util.ArrayList;
import java.util.List;

public class MyArrayList<E> extends ArrayList<E> {
    public void whoAmI() { // ArrayList 클래스를 상속 받고, 메소드를 추가하여 기능을 추가함
        System.out.println("I'm MyArrayList Class extended ArrayList");
    }
    // Overriding 을 하지 않을 경우 기존 클래스에 정의된 메소드들을 상속 받음

    // 상위 클래스인 ArrayList의 subList() 를 재정의(overriding) vs. overloading(중첩 : 메소드 이름만 같은 메소드 정의)
    @Override
    public List<E> subList(int fromIndex, int toIndex) { // <= subList(2, 4) : 2번째, 3번째 인덱스에 해당되는 요소를 가져옴
        this.printMsg(); // printMsg() 상속관계 상에 나타날 수도 있는 경우
        return super.subList(fromIndex, toIndex + 1); // 상위 클래스의 생성자가 먼저 호출되어야 한다
    }
    private void printMsg() {
        System.out.println("private method");
    }
}
