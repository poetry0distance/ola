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
 * 快速排序，基于一个基准数对数据进行分组，对分组的数据进行排序。
 */
public class QuickSort {

    public void quick(int[] arr,int s,int e){
        int p,i,j,temp;
        if (s >= e){
            return;
        }
        // 选取一个基准数 --这里默认使用数组的第一个数据
        p = arr[s];
        i = s;
        j = e;
        while (i < j){
            while (arr[j] >=p && i<j){
                j--;
            }
            while (arr[i]<=p && i<j){
                i++;
            }
            temp = arr[j];
            arr[j] = arr[i];
            arr[i] = temp;
        }
        arr[s] = arr[i];
        arr[i] = p;
        quick(arr,s,j-1);
        quick(arr,j+1,e);
    }
}
