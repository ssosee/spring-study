package seaung.springstudy.manybean;

import org.springframework.stereotype.Component;

@Component
public class Bean1 implements BeanParent {
    @Override
    public void print() {
        System.out.println("Bean1 입니다.");
    }
}
