package seaung.lifecycle;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

public class Restaurant {
    private String status;

    public Restaurant() {
        System.out.println("생성자 호출.. 가게상태="+status);
    }

    @PostConstruct
    public void init() {
        System.out.println("초기화 콜백.. 가게상태="+getStatus());
    }

    @PreDestroy
    public void close() {
        setStatus("가게 마감");
        System.out.println("소멸전 콜백.. 가게상태="+getStatus());
    }

    public void setStatus(String message) {
        this.status = message;
    }


    public String getStatus() {
        return status;
    }

}
