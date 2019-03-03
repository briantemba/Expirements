package com.mandla.test;

import com.mandla.test.service.BusinessService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@SpringBootApplication
@EnableAspectJAutoProxy
public class Application {


    public static void main(String[] args){

        String accnumber="1234";

        ConfigurableApplicationContext configurableApplicationContext= SpringApplication.run(Application.class,args);

        BusinessService bean = configurableApplicationContext.getBean(BusinessService.class);
        bean.displayNum(accnumber);
        configurableApplicationContext.close();
    }

}
