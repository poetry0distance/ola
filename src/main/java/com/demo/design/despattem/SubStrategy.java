package com.demo.design.despattem;

/**
 * <p>Title: EMP </p>
 *
 * @author wang tao
 * @version 1.0-SNAPSHOT
 * @date 2021-03-12
 */
public class SubStrategy implements Strategy{
    @Override
    public int calculate(int a, int b) {
        return a - b;
    }
}
