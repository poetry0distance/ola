package com.demo.leetcode;

import java.util.HashSet;
import java.util.Set;

/**
 * <p>Title: EMP </p>
 * Description: <br>
 * Copyright: CorpRights terminus.io<br>
 * Company: terminus.io<br>
 *
 * @author wang.tao
 * @version 1.0-SNAPSHOT
 * @date 2021-05-14
 */
public class FindSameNum {

    /**
     * 获取一个数组中某一个重复数字
     * @param nums
     * @return
     */
    public static int sameNum(int[] nums){
        Set<Integer> sameNum = new HashSet<>();
        int num = -1;
        for (int n:nums){
            if (!sameNum.add(n)){
                num = n;
                break;
            }
        }
        return num;
    }

    /**
     * 这个方法有bug
     * @param nums
     * @return
     */
    public static int findRepeatNumber(int[] nums) {
        int i = 0;
        while(i < nums.length) {
            if(nums[i] == i) {
                i++;
                continue;
            }
            if(nums[nums[i]] == nums[i]) return nums[i];
            int tmp = nums[i];
            nums[i] = nums[tmp];
            nums[tmp] = tmp;
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] a = {100,200,300,400,100,101,200,201};
        int repeatNumber = sameNum(a) ;
        System.out.println(repeatNumber);
    }

}
