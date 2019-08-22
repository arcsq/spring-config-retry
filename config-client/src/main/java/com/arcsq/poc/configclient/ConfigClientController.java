package com.arcsq.poc.configclient;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConfigClientController {

    @Value("${application.name}")
    private String name;

    @GetMapping("name")
    public String getNameOfApp() {
        return "Name of the app: " + name;
    }

}
