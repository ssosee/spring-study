package seaung.springstudy.interceptor;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import org.springframework.web.method.HandlerMethod;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import java.util.UUID;

/**
 * 로그 인터셉터
 * 싱글톤 처럼 사용됨
 */
@Slf4j
public class LogInterceptor implements HandlerInterceptor {

    private static final String LOG_ID = "logId";

    // 컨트롤러가 호출되기 전에 실행
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {

        String requestURI = request.getRequestURI();
        String uuid = UUID.randomUUID().toString();

        // Stores an attribute in this request
        request.setAttribute(LOG_ID, uuid);

        // @RequestMapping: HandlerMethod
        // 정적 리소스: ResourceHttpRequestHandler
        if(handler instanceof HandlerMethod) {
            // 호출할 컨트롤러 메서드의 정보가 포함
            HandlerMethod hm = (HandlerMethod) handler;
            log.info("컨트롤러 정보={}", hm);
        }

        log.info("REQUEST [{}][{}][{}]", uuid, requestURI, handler);

        return true;
    }

    // 컨트롤러 호출 이후에 실행
    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
        // 예외가 발생하면 postHandle은 호출되지 않는다.
        log.info("postHandle [{}]", modelAndView);
    }

    // 모든 작업이 완료된 후에 실행(반드시 호출)
    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {
        String requestURI = request.getRequestURI();
        String uuid = (String) request.getAttribute(LOG_ID);
        log.info("RESPONSE [{}][{}]", uuid, requestURI);

        // 예외가 있다면
        if(ex != null) {
            log.error("예외 발생 ", ex);
        }
    }
}
