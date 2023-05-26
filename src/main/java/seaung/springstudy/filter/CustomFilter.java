package seaung.springstudy.filter;

import jakarta.servlet.*;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.time.LocalDateTime;

// @Component
public class CustomFilter implements Filter {

    // 필터 초기화 메소드, 서블릿 컨테이너가 생성될 때 호출
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        LocalDateTime now1 = LocalDateTime.now();
        System.out.println("["+now1+"] 셋, 둘, 하나!");

        Filter.super.init(filterConfig);

        LocalDateTime now2 = LocalDateTime.now();
        System.out.println("["+now2+"] 시작한다!");
    }

    // 요청을 실행하는 메소드, 필터가 여러개면 다음 필터를 호출한다.
    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        LocalDateTime now1 = LocalDateTime.now();
        System.out.println("["+now1+"] 안녕하세요.");

        chain.doFilter(request, response);

        LocalDateTime now2 = LocalDateTime.now();
        System.out.println("["+now2+"] 잘가요~");
    }

    // 필터 종료 메소드, 서블릿 컨테이너가 종료될 때 호출
    @Override
    public void destroy() {
        LocalDateTime now1 = LocalDateTime.now();
        System.out.println("["+now1+"] 고생했다!");

        Filter.super.destroy();

        LocalDateTime now2 = LocalDateTime.now();
        System.out.println("["+now2+"] 푹쉬어~");
    }
}
