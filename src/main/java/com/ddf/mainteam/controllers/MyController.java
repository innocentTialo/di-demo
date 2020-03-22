package com.ddf.mainteam.controllers;

import com.ddf.mainteam.services.GreetingService;
import org.springframework.stereotype.Controller;

/**
 * Created by InnocentTIALO on 3/15/2020.
 */
@Controller
public class MyController {

    private GreetingService greetingServiceImpl1;

    public MyController(GreetingService greetingServiceImpl1) {
        this.greetingServiceImpl1 = greetingServiceImpl1;
    }

    public void hello () {
        System.out.println(greetingServiceImpl1.sayGreetings());
    }
}
