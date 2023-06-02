package seaung.springstudy.service;

import seaung.springstudy.repository.MemberRepository;
import seaung.springstudy.repository.PencilRepository;

public class MemoServiceImpl implements MemoService {
    private final MemberRepository memberRepository;
    private final PencilRepository pencilRepository;

    public MemoServiceImpl(MemberRepository memberRepository, PencilRepository pencilRepository) {
        this.memberRepository = memberRepository;
        this.pencilRepository = pencilRepository;
    }

    public MemberRepository getMemberRepository() {
        return memberRepository;
    }

    public PencilRepository getPencilRepository() {
        return pencilRepository;
    }
}
