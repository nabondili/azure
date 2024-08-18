package com.azure.webapp.com.azure.webapp.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.nio.file.Path;

@RestController
public class WebController {

    @GetMapping(path = "/")
    public String getHello(){
        return "Hello From Azure";
    }
}
