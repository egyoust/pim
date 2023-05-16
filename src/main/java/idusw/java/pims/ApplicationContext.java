package idusw.java.pims;

import idusw.java.pims.controller.MemberController;
import idusw.java.pims.repository.MemberRepository;
import idusw.java.pims.repository.MemberRepositoryImpl;
import idusw.java.pims.service.MemberService;
import idusw.java.pims.service.MemberServiceImpl;

public class ApplicationContext { // Framework : 필요한 것을 개발자 만들어서 사용하는 것이 아닌 프레임워크가 주입
    private static ApplicationContext applicationContext;
    private static MemberRepository memberRepository;
    private static MemberService memberService;
    private static MemberController memberController;

    public static ApplicationContext lookup() {
        if(applicationContext == null) { // singleton pattern
            memberRepository = new MemberRepositoryImpl();
            memberService = new MemberServiceImpl(memberRepository);
            memberController = new MemberController(memberService);
        }
        return new ApplicationContext();
    }

    public static ApplicationContext getApplicationContext() {
        return applicationContext;
    }

    public static MemberRepository getMemberRepository() {
        return memberRepository;
    }

    public static MemberService getMemberService() {
        return memberService;
    }

    public static MemberController getMemberController() {
        return memberController;
    }
}
