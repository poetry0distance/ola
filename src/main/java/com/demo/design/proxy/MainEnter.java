package com.demo.design.proxy;

/**
 * <p>Title: EMP </p>
 * Description: <br>
 * Copyright: CorpRights terminus.io<br>
 * Company: terminus.io<br>
 *
 * @author wang.tao
 * @version 1.0-SNAPSHOT
 * @date 2021-06-28
 */
public class MainEnter {

    public static void main(String[] args) {
        Phone phone = new Phone();
        phone.call();

        PhoneProxy phoneProxy = new PhoneProxy();
        phoneProxy.call();
    }
}
