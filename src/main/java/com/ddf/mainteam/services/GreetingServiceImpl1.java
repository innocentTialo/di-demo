package com.ddf.mainteam.services;

import org.springframework.stereotype.Service;

/**
 * Created by InnocentTIALO on 3/21/2020.
 */
@Service
public class GreetingServiceImpl1 implements GreetingService {
    @Override
    public String sayGreetings() {
        System.out.println("blablabla...");
        return "blablabla...";
    }
}
