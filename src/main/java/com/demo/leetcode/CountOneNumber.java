package com.demo.leetcode;

/**
 * <p>Title: EMP </p>
 * Description: <br>
 * Copyright: CorpRights terminus.io<br>
 * Company: terminus.io<br>
 *
 * @author wang.tao
 * @version 1.0-SNAPSHOT
 * @date 2021-06-01
 *
 * 输入一个整数（以二进制串形式），输出该数二进制表示中 1 的个数。例如，把 9 表示成二进制是 1001，有 2 位是 1。因此，如果输入9，则该函数输出 2。
 */
public class CountOneNumber {

    public int numberOfOne(int n){
        // 将整数转换为二进制
        String string = Integer.toBinaryString(n);
        char[] chars = string.toCharArray();
        int i = 0;
        for (Object s:chars){
            if (s.equals('1')){
                i++;
            }
        }
        return i;
    }

    /**
     *  优化解法
     *
     * 初始化统计数 res = 0
     * 循环判断，当数字 n = 0 跳出循环
     * 统计数 res 加 1
     * n &= n - 1，每次消去最右位数字 1
     *
     * int hammingWeight(uint32_t n)
     *     {
     *         int res = 0;
     *         while(n)
     *         {
     *             res++;
     *             n &= n - 1;
     *         }
     *         return res;
     *     }
     * @param n
     * @return
     */

}
