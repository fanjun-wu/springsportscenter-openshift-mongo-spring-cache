package org.groept.cloudMigration.model;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;




import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;


 
@Document
public class TimeInterval
{
 
	@Id
    private ObjectId id;

	private int startTime;
	
	private Date date;
	 
	@DBRef(lazy=true)
	private Set<Reservation> reservation;
	 
	
 
	public TimeInterval(int startTime, Date date) {
		 
		this.startTime = startTime;
		this.date = date;
	}


	public TimeInterval(){
		
	}
 
	 
	public Set<Reservation> getReservation() {
		if(this.reservation == null) {
				this.reservation = new HashSet<Reservation>();
		}
		return (Set<Reservation>) this.reservation;	
	}
	
	 
	public void addAllReservation(Set<Reservation> newReservation) {
		if (this.reservation == null) {
			this.reservation = new HashSet<Reservation>();
		}
		for (Reservation tmp : newReservation)
			tmp.addTimeInterval(this);
			
	}
	
	 
	public void removeAllReservation(Set<Reservation> newReservation) {
		if(this.reservation == null) {
			return;
		}
		
		this.reservation.removeAll(newReservation);	
	}
	 
	 
	 
	public void addReservation(Reservation newReservation) {
		if(this.reservation == null) {
			this.reservation = new HashSet<Reservation>();
		}
		
		reservation.add(newReservation);
			//newReservation.addTimeInterval(this);	
	}
	 
	public void removeReservation(Reservation oldReservation) {
		if(this.reservation == null)
			return;
		
		if (this.reservation.remove(oldReservation))
			oldReservation.removeTimeInterval(this);
			
	}
	
	 
	public ObjectId getId() {
		return id;
	}

	public void setId(ObjectId id) {
		this.id = id;
	}

	public int getStartTime() {
		return startTime;
	}

	public void setStartTime(int startTime) {
		this.startTime = startTime;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public void unsetStartTime() {
		this.startTime = 0;	
	}
	
	 
	public void unsetDate() {
		this.date = null;	
	}
	 

	
	 
	public void unsetId() {
		this.id = null;	
	}
	

	
}

