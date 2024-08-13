package com.aptota.dpendencyinjectionapp.controller;

import com.aptota.dpendencyinjectionapp.constant.AppConstant;
import com.aptota.dpendencyinjectionapp.service.impl.GreetingServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class PropertyInjectedMyControllerTest {

    @Autowired
    PropertyInjectedMyController controller;


    @Test
    void test(){
        String result = controller.sayHello();
        System.out.println(result);
        assertEquals(AppConstant.GREETING_MSG, result);
    }
}