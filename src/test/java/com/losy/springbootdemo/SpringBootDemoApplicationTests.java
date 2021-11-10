package com.losy.springbootdemo;

import com.losy.springbootdemo.pojo.Dog;
import com.losy.springbootdemo.pojo.Person;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringBootDemoApplicationTests {

    @Autowired
    private Person person;
    @Autowired
    private Dog dog;

    @Test
    void contextLoads() {
        System.out.println(person);
        System.out.println(dog);
    }

}
