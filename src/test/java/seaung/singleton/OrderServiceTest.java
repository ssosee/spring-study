package seaung.singleton;

import org.junit.jupiter.api.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import seaung.springstudy.config.AppConfig;
import seaung.springstudy.service.OrderService;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class OrderServiceTest {

    @Test
    void orderServiceServiceSingleton() {
        AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(AppConfig.class);

        OrderService orderService1 = ac.getBean("orderService", OrderService.class);
        OrderService orderService2 = ac.getBean("orderService", OrderService.class);

        orderService1.order("user1", 1000);
        orderService2.order("user2", 2000);

        int price1 = orderService1.getPrice();
        int price2 = orderService2.getPrice();
        System.out.println("user1의 price = " + price1);
        System.out.println("user2의 price = " + price2);

        assertAll(
                () -> assertEquals(1000, price1),
                () -> assertEquals(2000, price2)
        );
    }
}
