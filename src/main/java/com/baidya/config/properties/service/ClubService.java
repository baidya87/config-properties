package com.baidya.config.properties.service;

import com.baidya.config.properties.pojo.Club;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClubService {

    @Autowired
    private Club club;
    public Club fetchClub(){
        return club;
    }
}
