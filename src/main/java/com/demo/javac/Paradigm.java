package com.demo.javac;

import java.security.PublicKey;

/**
 * <p>Title: EMP </p>
 * Description: <br>
 * Copyright: CorpRights terminus.io<br>
 * Company: terminus.io<br>
 *
 * @author wang.tao
 * @version 1.0-SNAPSHOT
 * @date 2021-06-09
 */
public class Paradigm {

    public static void so(Okm<?> s){
        System.out.println(s.getKey());
    }

    public static void main(String[] args) {
        Okm<String> s = new Okm<>();
        s.setKey("lml");
        Okm<Integer> l = new Okm<>();
        l.setKey(100);
        so(s);
        so(l);
    }
}
