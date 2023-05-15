package idusw.java.oop;

public class UserMenu {
    public void showMenu(boolean login) {
        if(!login) // ! : not 연산자 login이 false경우 조건문은 true
            preLoginMenu();
        else
            loginMenu();
    }
    public void preLoginMenu() {
        System.out.println("0.종료 1.로그인");
    }
    public void loginMenu() {
        System.out.println("2.로그아웃 3.등록 4.수정 5.삭제");
    }
}
