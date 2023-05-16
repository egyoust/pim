package idusw.java.pims;

import java.util.Scanner;

public class NoMvcApplication {
    public static void main(String[] args) {
        NoMvcApplication noMvcApplication = new NoMvcApplication();
        int menu = 0;
        do {
            noMvcApplication.showMenu();
            Scanner sc = new Scanner(System.in);
            menu = sc.nextInt();
            switch (menu) {
                case 0:
                    System.out.println("종료 기능 호출");
                    break;
                case 1:
                    noMvcApplication.requestRegister();
                    break;
                case 2:
                    System.out.println("로그인 기능 호출");
                    break;
            }
        } while(menu != 0);

    }

    public void showMenu() { // view
        System.out.println("0.종료, 1.등록, 2.로그인");
    }
    public void requestRegister() { // service 로 이동 : 업무 처리
        System.out.println("등록 기능 호출");
    }
}
