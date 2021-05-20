package com.demo;

import com.demo.cz.InterpreterService;
import com.demo.ioc.BeanFactory;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class OlaApplicationTests {

    @Test
    void contextLoads() {
    }


    @Test
    public void testGetBean() throws Exception {
        BeanFactory beanFactory = new BeanFactory();
        beanFactory.registerBean("helloService", new InterpreterService());
        InterpreterService helloService = (InterpreterService) beanFactory.getBean("helloService");
        assert helloService != null;
        assert helloService.sayHello().equals("hello");
    }
}
