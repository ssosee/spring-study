package seaung.springstudy.config;

import jakarta.servlet.DispatcherType;
import jakarta.servlet.Filter;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.format.FormatterRegistry;
import org.springframework.web.method.support.HandlerMethodArgumentResolver;
import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import seaung.springstudy.controller.HelloDataHandlerExceptionResolver;
import seaung.springstudy.converter.HelloData2StringConverter;
import seaung.springstudy.converter.LocalDateTime2StringConverter;
import seaung.springstudy.converter.String2HelloDataConverter;
import seaung.springstudy.converter.String2LocalDateTimeConverter;
import seaung.springstudy.filter.CustomFilter;
import seaung.springstudy.interceptor.LogInterceptor;
import seaung.springstudy.resolver.HelloArgumentResolver;

import java.util.List;

@Configuration
public class WebConfig implements WebMvcConfigurer {
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(new LogInterceptor())
                .order(1)
                .addPathPatterns("/**")
                .excludePathPatterns("/css/**", "/*.ico", "/error");
    }

    @Override
    public void addArgumentResolvers(List<HandlerMethodArgumentResolver> resolvers) {
        resolvers.add(new HelloArgumentResolver());
    }

    @Override
    public void extendHandlerExceptionResolvers(List<HandlerExceptionResolver> resolvers) {
        resolvers.add(new HelloDataHandlerExceptionResolver());
    }

    @Bean
    public FilterRegistrationBean filterRegistrationBean() {
        FilterRegistrationBean<Filter> filterRegistrationBean = new FilterRegistrationBean<>();
        filterRegistrationBean.setFilter(new CustomFilter());
        filterRegistrationBean.addUrlPatterns("/*");
        filterRegistrationBean.setDispatcherTypes(DispatcherType.REQUEST, DispatcherType.ERROR);

        return filterRegistrationBean;
    }

    @Override
    public void addFormatters(FormatterRegistry registry) {
        registry.addConverter(new String2LocalDateTimeConverter());
        registry.addConverter(new LocalDateTime2StringConverter());
        registry.addConverter(new HelloData2StringConverter());
        registry.addConverter(new String2HelloDataConverter());
    }
}
