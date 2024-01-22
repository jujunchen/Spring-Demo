package com.spring.test.demo;

import com.spring.test.demo.bean.Bean;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SpringTest {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext();
        applicationContext.register(Bean.class);
        applicationContext.refresh();
        Bean bean = applicationContext.getBean(Bean.class);
        bean.print();
    }
}
