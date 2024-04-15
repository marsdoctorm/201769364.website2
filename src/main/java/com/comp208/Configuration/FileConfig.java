package com.comp208.Configuration;

import cn.hutool.core.io.FileUtil;
import lombok.Getter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

import javax.annotation.PostConstruct;

/**
 * @author comp208
 * @date 2024.3.1
 */
@Configuration
@Getter
public class FileConfig {

    @Value("${my.file.save}")
    private String fileSave;
    @Value("${my.file.saveImage}")
    private String saveImage;
    @Value("${my.file.saveThumbnails}")
    private String saveThumbnails;

    @PostConstruct
    public void init() {
        String si = "file:" + fileSave + ":" + saveImage;
        FileUtil.mkdir(si);
        String st = "file:" + fileSave + ":" + saveThumbnails;
        FileUtil.mkdir(st);
    }
}
