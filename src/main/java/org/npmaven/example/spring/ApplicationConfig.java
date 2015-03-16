package org.npmaven.example.spring;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@Configuration
@ComponentScan()
public class ApplicationConfig extends WebMvcConfigurerAdapter {
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/npmaven/**").addResourceLocations(
                "classpath:/org/npmaven/");
    }

}
