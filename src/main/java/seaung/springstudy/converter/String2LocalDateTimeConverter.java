package seaung.springstudy.converter;

import lombok.extern.slf4j.Slf4j;
import org.springframework.core.convert.converter.Converter;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@Slf4j
public class String2LocalDateTimeConverter implements Converter<String, LocalDateTime> {
    @Override
    public LocalDateTime convert(String source) {
        log.info("convert source={}", source);
        return LocalDateTime.parse(source, DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
    }
}
