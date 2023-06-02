package seaung.springstudy.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import seaung.springstudy.repository.MemberRepository;
import seaung.springstudy.service.MemberService;
import seaung.springstudy.service.OrderService;

@Configuration
public class AppConfig {

    @Bean
    public MemberRepository memberRepository() {
        return new MemberRepository();
    }
    @Bean
    public MemberService memberService() {
        return new MemberService(memberRepository());
    }

    @Bean
    public OrderService orderService() {
        return new OrderService();
    }
}
