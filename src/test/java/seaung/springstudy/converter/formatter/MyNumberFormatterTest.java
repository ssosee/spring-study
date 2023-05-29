package seaung.springstudy.converter.formatter;

import org.junit.jupiter.api.Test;

import java.text.ParseException;
import java.util.Locale;

import static org.junit.jupiter.api.Assertions.*;

class MyNumberFormatterTest {

    MyNumberFormatter myNumberFormatter = new MyNumberFormatter();

    @Test
    void parse() throws ParseException {
        Number parse = myNumberFormatter.parse("1,000", Locale.KOREA);
        assertEquals(1000L, parse);
    }


    @Test
    void print() {
        String print = myNumberFormatter.print(1000L, Locale.KOREA);
        assertEquals("1,000", print);
    }
}