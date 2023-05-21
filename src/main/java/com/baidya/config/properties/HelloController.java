package com.baidya.config.properties;

import com.baidya.config.properties.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HelloController {

    @Autowired
    private User user;
    @GetMapping
    public String sayHello(){
        return String.format("Hello Mr. %s %s, Designation : %s, Salary: %s ",
                user.getFirstName(),user.getLastName(), user.getDesignation(),
                user.getSalary());
    }
}
