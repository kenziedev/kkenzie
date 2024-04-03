package com.example.kkenzie;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class KkenzieApplication {

    @GetMapping("/")
    public String kkenzie(){
        return "k kenzie page - not loadbalance";
    }
    public static void main(String[] args) {
        SpringApplication.run(KkenzieApplication.class, args);
    }

}
