package seaung.springstudy.resolver;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;
import lombok.extern.slf4j.Slf4j;
import org.springframework.core.MethodParameter;
import org.springframework.web.bind.support.WebDataBinderFactory;
import org.springframework.web.context.request.NativeWebRequest;
import org.springframework.web.method.support.HandlerMethodArgumentResolver;
import org.springframework.web.method.support.ModelAndViewContainer;
import seaung.springstudy.controller.annotation.Hello;
import seaung.springstudy.controller.dto.HelloData;

@Slf4j
public class HelloArgumentResolver implements HandlerMethodArgumentResolver {
    @Override
    public boolean supportsParameter(MethodParameter parameter) {

        log.info("supportParameter 실행");

        boolean hasHello = parameter.hasParameterAnnotation(Hello.class);

        return hasHello;
    }

    @Override
    public Object resolveArgument(MethodParameter parameter, ModelAndViewContainer mavContainer, NativeWebRequest webRequest, WebDataBinderFactory binderFactory) throws Exception {

        log.info("resolveArgument 실행");

        HelloData helloData = new HelloData();
        helloData.setName("아규먼트 리졸브를 사용했니?");
        helloData.setAge(10000);

        return helloData;
    }
}
