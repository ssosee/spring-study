package seaung.springstudy.filter.exception;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
@AutoConfigureMockMvc
public class FilterExTest {

    @Autowired
    MockMvc mockMvc;

    // 필터에서 발생하는 예외처리
    @Test
    void filterExTest() throws Exception {
        mockMvc.perform(MockMvcRequestBuilders.get("/"))
                .andExpect(content().contentType(MediaType.ALL_VALUE))
                .andExpect(status().is4xxClientError());
    }
}
