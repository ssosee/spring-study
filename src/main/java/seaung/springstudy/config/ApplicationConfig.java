package seaung.springstudy.config;


import org.springframework.context.annotation.Bean;
import seaung.springstudy.repository.MemberRepository;
import seaung.springstudy.repository.PencilRepository;
import seaung.springstudy.service.MemoService;
import seaung.springstudy.service.MemoServiceImpl;
import seaung.springstudy.service.UserService;
import seaung.springstudy.service.UserServiceImpl;

// @Configuration
public class ApplicationConfig {
    @Bean
    public MemberRepository memberRepository() {
        System.out.println("memberRepository()");
        return new MemberRepository();
    }

    @Bean
    public PencilRepository pencilRepository() {
        return new PencilRepository();
    }

    @Bean
    public MemoService memoService() {
        System.out.println("memoService()");
        // new MemberRepository()
        return new MemoServiceImpl(memberRepository(), pencilRepository());
    }

    @Bean
    public UserService userService() {
        System.out.println("userService()");
        // new MemberRepository()
        return new UserServiceImpl(memberRepository());
    }
}
