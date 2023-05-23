package com.baidya.config.properties.controller;

import com.baidya.config.properties.dbconfig.DBConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/plan")
public class PlanController {
    @Autowired
    private DBConfig dbConfig;
    @GetMapping
    public String testConnection(){
        dbConfig.testConnection();
        return "Success!";
    }
}
