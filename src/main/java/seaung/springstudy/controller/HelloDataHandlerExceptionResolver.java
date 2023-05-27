package seaung.springstudy.controller;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.ModelAndView;

import java.io.IOException;

@Slf4j
public class HelloDataHandlerExceptionResolver implements HandlerExceptionResolver {
    @Override
    public ModelAndView resolveException(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) {
        if(ex instanceof RuntimeException) {
            log.error("RuntimeException resolver to 400");
            response.setStatus(HttpServletResponse.SC_BAD_REQUEST);

            try {
                response.getWriter().println("error!!!!!!!!!!!!!!!!!!");
            } catch (IOException e) {
                log.error("HelloDataHandlerExceptionResolver error");
            }

            return new ModelAndView();
        }

        return null;
    }
}
