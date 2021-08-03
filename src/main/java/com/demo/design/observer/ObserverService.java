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
public interface ObserverService {

    void registerObserver(Observer o);

    void removeObserver(Observer o);

    void notifyObservers(String s);
}
