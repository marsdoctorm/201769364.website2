package com.comp208;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.scheduling.annotation.EnableAsync;

/**
 * @author comp208
 * @date 2024.3.1
 * @description
 */
@SpringBootApplication
@EntityScan(basePackages = "com.comp208.*")
@ComponentScan({"com.comp208.*"})
@MapperScan({"com.comp208.mappers"})
@EnableAsync
public class SGTW {

    public static void main(String[] args) {
        new SpringApplicationBuilder(SGTW.class).run(args);
    }

}
