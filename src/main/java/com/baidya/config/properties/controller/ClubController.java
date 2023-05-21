package com.baidya.config.properties.controller;

import com.baidya.config.properties.pojo.Club;
import com.baidya.config.properties.service.ClubService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/club")
public class ClubController {

    @Autowired private ClubService clubService;
    @GetMapping()
    public Club club(){
        return clubService.fetchClub();
    }
}
