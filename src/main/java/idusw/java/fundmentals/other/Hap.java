package idusw.java.fundmentals.other;

public class Hap {
    private int from, to; // 필드, 인스턴스 변수, 속성(자료구조) : private 인 경우 외부 접근 불가능
    public Hap(int start, int end) { // 생성자 : 객체 초기화
        from = start;
        to = end;
    }
    public int sum() { // 메소드, 객체의 기능
        return (from + to) * (to - from + 1) / 2;
    }

}
