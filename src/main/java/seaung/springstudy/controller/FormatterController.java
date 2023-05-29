package seaung.springstudy.controller;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import org.springframework.format.annotation.NumberFormat;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

@RestController
public class FormatterController {

    @GetMapping("/formatter")
    public ResponseEntity<MyFormat> formatter() {

        MyFormat myFormat = new MyFormat();
        myFormat.setNumber(100000);
        myFormat.setLocalDateTime(LocalDateTime.now());

        return new ResponseEntity<>(myFormat, HttpStatus.OK);
    }

    @Data
    static class MyFormat {
        @NumberFormat(pattern = "#,###")
        private Integer number;

        @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm:ss", timezone = "Asia/Seoul")
        private LocalDateTime localDateTime;
    }
}
