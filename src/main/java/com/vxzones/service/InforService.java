package com.vxzones.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vxzones.dao.InforMapper;
import com.vxzones.pojo.InfoR;

@Service
public class InforService {
	@Autowired(required = false)
	private InforMapper mapper;
	
	public List<InfoR> queryList(){
		List<InfoR> inforList=mapper.queryList();
		return inforList;
	}
 
    public InfoR findById(int infoUid){
        System.out.println("infoUid:"+infoUid);
        return mapper.findById(infoUid);
    }
    
    public int saveInfor(InfoR infoR) {
    	return mapper.saveInfor(infoR);
	}
}
