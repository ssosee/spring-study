package seaung.springstudy.converter;

import lombok.extern.slf4j.Slf4j;
import org.springframework.core.convert.converter.Converter;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@Slf4j
public class LocalDateTime2StringConverter implements Converter<LocalDateTime, String> {
    @Override
    public String convert(LocalDateTime source) {
        log.info("convert source={}", source);
        return source.format(DateTimeFormatter.ofPattern("yyyy-MM-dd hh:mm:ss"));
    }
}
