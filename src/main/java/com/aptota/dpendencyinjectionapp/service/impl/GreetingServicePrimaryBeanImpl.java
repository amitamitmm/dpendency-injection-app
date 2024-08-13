package com.aptota.dpendencyinjectionapp.service.impl;

import com.aptota.dpendencyinjectionapp.constant.AppConstant;
import com.aptota.dpendencyinjectionapp.service.GreetingService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service
@Primary
@Qualifier("primaryBean")
public class GreetingServicePrimaryBeanImpl implements GreetingService {
    @Override
    public String sayHello() {
        return AppConstant.GREETING_MSG_PRIMARY_BEAN;
    }
}
