package seaung.springstudy.policy;

import org.springframework.stereotype.Component;
import seaung.springstudy.entity.Member;

@Component
public class FixDiscountPolicy implements DiscountPolicy {
    @Override
    public int discount(Member member, int price) {
        return price - 1000;
    }
}
