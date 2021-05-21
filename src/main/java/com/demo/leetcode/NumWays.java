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
 * 一只青蛙一次可以跳上1级台阶，也可以跳上2级台阶。求该青蛙跳上一个 n 级的台阶总共有多少种跳法。
 * 斐波拉契数列解法
 *
 *
 */
public class NumWays {

    /**
     * 这种解题思路一点都没有体现
     * @param num
     * @return
     */
    public int numWays(int num){
        int c = 1,nxt = 1;
        for (int i=0;i<num;i++){
            int tmp = nxt;
            nxt = (c + nxt) % 1000000007;
            c = tmp;
        }
        return c;
    }
}
