package com.vxzones.controller;

//import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.vxzones.pojo.InfoA;
import com.vxzones.service.InfoaService;

@RestController
@RequestMapping("/lista")
public class InfoaController {
	
	@Autowired
	InfoaService infoaService;
	
	@RequestMapping(value = "", method = RequestMethod.GET)
    public String getInfoA() {
        return "/lista";
    }
	
	@CrossOrigin(origins = "http://www.csbr.org.cn/")
	@RequestMapping(value = "", method = RequestMethod.POST)
    public String postAccount(@RequestBody InfoA infoA4Save) throws Exception {
       int count = infoaService.saveInfoa(infoA4Save);
       if(count==1) {
           return "success";
       }else {
           return "fail";
       }
    }
}
