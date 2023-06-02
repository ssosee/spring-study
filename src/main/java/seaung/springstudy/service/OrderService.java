package seaung.springstudy.service;

import org.springframework.beans.factory.annotation.Autowired;
import seaung.springstudy.policy.DiscountPolicy;

// @Component
public class OrderService {

    private final DiscountPolicy discountPolicy;

    @Autowired
    public OrderService(DiscountPolicy discountPolicy) {
        this.discountPolicy = discountPolicy;
    }

    private int price;

    public void order(String name, int price) {
        System.out.println("name = " + name + ", price = " + price);
        this.price = price; // 상태 저장
    }

    public int getPrice() {
        return price;
    }
}
