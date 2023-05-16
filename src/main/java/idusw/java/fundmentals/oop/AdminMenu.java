package idusw.java.fundmentals.oop;

public class AdminMenu extends UserMenu { // 상속 : inheritance - 중첩(overloading), 재정의(overring), 메소드 추가

    @Override
    public void loginMenu() { // method overriding : 재정의 - 메소드 시그니처가 모두 같음
        System.out.println("2.로그아웃 3.등록 4.수정 5.삭제 6.회원목록 7.회원정지");
    }
    // Overloading
    public void loginMenu(String str) { // method overloading : 중첩 - 메소드 이름만 같고, 매개변수 타입, 갯수 다름
        System.out.println("2.로그아웃 6.회원목록 7.회원정지");
    }
    public void customMethod() {
        System.out.println("커스톰 메소드 추가");
    }
}
