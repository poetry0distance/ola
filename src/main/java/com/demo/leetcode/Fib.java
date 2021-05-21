package com.demo.leetcode;

/**
 * <p>Title: EMP </p>
 * Description: <br>
 * Copyright: CorpRights terminus.io<br>
 * Company: terminus.io<br>
 *
 * @author wang.tao
 * @version 1.0-SNAPSHOT
 * @date 2021-05-21
 * 斐波拉契数列
 */
public class Fib {

    public int fib(int i){
        int n = 0;
        if (i == 0){
            return 0;
        }
        if (i == 1){
            return 1;
        }
        n = fib(i-1)+fib(i-2);
        int f = n % 1000000007;
        if (n == 1000000008){
            return 1;
        }
        return f;
    }
}
