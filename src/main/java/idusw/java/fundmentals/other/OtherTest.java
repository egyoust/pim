package idusw.java.fundmentals.other;

import idusw.java.fundmentals.inheritance.MyArrayList;

import java.util.List;

public class OtherTest {
    public static void main(String[] args) {
        List<String> list = new MyArrayList<>();
        ((MyArrayList) list).whoAmI(); // 패키지가 다른 경우 default 수정자는 접근 할 수 없다.

    }
}
