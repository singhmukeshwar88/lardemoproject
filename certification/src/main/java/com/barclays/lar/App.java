/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package com.barclays.lar;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class App {
    public String getGreeting() {
        return "Hello world.";
    }

    public static void main(String[] args) {
        //System.out.println(new DisclosureApp().getGreeting());
        SpringApplication.run(App.class, args);
    }
}
