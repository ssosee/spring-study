package seaung.springstudy.filter.exception;

import jakarta.servlet.*;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.core.annotation.Order;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;

import java.io.IOException;

@Component
@Order(0) // 필터 호출 순서
public class FirstFilter implements Filter {
    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        try {
            System.out.println("FirstFilter 호출");
            chain.doFilter(request, response);
            System.out.println("FirstFilter 종료");
        } catch (RuntimeException e) {
            System.out.println(e.getMessage()+" FirstFilter 가 예외 처리한다.");
            HttpServletResponse servletResponse = (HttpServletResponse) response;
            servletResponse.setStatus(HttpServletResponse.SC_BAD_REQUEST);
            servletResponse.setContentType(MediaType.ALL_VALUE);
            servletResponse.getWriter().println(e.getMessage());
        } finally {
            System.out.println(request.getDispatcherType());
        }
    }
}
