package idusw.java.fundmentals.oop;

import java.util.Scanner;

public class MenuTest {
    public static void main(String[] args) {
        // 등록된 계정 정보
        String rootID = "root";
        String rootPW = "cometrue";
        String userID = "dream";
        String userPW = "cometrue";
        boolean login = false; // 로그인에 성공하면 true, 로그인 안된 상태명 false;

        UserMenu userMenu = new AdminMenu(); //new UserMenu();

        //참조변수를 통해 객체와 상호작용
        Scanner sc = new Scanner(System.in);
        // 키보드 입력을 받고, 공백문자(\n, \t, '')로 구분하여 어휘를 반환해주는 클래스
        userMenu.showMenu(login);
        System.out.println("아이디 : ");
        String id = sc.next();
        System.out.println("암호 : ");
        String pw = sc.next();
        if(id.equals(rootID) && pw.equals(rootPW)) { // == : 동등 연산자, 객체가 같은지 비교, equals : 값이 같은지 비교
            login = true;
            userMenu.showMenu(login);
        }
        else
            userMenu.showMenu(login);

    }
}
