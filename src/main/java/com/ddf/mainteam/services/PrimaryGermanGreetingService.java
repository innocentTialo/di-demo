package com.ddf.mainteam.services;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

/**
 * Created by InnocentTIALO on 3/22/2020.
 */
@Service
@Profile("de")
@Primary
public class PrimaryGermanGreetingService implements GreetingService {
    @Override
    public String sayGreetings() {
        return "Primärer Begrüßungsdienst";
    }
}
