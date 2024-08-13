package com.aptota.dpendencyinjectionapp.controller;

import com.aptota.dpendencyinjectionapp.constant.AppConstant;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@ActiveProfiles({AppConstant.PROD_ENV, "EN"})
class EnvironmentControllerTest {

    @Autowired
    EnvironmentController environmentController;

    @Test
    void getEnvironment() {
        String env = environmentController.getEnvironment();
        System.out.println(env);
        assertEquals(AppConstant.PROD_ENV, env);
    }
}