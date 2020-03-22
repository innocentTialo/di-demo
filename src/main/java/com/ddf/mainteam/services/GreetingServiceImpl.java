package com.ddf.mainteam.services;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

/**
 * Created by InnocentTIALO on 3/21/2020.
 */
@Service
public class GreetingServiceImpl implements GreetingService {

    private static final String HELLO_GURUS = "Hello Gurus!!!!!!!!!!";

    @Override
    public String sayGreetings() {
        return HELLO_GURUS;
    }
}
