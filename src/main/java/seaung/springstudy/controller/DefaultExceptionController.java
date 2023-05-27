package seaung.springstudy.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DefaultExceptionController {

    // DefaultHandlerExceptionResolver
    // 타입이 맞지 않으면 스프링 내부에서 예외처리 함 ^^
    @GetMapping("/defaultException")
    public String defaultException(@RequestParam("data") Integer data) {
        return "ok";
    }
}
