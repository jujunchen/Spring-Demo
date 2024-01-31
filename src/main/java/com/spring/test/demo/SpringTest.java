package com.spring.test.demo;

import com.spring.test.demo.bean.Bean;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.logging.Logger;

public class SpringTest {

    public static final Log log = LogFactory.getLog(SpringTest.class);
    public static void main(String[] args) {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext();
        applicationContext.register(Bean.class);
        applicationContext.refresh();
        Bean bean = applicationContext.getBean(Bean.class);
        bean.print();

        log.info("ttest");
    }
}
