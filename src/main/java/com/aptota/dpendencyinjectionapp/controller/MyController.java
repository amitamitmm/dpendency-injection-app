package com.aptota.dpendencyinjectionapp.controller;

import com.aptota.dpendencyinjectionapp.service.GreetingService;
import com.aptota.dpendencyinjectionapp.service.impl.GreetingServiceImpl;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class MyController {

    private final GreetingService greetingService;

    public MyController(@Qualifier("in18Lang") GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String sayHello(){
        return greetingService.sayHello();
    }

}
