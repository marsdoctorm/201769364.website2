package com.comp208.Configuration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @author comp208
 * @date 2024.3.1
 * @description 描述
 */
@Configuration
public class WebpageConfig implements WebMvcConfigurer {

    @Autowired
    private FileConfig fileConfig;

    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/image/**", "/images/**", "/css/**", "/js/**", "/img/**")
                .addResourceLocations("classpath:/mystatic/image/", "classpath:/mystatic/images/", "classpath:/mystatic/css/",
                        "classpath:/mystatic/js/", "classpath:/mystatic/img/");
        String saveFile = "file:" + fileConfig.getFileSave() + ":/toImage/";
        registry.addResourceHandler("/toImage/**").addResourceLocations(saveFile);
        WebMvcConfigurer.super.addResourceHandlers(registry);
    }
}
