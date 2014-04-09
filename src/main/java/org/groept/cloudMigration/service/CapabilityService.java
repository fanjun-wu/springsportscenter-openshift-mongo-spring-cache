package org.groept.cloudMigration.service;

import java.util.List;

import org.bson.types.ObjectId;
import org.groept.cloudMigration.model.Capability;


public interface CapabilityService {

	public void saveCapability(Capability capability);
	public void editCapability(Capability capability);
	public void deleteCapability(ObjectId capabilityId);
	public Capability getCapability(ObjectId capabilityId);
	public List getCapabilities();
}
