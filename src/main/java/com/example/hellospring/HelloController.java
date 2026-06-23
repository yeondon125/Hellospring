package com.example.hellospring;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {


    @GetMapping("/hello")
    public String hello(@RequestParam(defaultValue = "world") String name) {
        return "Hello, " + name + "!";
    }

    @GetMapping("/hello-json")
    public HelloResponse helloJson(@RequestParam(defaultValue = "world") String name) {
        return new HelloResponse(name, "Hello, " + name + "!");
    }

    @GetMapping("/members/{id}")
    public String getMember(@PathVariable Long id) {
        return "회원 ID : " + id;
    }
}
