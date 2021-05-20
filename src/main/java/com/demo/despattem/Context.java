package com.demo.despattem;

/**
 * <p>Title: EMP </p>
 *
 * @author wang tao
 * @version 1.0-SNAPSHOT
 * @date 2021-03-12
 */
public class Context {
    private Strategy strategy;

    public Context(Strategy strategy) {
        this.strategy = strategy;
    }

    // 动态替换算法(策略)
    public void replaceStrategy(Strategy strategy) {
        this.strategy = strategy;
    }

    public int calculate(int a, int b) {
        return strategy.calculate(a, b);
    }
}
