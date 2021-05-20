package com.demo.ioc;

import com.demo.cz.InterpreterService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * <p>Title: EMP </p>
 *
 * @author wang tao
 * @version 1.0-SNAPSHOT
 * @date 2021-01-29
 */
@SpringBootTest
public class BeanDefinitionTest {

    @Test
    public void testBeanFactory() throws Exception {
        DefaultListableBeanFactory beanFactory = new DefaultListableBeanFactory();
        InterpreterService helloService = (InterpreterService) beanFactory.getBean("helloService");
        helloService.sayHello();
    }
}
