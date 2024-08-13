package com.aptota.dpendencyinjectionapp.controller;

import com.aptota.dpendencyinjectionapp.constant.AppConstant;
import com.aptota.dpendencyinjectionapp.service.impl.GreetingServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@ActiveProfiles("ES")
class MyControllerTest {

    @Autowired
    MyController myController;

    @Test
    public void test(){
        String result = myController.sayHello();
        System.out.println(result);
        assertEquals(AppConstant.GREETING_MSG_ES, result);
    }
}