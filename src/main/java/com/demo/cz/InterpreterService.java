package com.demo.cz;

import org.springframework.stereotype.Component;

/**
 * <p>Title: EMP </p>
 *
 * @author wang tao
 * @version 1.0-SNAPSHOT
 * @date 2021-01-29
 */
@Component
public class InterpreterService {

    public String sayHello() {
        System.out.println("hello");
        return "hello";
    }
}
