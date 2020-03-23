package com.ddf.mainteam.services;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

/**
 * Created by InnocentTIALO on 3/21/2020.
 */
@Service
public class SetterGreetingService implements GreetingService {
    @Override
    public String sayGreetings() {
        return "Hello - I was injected by the setter!!!!";
    }
}
