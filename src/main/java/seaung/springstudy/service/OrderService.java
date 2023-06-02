package seaung.springstudy.service;

public class OrderService {

    private int price;

    public void order(String name, int price) {
        System.out.println("name = " + name + ", price = " + price);
        this.price = price; // 상태 저장
    }

    public int getPrice() {
        return price;
    }
}
