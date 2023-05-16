package idusw.java.pims.service;

import idusw.java.pims.model.Member;
import idusw.java.pims.repository.MemberRepository;
import idusw.java.pims.repository.MemberRepositoryImpl;

import java.util.List;

public class MemberServiceImpl implements MemberService {
    private MemberRepository memberRepository;
    public MemberServiceImpl(MemberRepository memberRepository) {
        // Service에서 Repository를 사용할 수 있도록 주입함(injection)
        this.memberRepository = memberRepository;
        // this.memberRepository = new MemberRepositoryImpl(); // Framework 를 사용하지 않는 경우
    }

    private void sayHello() {
        // memberRepository 가 필요로 하는 정보로 가공
        // 가공된 정보를 memberRepository 객체에게 전달, 처리 결과를 반환 받음
        // 처리된 결과를 가공해서(업무 처리) memberController 객체에게 반환
    }
    @Override
    public int create(Member m) {
        // 기존 email 확인하여 존재하지 않는 경우 Data Storage에 create
        memberRepository.create(m);
        // 생성 성공 여부를 알림
        return 0;
    }

    @Override
    public Member readById(Member m) {
        System.out.println("멤버 조회 서비스 구현 코드 : ");
        return null;
    }

    @Override
    public List<Member> readList() {
        System.out.println("멤버 목록 조회 서비스 구현 코드 : ");
        return null;
    }

    @Override
    public int update(Member m) {
        System.out.println("멤버 수정 서비스 구현 코드 : ");
        return 0;
    }

    @Override
    public int delete(Member m) {
        System.out.println("멤버 탈퇴 서비스 구현 코드 : ");
        return 0;
    } // 정의한 인터페이스를 구현

}
