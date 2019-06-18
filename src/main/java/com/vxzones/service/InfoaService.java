package com.vxzones.service;

import java.util.List;
//import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vxzones.dao.InfoaMapper;
import com.vxzones.pojo.InfoA;

@Service
public class InfoaService {
	@Autowired(required = false)
	private InfoaMapper mapper;
	
	public List<InfoA> queryList(){
		List<InfoA> infoaList=mapper.queryList();
		return infoaList;
	}
 
    public InfoA findById(int infoId){
        System.out.println("infoId:"+infoId);
        return mapper.findById(infoId);
    }
    
    public int saveInfoa(InfoA infoA) {
    	return mapper.saveInfoa(infoA);
	}
}
