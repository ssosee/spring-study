package seaung.springstudy.controller.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

// ResponseStatusExceptionResolver 대상임
@ResponseStatus(code = HttpStatus.BAD_REQUEST, reason = "잘못된 요청")
public class BadException extends IllegalArgumentException {
    public BadException(String s) {
        super(s);
    }
}
