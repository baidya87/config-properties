package com.baidya.config.properties.pojo;

import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Getter
@Setter
@Profile("cloud")
public class ManchesterCity implements Club{
    @Value("${club.name}")
    private String name;
    @Value("${club.manager}")
    private String manager;
    @Value("${club.stadium}")
    private String stadium;
    @Value("${club.stadium.capacity}")
    private String capacity;
}
