package fi.sandmania.wildfly.demo.rest;


import org.jboss.arquillian.drone.api.annotation.Drone;
import org.jboss.arquillian.junit.Arquillian;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import static io.restassured.RestAssured.get;
import static org.fest.assertions.Assertions.assertThat;
import static org.hamcrest.CoreMatchers.equalTo;

//@RunWith(Arquillian.class)
public class JAXRSApplicationIT {

    /*@Drone
    WebDriver browser;

    @Test
    public void testIt() {
        browser.navigate().to("http://localhost:8080/hello/greeting");
        assertThat(browser.getPageSource()).contains("Greetings from HelloWorldService!");
    }*/


    @Test
    public void testKatharsisUsersRepository() {
        get("/users/1").then()
                .body("data.type", equalTo("users"));
    }

}