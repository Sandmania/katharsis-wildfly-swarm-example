package fi.sandmania.wildfly.demo.service;

import javax.enterprise.context.ApplicationScoped;

/**
 * Created by jounilatvatalo on 09/01/2017.
 */
@ApplicationScoped
public class HelloWorldService {

    public String getGreeting() {
        return "Greetings from HelloWorldService!";
    }
}
