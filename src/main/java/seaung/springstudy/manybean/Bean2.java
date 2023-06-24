package seaung.springstudy.manybean;

import org.springframework.stereotype.Component;

@Component
public class Bean2 implements BeanParent {
    @Override
    public void print() {
        System.out.println("Bean2 입니다.");
    }
}
