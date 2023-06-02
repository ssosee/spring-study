package seaung.springstudy.config;

import org.springframework.context.annotation.Bean;
import seaung.springstudy.repository.MemberRepository;
import seaung.springstudy.service.MemberService;

// @Configuration
public class AppConfig {

    @Bean
    public MemberRepository memberRepository() {
        return new MemberRepository();
    }
    @Bean
    public MemberService memberService() {
        return new MemberService(memberRepository());
    }
}
