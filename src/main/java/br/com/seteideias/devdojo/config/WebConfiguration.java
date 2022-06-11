package br.com.seteideias.devdojo.config;

import br.com.seteideias.devdojo.controller.Interceptador;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;

//@Configuration
public class WebConfiguration extends WebMvcConfigurationSupport {

    @Override
    protected void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(new Interceptador()).addPathPatterns("/**");
    }
}
