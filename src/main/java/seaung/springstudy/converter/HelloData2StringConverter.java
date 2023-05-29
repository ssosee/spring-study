package seaung.springstudy.converter;

import lombok.extern.slf4j.Slf4j;
import org.springframework.core.convert.converter.Converter;
import seaung.springstudy.controller.dto.HelloData;

@Slf4j
public class HelloData2StringConverter implements Converter<HelloData, String> {
    @Override
    public String convert(HelloData source) {
        log.info("convert source={}", source);
        return source.getName() + ", " + source.getAge();
    }
}
