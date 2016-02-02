package com.theworm.websocket.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.theworm.websocket.dao.MapDao;
import com.theworm.websocket.model.Map;



@Service
public class MapService {
	@Autowired
	private MapDao mapDao;
	
	public List<Map> getCurrent(){
		return mapDao.getMaps();
	}
	
	public void create(Map map){
		mapDao.create(map);
	}
	
	public boolean updateMap(Map map){
		return mapDao.update(map);
	}
	
	public Map findId(int mapid){
		return mapDao.findId(mapid);
	}
}
