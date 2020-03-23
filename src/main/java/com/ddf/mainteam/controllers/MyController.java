package com.ddf.mainteam.controllers;

import com.ddf.mainteam.services.GreetingService;
import org.springframework.stereotype.Controller;

/**
 * Created by InnocentTIALO on 3/15/2020.
 */
@Controller
public class MyController {

    private GreetingService greetingService;

    public MyController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public void hello () {
        System.out.println(greetingService.sayGreetings());
    }
}
