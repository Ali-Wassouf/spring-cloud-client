package com.ali.wassouf.spring.cloud.client.controller;

import com.ali.wassouf.spring.cloud.client.properties.TestProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConfigClientController
{

    private final TestProperties testProperties;

    public ConfigClientController(TestProperties testProperties) {
        this.testProperties = testProperties;
    }

    @GetMapping("/profile/{name}")
    public String getActiveProfile(@PathVariable String name ){
        return "Hello "+name+" active profile name is "+testProperties.getProfile();
    }
}
