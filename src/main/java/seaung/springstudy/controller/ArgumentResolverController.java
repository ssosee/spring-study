package seaung.springstudy.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import seaung.springstudy.controller.annotation.Hello;
import seaung.springstudy.controller.dto.HelloData;

@RestController
public class ArgumentResolverController {

    @GetMapping("/argumentResolver")
    public HelloData argumentResolver(@Hello HelloData helloData) {
        return helloData;
    }
}
