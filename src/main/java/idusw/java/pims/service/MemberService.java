package idusw.java.pim.service;

import idusw.java.pim.domain.Member;
import java.util.List;

public interface MemberService { // 인터페이스를 정의함
    int create(Member m);
    Member readById(Member m);
    List<Member> readList();
    int update(Member m);
    int delete(Member m);
}
