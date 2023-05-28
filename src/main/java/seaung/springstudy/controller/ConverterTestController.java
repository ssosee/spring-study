package seaung.springstudy.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConverterTestController {

    @GetMapping("/converter")
    public String convert(@RequestParam String time) {
        return time;
    }
}
