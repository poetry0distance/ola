package com.demo.serializable;

import java.io.*;

/**
 * <p>Title: EMP </p>
 * Description: <br>
 * Copyright: CorpRights terminus.io<br>
 * Company: terminus.io<br>
 *
 * @author wang.tao
 * @version 1.0-SNAPSHOT
 * @date 2021-06-22
 */
public class TestMain {

    public static void main(String[] args) throws IOException, ClassNotFoundException {

        TestBean instance = TestBean.getInstance();
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("singleton_file"));
        oos.writeObject(instance);
        File file = new File("singleton_file");
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file));
        TestBean newInstance = (TestBean) ois.readObject();
        System.out.println(instance == newInstance);
    }
}
