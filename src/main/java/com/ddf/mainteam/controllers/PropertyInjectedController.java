package com.ddf.mainteam.controllers;

import com.ddf.mainteam.services.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

/**
 * Created by InnocentTIALO on 3/21/2020.
 */
@Controller
public class PropertyInjectedController {

    @Autowired
    private GreetingService greetingServiceImpl1;

    public String sayHello(){
        return greetingServiceImpl1.sayGreetings();
    }
}
