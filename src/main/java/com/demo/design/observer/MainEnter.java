package com.demo.design.observer;

import java.util.concurrent.ConcurrentHashMap;

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
        ObserverService observerService = new ObserverInfo();

        Observer observer1 = new ObserverImpl();
        Observer observer2 = new ObserverImpl();
        Observer observer3 = new ObserverImpl();

        observerService.registerObserver(observer1);
        observerService.registerObserver(observer2);
        observerService.registerObserver(observer3);

        observerService.notifyObservers("通知");
    }
}
