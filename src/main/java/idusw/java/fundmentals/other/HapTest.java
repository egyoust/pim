package idusw.java.other;

import idusw.java.oop.ReverseArrayList;

public class HapTest {
    public static void main(String[] args) { // 프로그램의 시작점 : main() 메소드
        int start, end, total; // 지역 변수 - 메소드 안, 실행 블록 안에서 선언된 변수
        start = 1;
        end = 10000;
        total = 0;
        Hap hap = new Hap(start, end); // Hap 유형의 hap 객체 생성
        total = hap.sum(); // 상호 작용, 객체의 메소드 호출
        System.out.println(start + " 에서 " + end + " 까지의 합은 : " + total);
        ReverseArrayList<String> s = new ReverseArrayList<>();

    }
}
