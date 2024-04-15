package com.comp208.token;

/**
 * Created by comp208 on 2024.3.1.
 */

import java.util.UUID;

public class TokenProccessor {

    /*
     *单例设计模式（保证类的对象在内存中只有一个）
     *1、把类的构造函数私有
     *2、自己创建一个类的对象
     *3、对外提供一个公共的方法，返回类的对象
     */
    private TokenProccessor() {
    }

    private static final TokenProccessor instance = new TokenProccessor();

    /**
     * 返回类的对象
     *
     * @return
     */
    public static TokenProccessor getInstance() {
        return instance;
    }

    /**
     * 生成Token
     * Token：12345433423
     *
     * @return
     */
    public String makeToken() {
        return UUID.randomUUID().toString();
    }
}