package com.baidya.config.properties.pojo;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@ConfigurationProperties(prefix = "user")
@Getter
@Setter
@Component
public class User {
    private String firstName;
    private String lastName;
    private String designation;
    private Integer salary;
}
