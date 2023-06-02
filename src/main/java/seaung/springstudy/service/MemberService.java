package seaung.springstudy.service;

import seaung.springstudy.repository.MemberRepository;

public class MemberService {

    private final MemberRepository memberRepository;

    public MemberService(MemberRepository memberRepository) {
        this.memberRepository = memberRepository;
    }

    public void logic() {
        System.out.println("MemberService.logic");
    }
}
