package seaung.springstudy.policy;

import seaung.springstudy.entity.Member;

public interface DiscountPolicy {
    int discount(Member member, int price);
}
