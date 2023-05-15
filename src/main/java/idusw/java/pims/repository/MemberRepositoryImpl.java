package idusw.java.pims.repository;

import idusw.java.pims.model.Member;

import java.util.List;

public class MemberRepositoryImplMariadb implements MemberRepository {
    @Override
    public int insert(Member m) {
        return 0;
    }

    @Override
    public Member select(Member m) {
        return null;
    }

    @Override
    public List<Member> selectList() {
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
