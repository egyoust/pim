package idusw.java.pims.controller;

import idusw.java.pims.model.Member;
import idusw.java.pims.service.MemberService;
import idusw.java.pims.view.MemberRequestView;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class MemberController {
    // 메뉴, form 또는 URI로 요청(request)을 받아서 Service, Repository, Model 등을 활용하여 처리한 후
    // 응답(response)을 작성하고, 이를 view에게 전달
    public static List<Member> memberList = new ArrayList<>(); // 멤버 정보 리스르를 담고있는 객체
    public static MemberRequestView memberRequestView = new MemberRequestView();
    private MemberService memberService;
    public MemberController(MemberService memberService) {
        this.memberService = memberService;
    }

    public void dispatch() {
        Scanner sc = new Scanner(System.in);
        int menu = 0;
        do {
            memberRequestView.showMenu();
            //try { // exception listening
                /**
                 * InputMismatchException ;
                 */
                menu = sc.nextInt();
                /*
            } catch(InputMismatchException e) { // exception handling
                System.out.println("잘못된 입력입니다.");
                menu = 0;
            }
            */

            switch(menu) {
                case 0:
                    System.exit(0); // 정상 종료
                    break;
                case 1:                    Member m = memberRequestView.inputMember(sc); // 입력을 받아서 Member 객체를 생성
                    memberService.create(m);
                    break;
                case 8:                    //memberService.readList();
                    break;
                default:
                    break;
            }
        } while(menu >= 0 && menu < 10);
    }

    public String registerRequest(Member m) {
        String result = null;

        return result;
    }
    public String detailInfoRequest(Member m) {
        String result = null;

        return result;
    }
    public String listRequest() {
        String result = null;
        memberService.readList();
        return result;
    }

}
