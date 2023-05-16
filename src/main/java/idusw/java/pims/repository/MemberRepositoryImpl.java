package idusw.java.pims.repository;

import idusw.java.pims.model.Member;

import java.util.List;

public class MemberRepositoryImpl implements MemberRepository {

    @Override
    public int create(Member m) {
        System.out.println("MemberRepository : insert() 호출 - Data Access");
        System.out.format("%10s %10s %20s %50s\n", m.getEmail(), m.getName(), m.getPhone(), m.getAddress());
        return 0;
    }

    @Override
    public Member read(Member m) {
        return null;
    }

    @Override
    public List<Member> readList() {
        return null;
    }

    @Override
    public int update(Member m) {
        return 0;
    }

    @Override
    public int delete(Member m) {
        return 0;
    }
}
