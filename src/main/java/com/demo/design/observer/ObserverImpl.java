package com.demo.design.observer;

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
public class ObserverImpl implements Observer {
    @Override
    public void update(String s) {
        System.out.println(s);
    }
}
