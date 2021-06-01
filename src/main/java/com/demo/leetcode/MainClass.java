package com.demo.leetcode;


import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>Title: EMP </p>
 *
 * @author wang tao
 * @version 1.0-SNAPSHOT
 * @date 2021-01-29
 */
public class MainClass {

    public static void main(String[] args) {
//        int[] nums = {2,7,11,15};
//        int target = 18;
//        System.out.println(Arrays.toString(sum(nums, target)));

//        ReplaceSpace replaceSpace = new ReplaceSpace();
//        String s = "wo shi ni ba ba";
//        String s1 = "";
//        String s2 = replaceSpace.replaceNull(s, s1);
//        System.out.println(s2);
//        ReversePrint reversePrint = new ReversePrint();
//        Object[] nums = {2,7,11,15,6,9,0,1,'s'};
//        Object[] objects = reversePrint.reverseLink(nums);
//        System.out.println(Arrays.toString(Arrays.stream(objects).toArray()));
//        Fib fib = new Fib();
//        int fib1 = fib.fib(3);
//        System.out.println(fib1);
//        NumWays numWays = new NumWays();
//        System.out.println(numWays.numWays(7));
//        Map<String,Object> map = new HashMap<>(1334);
//
//        System.out.println(map.size());
//        int[] arr = {4,3,1,6,8,7,2,9};
//        QuickSort quickSort = new QuickSort();
//        quickSort.quick(arr,0,arr.length-1);
//        for (int i:arr){
//            System.out.println(i);
//        }
        CountOneNumber countOneNumber = new CountOneNumber();
        System.out.println(countOneNumber.numberOfOne(00000000000000000000000010000000));

    }

    /**
     * 两数之和 --垃圾解法
     * @param nums
     * @param target
     * @return
     */
    public static int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        top:
        for (int i=0;i<nums.length;i++){
            int l = target - nums[i];
            for (int j = nums.length - 1 ; j > 0; j--){
                if (l == nums[j]){
                    result[0] = i;
                    result[1] = j;
                    break top;
                }
            }
        }
        return result;
    }

    /**
     * 两数之和 --巧妙解法
     * @param nums
     * @param target
     * @return
     */
    public static int[] sum(int[] nums, int target) {
        int[] result = new int[2];
        Map<String,Object> map = new HashMap<>();
        for (int i=0;i<nums.length;i++){
            int l = target - nums[i];
            if (map.containsKey(String.valueOf(l))){
                result[1] = i;
                result[0] = Integer.parseInt(map.get(String.valueOf(l)).toString());
                break;
            }
            map.put(String.valueOf(nums[i]),i);
        }
        return result;
    }

}
