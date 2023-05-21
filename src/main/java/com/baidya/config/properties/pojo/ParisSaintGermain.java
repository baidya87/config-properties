package com.baidya.config.properties.pojo;

import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix = "club")
@Profile("psg")
@Getter
@Setter
public class ParisSaintGermain implements  Club{
    private String name;
    private String manager;
    private String stadium;
    @Value("${club.stadium.capacity}")
    private String capacity;
}
