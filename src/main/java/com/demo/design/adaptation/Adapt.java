package com.demo.design.adaptation;

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
public class Adapt extends TwoHoleSocket implements ThreeHoleSocketService{

    @Override
    public void threeHole() {
        System.out.println("这是三孔");
    }
}
