package seaung.singleton;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import seaung.springstudy.config.AppConfig;
import seaung.springstudy.service.MemberService;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SingletonTest {

    @Test
    @DisplayName("싱글톤 테스트")
    void singletonTest() {

        MySingletonService instance1 = MySingletonService.getInstance();
        MySingletonService instance2 = MySingletonService.getInstance();

        assertEquals(instance1, instance2);

    }

    @Test
    @DisplayName("스프링 컨테이너와 싱글톤")
    void springSingletonTest() {
        AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(AppConfig.class);
        MemberService memberService1 = ac.getBean("memberService", MemberService.class);
        MemberService memberService2 = ac.getBean("memberService", MemberService.class);

        assertEquals(memberService1, memberService2);

    }

}
