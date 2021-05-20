package com.demo.despattem;

/**
 * <p>Title: EMP </p>
 *
 * @author wang tao
 * @version 1.0-SNAPSHOT
 * @date 2021-03-12
 */
public class DoMain {

    public static void main(String[] args) {
        Strategy addStrategy = new AddStrategy();
        Context context = new Context(addStrategy);
        // 输出3
        System.out.println(context.calculate(1, 2));

        Strategy subStrategy = new SubStrategy();
        // 动态替换算法(策略)
        context.replaceStrategy(subStrategy);
        // 输出-1
        System.out.println(context.calculate(1, 2));
    }
}
