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
public class PhoneProxy implements PhoneService{

    private Phone phone;

    public PhoneProxy(){
        this.phone = new Phone();
    }
    @Override
    public void call() {
        System.out.println("开启了录音");
        phone.call();
    }
}
