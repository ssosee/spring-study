package seaung.springstudy.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

@RestController
public class TestController {

    @GetMapping("/")
    public String test() {
        LocalDateTime now = LocalDateTime.now();
        return now.toString();
    }
}
