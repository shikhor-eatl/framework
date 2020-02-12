package com.example.mainapp;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/Framework")
public class InfoController {

    @RequestMapping("/Info")
    public Object info() {
        return "Module: Framework!";
    }
}
