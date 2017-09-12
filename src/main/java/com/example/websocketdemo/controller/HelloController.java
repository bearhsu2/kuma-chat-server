package com.example.websocketdemo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by bearhsu2 on 9/12/2017.
 */
@RestController
public class HelloController {
    //@RestController combines @Controller and @ResponseBody

    @RequestMapping("/sayHello")
    public String index() {

        return "Greetings from Spring Boot!";
    }

    @RequestMapping("/getTicket")
    public String getTicket() {

        return "FDG33ncS87wSvRqeAF3";
    }

    @RequestMapping("/abc")
    public String indexABC() {

        return "Greetings from Spring Boot!ABC";
    }

}
