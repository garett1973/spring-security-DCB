package net.virgis.tutorials.springsecurityclient.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @GetMapping("/test")
    public String testString() {
        return "This is a test string for testing spring security";
    }
}
