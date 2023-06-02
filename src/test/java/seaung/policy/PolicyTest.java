package seaung.policy;

import org.junit.jupiter.api.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import seaung.springstudy.AutoAppConfig;
import seaung.springstudy.service.OrderService;

public class PolicyTest {

    @Test
    void policyTest() {
        AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(AutoAppConfig.class);
        OrderService bean = ac.getBean(OrderService.class);
    }
}
