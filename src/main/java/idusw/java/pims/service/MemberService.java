package idusw.java.pims.service;

import idusw.java.pims.model.Member;
import java.util.List;

public interface MemberService { // 인터페이스를 정의함
    // 데이터 처리 기본 연산 : CRUD(Create, Read, Update, Delete)
    int create(Member m);
    Member readById(Member m);
    List<Member> readList();
    int update(Member m);
    int delete(Member m);
}
