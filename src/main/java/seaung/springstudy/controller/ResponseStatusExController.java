package seaung.springstudy.controller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

@RestController
public class ResponseStatusExController {

    @GetMapping("/responseStatusException")
    public String responseStatusException() {
        throw new ResponseStatusException(HttpStatus.NOT_FOUND, "responseStatusException", new IllegalArgumentException());
    }
}
