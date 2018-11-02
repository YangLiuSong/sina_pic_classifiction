package com.example.android.sina_pic_classifiction;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.example.android.sina_pic_classifiction.*"})
@MapperScan("com/example/android/sina_pic_classifiction/Dao")



public class SinaPicClassifictionApplication extends SpringBootServletInitializer {

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder){
        return builder.sources(SinaPicClassifictionApplication.class);
    }
    public static void main(String[] args) {
        SpringApplication.run(SinaPicClassifictionApplication.class, args);
    }
}
