package seaung.singleton;

import org.junit.jupiter.api.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import seaung.springstudy.config.ApplicationConfig;

public class ConfigurationDeep {

    @Test
    void configurationDeep() {
        AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(ApplicationConfig.class);
        ApplicationConfig bean = ac.getBean(ApplicationConfig.class);
        System.out.println("bean = " + bean);
    }
}
