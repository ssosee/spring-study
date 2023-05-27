package seaung.springstudy.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloDataController {

    @GetMapping("/helloData")
    public String helloData() {
        throw new RuntimeException();
    }
}
