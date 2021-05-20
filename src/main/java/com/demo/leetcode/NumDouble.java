package com.demo.leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * <p>Title: EMP </p>
 *
 * @author wang tao
 * @version 1.0-SNAPSHOT
 * @date 2021-03-11
 */
public class NumDouble {

    public static void main(String[] args) {
        int[] nums = {1,2,10,4,1,4,3,3};
        int[] n = new int[1000];
        int[] m = new int[1000];
    }

    public void del(){
        List<Integer> list = inp();
        List<Integer> dif = new ArrayList<>(list.size());
        List<Integer> remove = new ArrayList<>(list.size());
        list.forEach(i->{
            if (!dif.contains(i)){
                dif.add(i);
            }else {
                remove.add(i);
            }
        });
        list.removeAll(remove);
        System.out.println(list);
    }

    public static List<Integer> inp(){
        List<Integer> list = new ArrayList<>();
        int []nums = {1,2,10,4,1,4,3,3};
        for (int i = 0;i<nums.length;i++){
            list.add(nums[i]);
        }
        return list;
    }

}
