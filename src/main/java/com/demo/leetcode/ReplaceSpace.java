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
 * 将字符串空格替换成任意字符串
 */
public class ReplaceSpace {

    public String replaceNull(String s,String rep){
        if (s.length() <=0){
            return "请输入有效字符串";
        }
        char[] chars = s.toCharArray();
        char[] reps = rep.toCharArray();
        // 标识字符串的长度
        int i = 0;
        // 标识有多少个空字符串
        int lengthSpace = 0;
        while (i < chars.length){
            if (chars[i] ==' '){
                lengthSpace++;
            }
            i++;
        }
        // 新字符串长度
        int newLength = chars.length + lengthSpace*2;
        // 定义新字符串
        char[] newString = new char[newLength];
        int j = newLength - 1;
        i = chars.length - 1;
        while (i >= 0){
            if (chars[i] != ' '){
                newString[j--] = chars[i--];
            }else {
                for (char r:reps){
                    newString[j--] = r;
                }
                i--;
            }
        }
        return new String(newString);
    }
}
