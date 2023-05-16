package idusw.java.pims.view;

import idusw.java.pims.model.Member;

import java.util.Scanner;

public class MemberRequestView {
    public void showMenu() {
        System.out.println("0.종료, 1.등록, 2.로그인, 3.조회, 4.수정, 5.탈퇴, 8.목록조회, 9.로그아웃");
    }
    public Member inputMember(Scanner sc) {
        Member m = new Member();
        System.out.println("입력 형식 : email, name, pw, phone, address");
        String input = sc.next();
        String[] stringList = input.split("\\s*,\\s*"); // ,를 구분자로 사용해서 문자열로 나눔
        m.setEmail(stringList[0]);
        m.setName(stringList[1]);
        m.setPw(stringList[2]);
        m.setPhone(stringList[3]);
        m.setAddress(stringList[4]);
        return m;
    }
}
