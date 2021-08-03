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
public class Phone implements PhoneService{

    @Override
    public void call(){
        System.out.println("打电话！！！");
    }

}
