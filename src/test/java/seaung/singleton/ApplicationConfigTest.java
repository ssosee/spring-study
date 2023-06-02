package seaung.singleton;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import seaung.springstudy.config.ApplicationConfig;
import seaung.springstudy.repository.MemberRepository;
import seaung.springstudy.service.MemoServiceImpl;
import seaung.springstudy.service.UserServiceImpl;

public class ApplicationConfigTest {

    @Test
    @DisplayName("싱글톤이 깨지는가?")
    void applicationConfigTest() {
        AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(ApplicationConfig.class);
        UserServiceImpl userService = ac.getBean("userService", UserServiceImpl.class);
        MemoServiceImpl memoService = ac.getBean("memoService", MemoServiceImpl.class);
        MemberRepository memberRepository = ac.getBean("memberRepository", MemberRepository.class);

        System.out.println("userService 의 memberRepository="+ userService.getMemberRepository());
        System.out.println("memoService 의 memberRepository="+ memoService.getMemberRepository());
        System.out.println("memberRepository 의 memberRepository="+ memberRepository);

        Assertions.assertEquals(userService.getMemberRepository(), memberRepository);
        Assertions.assertEquals(memoService.getMemberRepository(), memberRepository);
    }
}
