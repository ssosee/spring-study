package seaung.lifecycle;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

public class BeanLifeCycleTest {

    @Test
    @DisplayName("빈 라이프사이클")
    void beanLifeCycle() {
        // given
        AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(LifCycleConfig.class);
        Restaurant client = ac.getBean(Restaurant.class);
        ac.close();
        // when

        // then
    }

    @Configuration
    static class LifCycleConfig {

        @Bean
        public Restaurant restaurant() {
            Restaurant restaurant = new Restaurant();
            restaurant.setStatus("가게 오픈");
            return restaurant;
        }
    }
}
