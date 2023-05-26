package seaung.springstudy.filter.exception;

import jakarta.servlet.*;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.io.IOException;

@Component
@Order(2) // 필터 호출 순서
public class ThirdFilter implements Filter {
    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        throw new RuntimeException("ThirdFilter error!!");
    }
}
