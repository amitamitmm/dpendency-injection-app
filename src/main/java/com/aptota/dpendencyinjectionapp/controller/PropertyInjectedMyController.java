package com.aptota.dpendencyinjectionapp.controller;

import com.aptota.dpendencyinjectionapp.service.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class PropertyInjectedMyController {

    @Autowired
    @Qualifier("greetingServiceImpl")
    private GreetingService greetingService;

    public String sayHello(){
        return greetingService.sayHello();
    }

}
