package idusw.java.pims.repository;

import idusw.java.pims.model.Member;

import java.util.List;

public interface MemberRepository {
    int create(Member m); // create
    Member read(Member m); // read : m.getName(), Member selectByName(String name);
    List<Member> readList();
    int update(Member m); // update
    int delete(Member m); // delete
}
