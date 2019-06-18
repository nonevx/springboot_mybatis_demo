package com.vxzones.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/")
public class AppController {
	
	@RequestMapping(value = "", method = RequestMethod.GET)
    public String getInfo() {
        return "Welcome!";
    }
}




