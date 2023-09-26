package com.example.ioc;

import com.example.config.MyConfig;
import com.example.config.MyConfigProto;
import lombok.RequiredArgsConstructor;
import lombok.extern.apachecommons.CommonsLog;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

@Component
@RequiredArgsConstructor
public class PrintBeans {

    private final ApplicationContext applicationContext;
    private final MyConfigProto myConfigProto;
    private final MyConfig myConfig;

    @Bean
    public void printBeansMethod(){

        MyConfig myConfig1 = applicationContext.getBean(MyConfig.class);
        MyConfig myConfig2 = applicationContext.getBean(MyConfig.class);
        MyConfig myConfig3 = applicationContext.getBean(MyConfig.class);

        MyConfigProto myConfigProto1 = applicationContext.getBean(MyConfigProto.class);
        MyConfigProto myConfigProto2 = applicationContext.getBean(MyConfigProto.class);
        MyConfigProto myConfigProto3 = applicationContext.getBean(MyConfigProto.class);

//        System.out.println(myConfig1);
//        System.out.println(myConfig2);
//        System.out.println(myConfig3);
//
//        System.out.println(myConfigProto1);
//        System.out.println(myConfigProto2);
//        System.out.println(myConfigProto3);

//        List<String> beans = Arrays.stream(applicationContext.getBeanDefinitionNames()).toList();
//
//        for (String beanName : beans){
//            System.out.println(beanName);
//        }
    }

}
