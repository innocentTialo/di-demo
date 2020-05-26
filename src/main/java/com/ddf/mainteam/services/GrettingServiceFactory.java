package com.ddf.mainteam.services;

/**
 * Created by InnocentTIALO on 5/25/2020.
 */
public class GrettingServiceFactory {
    private final GreetingRepository greetingRepository;

    public GrettingServiceFactory(GreetingRepository greetingRepository) {
        this.greetingRepository = greetingRepository;
    }

    /*public GreetingService createGreetingService(String lang) {
        switch (lang) {
            case "en":
                return new PrimaryGreetingService();
        }
    }*/
}
