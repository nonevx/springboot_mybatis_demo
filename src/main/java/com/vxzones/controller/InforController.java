package com.vxzones.controller;

//import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.vxzones.pojo.InfoR;
import com.vxzones.service.InforService;

@RestController
@RequestMapping("/listr")
public class InforController {
	@Autowired
	InforService inforService;
	
	@RequestMapping(value = "", method = RequestMethod.GET)
    public String  getInfoR() {
        return "/listr!";
    }
	
	@CrossOrigin(origins = "http://www.csbr.org.cn/")
	@RequestMapping(value = "", method = RequestMethod.POST)
    public String postAccount(@RequestBody InfoR infoR4Save) throws Exception {
       int count = inforService.saveInfor(infoR4Save);
       if(count==1) {
           return "success";
       }else {
           return "fail";
       }
    }
}
