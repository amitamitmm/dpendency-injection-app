package com.aptota.dpendencyinjectionapp.controller;

import com.aptota.dpendencyinjectionapp.constant.AppConstant;
import com.aptota.dpendencyinjectionapp.service.impl.GreetingServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class ControllerInjectedMyControllerTest {

    @Autowired
    ControllerInjectedMyController controllerInjectedMyController;



    @Test
    void sayHello() {
        String result = controllerInjectedMyController.sayHello();
        System.out.println(result);
        assertEquals(AppConstant.GREETING_MSG, result);
    }
}