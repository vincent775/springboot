package org.text.bookpub;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.context.annotation.Bean;



@SpringBootApplication
@ServletComponentScan(basePackages = "org.text.bookpub")
public class BookPubApplication {
    public static  void main(String[] arg){
        SpringApplication.run(BookPubApplication.class);
    }
    @Bean
    public StartupRunner schedulerrunner() {
       return new StartupRunner();
    }

//    @Bean
//    public RemoteIpFilter remoteIpFilter(){
//        return new RemoteIpFilter();
//    }

}
