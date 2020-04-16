package org.text.bookpub;

import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.servlet.FilterRegistration;
@Configuration
public class webconfig {
    @Bean
    public FilterRegistrationBean testFilterRegistration(){
        FilterRegistrationBean  registration = new FilterRegistrationBean(new myfilter());
        registration.addUrlPatterns("/home");
        //registration.setName("myFilter");
        return registration;
    }
}
