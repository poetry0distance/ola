package com.demo.serializable;

import org.springframework.cache.annotation.Cacheable;

import java.io.Serializable;

/**
 * <p>Title: EMP </p>
 * Description: <br>
 * Copyright: CorpRights terminus.io<br>
 * Company: terminus.io<br>
 *
 * @author wang.tao
 * @version 1.0-SNAPSHOT
 * @date 2021-06-22
 */
public class TestBean implements Serializable,Cloneable {
    private final static TestBean hungrySingleton;

    static {
        hungrySingleton = new TestBean();
    }
    public static TestBean getInstance() {
        return hungrySingleton;
    }

    /**
     * 防止单例反序列化
     * @return
     */
    private Object readResolve() {
        return hungrySingleton;
    }
}