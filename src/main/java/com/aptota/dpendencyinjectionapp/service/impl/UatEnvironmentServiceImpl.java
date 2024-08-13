package com.aptota.dpendencyinjectionapp.service.impl;

import com.aptota.dpendencyinjectionapp.constant.AppConstant;
import com.aptota.dpendencyinjectionapp.service.EnvironmentService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Profile("uat")
public class UatEnvironmentServiceImpl implements EnvironmentService {
    @Override
    public String getEnvironment() {
        return AppConstant.UAT_ENV;
    }
}
