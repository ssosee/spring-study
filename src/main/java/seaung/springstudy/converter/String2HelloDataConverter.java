package seaung.springstudy.converter;

import lombok.extern.slf4j.Slf4j;
import org.springframework.core.convert.converter.Converter;
import seaung.springstudy.controller.dto.HelloData;

@Slf4j
public class String2HelloDataConverter implements Converter<String, HelloData> {
    @Override
    public HelloData convert(String source) {

        log.info("convert source={}", source);

        String[] split = source.split(", ");

        HelloData helloData = new HelloData();
        helloData.setName(split[0]);
        helloData.setAge(Integer.parseInt(split[1]));

        return helloData;
    }
}
