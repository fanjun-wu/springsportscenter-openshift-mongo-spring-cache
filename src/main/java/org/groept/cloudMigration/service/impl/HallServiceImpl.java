package org.groept.cloudMigration.service.impl;

import java.util.List;

import org.bson.types.ObjectId;
import org.groept.cloudMigration.dao.CourtDao;
import org.groept.cloudMigration.dao.HallDao;
import org.groept.cloudMigration.model.CacheRecord;
import org.groept.cloudMigration.model.Court;
import org.groept.cloudMigration.model.Hall;
import org.groept.cloudMigration.service.CacheRecordService;
import org.groept.cloudMigration.service.HallService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class HallServiceImpl implements HallService {

	@Autowired
	private HallDao hallDao;
	@Autowired
	private CourtDao courtDao;
	@Autowired
	private CacheRecordService cacheRecordService; 
	
	
	@Override
	public void saveHall(Hall hall) {
		// TODO Auto-generated method stub
		hallDao.save(hall);
	}
	@Override
	public void editHall(Hall hall) {
		// TODO Auto-generated method stub
		hallDao.save(hall);
	}

	@Override
	public void deleteHall(ObjectId hallId) {
		// TODO Auto-generated method stub
		hallDao.delete(hallDao.findById(hallId));
	}

	@Override
	public Hall getHall(ObjectId hallId) {
		// TODO Auto-generated method stub
		return hallDao.findById(hallId);
	}
	
	@Cacheable("halls")
	@Override
	public List<Hall> getHalls() {
		// TODO Auto-generated method stub
		CacheRecord cacheRecord=new CacheRecord(0,1,new java.util.Date());
		cacheRecordService.saveCacheRecord(cacheRecord);
		
		
		return (List<Hall>) hallDao.findAll();
	}
	@Override
	public void addCourt(ObjectId hallId, ObjectId courtId) {
		// TODO Auto-generated method stub
		
		Court c=courtDao.findById(courtId);
		
		Hall h=hallDao.findById(hallId);
		c.setHall(h);
		
		h.addCourt(c);
		
		hallDao.save(h);
		courtDao.save(c);
		
		
		System.out.println("fdsfsd");

		
	}
	
	
	
	@Override
	public List listofCourts(ObjectId hallId){
		
		Hall h=hallDao.findById(hallId);
		return h.getCourt();
	
	}
	

}
