package seaung.springstudy.filter.exception;

import jakarta.servlet.*;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.io.IOException;

@Component
@Order(1) // 필터 호출 순서
public class SecondFilter implements Filter {
    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        System.out.println("SecondFilter 호출");
        chain.doFilter(request, response);
        System.out.println("SecondFilter 종료");
    }
}
