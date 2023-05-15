package idusw.java.pim;

import idusw.java.pim.controller.MemberController;
import idusw.java.pim.domain.Member;
import idusw.java.pim.service.MemberService;
import idusw.java.pim.service.MemberServiceImpl;
import idusw.java.pim.service.MemberServiceImplOther;

import java.util.Scanner;

public class PimApplication {
    public static void main(String[] args) {
        // 생성자로 객체를 주입
        MemberService memberService = new MemberServiceImplOther(); //new MemberServiceImpl(); //
        // 인터페이스 통한 객체를 주입하기 때문에 결합도가 낮음(loosely coupled), 교체가 용이함
        MemberController memberController = new MemberController(memberService); // 다형성(polymorphism)

        Scanner sc = new Scanner(System.in);

        System.out.println("0.종료, 1.등록, 2.로그인, 3.조회, 4.수정, 5.탈퇴, 8.목록조회, 9.로그아웃");
        int command = sc.nextInt();


        switch(command) {
            case 1:
                Member m = new Member();
                // 정보 전달 객체 입력
                memberController.registerRequest(m); break;
            case 8: memberController.listRequest(); break;
            default: break;
        }

    }
}
