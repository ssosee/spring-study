package seaung.springstudy.converter;

import org.junit.jupiter.api.Test;
import org.springframework.core.convert.support.DefaultConversionService;

import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ConverterTest {

    String time = "2023-05-28 12:18:01";

    @Test
    void string2LocalDateTimeTest() {
        String2LocalDateTimeConverter converter = new String2LocalDateTimeConverter();
        LocalDateTime convert = converter.convert(time);
        assertEquals(convert.toString(), time);
    }

    @Test
    void LocalDateTime2StringTest() {
        LocalDateTime2StringConverter converter = new LocalDateTime2StringConverter();
        String convert = converter.convert(LocalDateTime.now());
        System.out.println(convert);
    }

    @Test
    void conversionService() {
        DefaultConversionService conversionService = new DefaultConversionService();
        conversionService.addConverter(new LocalDateTime2StringConverter());
        conversionService.addConverter(new String2LocalDateTimeConverter());

        LocalDateTime convert1 = conversionService.convert(time, LocalDateTime.class);
        String convert2 = conversionService.convert(convert1, String.class);

        System.out.println(convert1);
        System.out.println(convert2);
    }
}