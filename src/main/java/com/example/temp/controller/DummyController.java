package com.example.temp.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DummyController {

    @RequestMapping("/")
    public String fileDemo(){
        return "Dummy first endpoint";
        //"<HTML><BODY><p>welcome</p></BODY></HTML>";
    }
}
