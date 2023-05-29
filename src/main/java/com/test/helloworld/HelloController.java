package com.test.helloworld;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @RequestMapping("/")
    public String helloWorld(){
        return "HELLO WORLD!!!!!!  THIS IS SATHEESH";
    }
}
