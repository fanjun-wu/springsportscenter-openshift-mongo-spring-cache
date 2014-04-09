package org.groept.cloudMigration.service;

import java.util.List;

import org.bson.types.ObjectId;
import org.groept.cloudMigration.model.Hall;


public interface HallService {
	public void saveHall(Hall hall);
	public void editHall(Hall hall);
	public void deleteHall(ObjectId hallId);
	public Hall getHall(ObjectId hallId);
	public List getHalls();
	public void addCourt(ObjectId hallId, ObjectId courtId);
	public List listofCourts(ObjectId hallId);

	
}
