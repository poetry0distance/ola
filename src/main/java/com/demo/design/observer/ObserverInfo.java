package com.demo.design.observer;

import java.util.ArrayList;
import java.util.List;

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
public class ObserverInfo implements ObserverService{

    private final List<Observer> list = new ArrayList<Observer>();
    @Override
    public void registerObserver(Observer o) {
        list.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        list.remove(o);
    }

    @Override
    public void notifyObservers(String s) {
        for (Observer observer : list)
        {
            observer.update(s);
        }
    }
}
