package seaung.springstudy.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import seaung.springstudy.controller.exception.BadException;

@RestController
public class BadExController {

    @GetMapping("bad")
    public String bad() {
        throw new BadException("bad exception");
    }
}
