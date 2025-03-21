package lk.ac.vau.fas.myapp.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
@RequestMapping("/app")
public class Appcontroller {
    @GetMapping("/msg")
    public String myMessage() {
        return "Hello Spring Boot...";
    }

    @GetMapping("/name")
    public String myName() {
        return "My name is Spring Boot";
    }
    
}
