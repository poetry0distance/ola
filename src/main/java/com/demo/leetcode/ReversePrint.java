package com.demo.leetcode;

/**
 * <p>Title: EMP </p>
 * Description: <br>
 * Copyright: CorpRights terminus.io<br>
 * Company: terminus.io<br>
 *
 * @author wang.tao
 * @version 1.0-SNAPSHOT
 * @date 2021-05-20
 *  从尾到头打印链表
 */
public class ReversePrint {

    /**
     * 链表反转
     * @param objects
     * @return
     */
    public Object[] reverseLink(Object[] objects){
        if (objects == null)
            return null;

        int i = 0;
        int j = objects.length - 1;
        while (i <= j){
            Object obj = objects[i];
            objects[i] = objects[j];
            objects[j] = obj;
            i++;
            j--;
        }
        return objects;
    }
}
