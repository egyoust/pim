package idusw.java.inheritance;

import java.lang.String; // 기본 패키지 : java.lang.*, import 필요 없음
import java.util.ArrayList; // import : 현재 클래스와 다른 패키지에 위치한 클래스에 대한 정보 제공
import java.util.Collections;
import java.util.List;

public class InheritanceTest {
    public static void main(String[] args) {
        // JCF : Java Collection Framework, 집합 개체들을 효율적으로 다루기 위한 프레임워크(클래스 라이브러리 모음)
        // java.util 패키지에 포함되어 있음

        List<String> list = new ArrayList<>();

        MyArrayList<String> stringArrayList = new MyArrayList<>();
        list = (List) stringArrayList; // upcasting : sub -> super class, 명시/묵시 모두 가능
        //((MyArrayList<String>)list).printMsg(); // private method

        list.add("a");
        list.add("b");
        list.add("d");
        list.add("e");
        list.add("c");

        List<String> newArrayList = new NewArrayList<>();
        // arrayList.whoAmI();
        // ((MyArrayList<String>)newArrayList).whoAmI2();
        list = newArrayList;
        ((NewArrayList<String>) list).whoAmI2();
        // downcasting : super -> sub , 명시적이어야 함

        // for each statement 사용, for 문도 가능
        for(String s : stringArrayList)
            System.out.printf("%4s", s); // print or println() 문을 선호함
        System.out.println("\n Sorting ");

        Collections.sort(stringArrayList);
        for(String s : stringArrayList)
            System.out.printf("%4s", s); // print or println() 문을 선호함

        System.out.println("\n SubList ");
        List<String> temp = stringArrayList.subList(2, 3); // List 인터페이스를 구현한 클래스 중 하나가 ArrayList임
        for(String s : temp)
            System.out.printf("%4s", s); // print or println() 문을 선호함
    }
}
