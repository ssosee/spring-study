package seaung.springstudy.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import seaung.springstudy.controller.dto.HelloData;

import java.time.LocalDateTime;

@Slf4j
@RestController
public class TestController {

    @GetMapping(value = "/", produces = MediaType.ALL_VALUE)
    public String test() {
        LocalDateTime now = LocalDateTime.now();
        return now.toString();
    }

    @GetMapping("/modelAttribute")
    public HelloData getModelAttribute(@ModelAttribute HelloData helloData) {
        log.info("name={}, age={}", helloData.getName(), helloData.getAge());

        return helloData;
    }

    @PostMapping("/modelAttribute")
    public HelloData postModelAttribute(@ModelAttribute HelloData helloData) {
        log.info("name={}, age={}", helloData.getName(), helloData.getAge());

        return helloData;
    }

    @PostMapping("/postRequestBody")
    public HelloData postRequestBody(@RequestBody HelloData helloData) {
        log.info("name={}, age={}", helloData.getName(), helloData.getAge());

        return helloData;
    }
}
