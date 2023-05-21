package com.baidya.config.properties.dbconfig;

import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Getter
@Setter
public class DBConfig {

    private String username;
    @Value("${dbconfig.password}")
    private String password;
    private String url;
    private String driver;




}
