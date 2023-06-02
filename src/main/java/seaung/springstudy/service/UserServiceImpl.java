package seaung.springstudy.service;

import seaung.springstudy.repository.MemberRepository;

public class UserServiceImpl implements UserService {
    private final MemberRepository memberRepository;

    public UserServiceImpl(MemberRepository memberRepository) {
        this.memberRepository = memberRepository;
    }

    public MemberRepository getMemberRepository() {
        return memberRepository;
    }
}
