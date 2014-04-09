package org.groept.cloudMigration.frontend.controller;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import org.groept.cloudMigration.model.Admin;
import org.groept.cloudMigration.model.Capability;
import org.groept.cloudMigration.model.Court;
import org.groept.cloudMigration.model.Hall;
import org.groept.cloudMigration.model.Reservation;
import org.groept.cloudMigration.model.Subscriber;
import org.groept.cloudMigration.model.TimeInterval;
import org.groept.cloudMigration.service.AdminService;
import org.groept.cloudMigration.service.CapabilityService;
import org.groept.cloudMigration.service.CourtService;
import org.groept.cloudMigration.service.HallService;
import org.groept.cloudMigration.service.ReservationService;
import org.groept.cloudMigration.service.SubscriberService;
import org.groept.cloudMigration.service.TimeIntervalService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

public class javatest {
	
	
	private CapabilityService capabilityService;
	private TimeIntervalService timeIntervalService;
	private AdminService adminService;
	private CourtService courtService;
	private HallService hallService;
	private ReservationService reservationService;
	private SubscriberService subscriberService;
	@RequestMapping(value="/mediumDataFacility",method=RequestMethod.GET)
	public void frontendtest0()
	{
		
		
		Capability BK=new Capability("Basketball","good","no");
		Capability BD=new Capability("Badminton","good","no");
		
		Capability TN=new Capability("Tennis","good","no");
		Capability PP=new Capability("Pingpong","good","no");
		
		Set<Capability> BBCapSet=new HashSet<Capability>();
		Set<Capability> BKCapSet=new HashSet<Capability>();
		Set<Capability> BDCapSet=new HashSet<Capability>();
		Set<Capability> TNCapSet=new HashSet<Capability>();
		Set<Capability> PPCapSet=new HashSet<Capability>();
		
		BBCapSet.add(BD);
		BBCapSet.add(BK);
		
		BKCapSet.add(BK);
		BDCapSet.add(BD);
		TNCapSet.add(TN);
		PPCapSet.add(PP);
		
		
		Court B1=new Court("B1","no");
		B1.setCapability(BDCapSet);		
		Court B2=new Court("B2","no");
		B2.setCapability(BDCapSet);
		Court B3=new Court("B3","no");
		B3.setCapability(BDCapSet);
		Court B4=new Court("B4","no");
		B4.setCapability(BKCapSet);
		Court B5=new Court("B5","no");
		B5.setCapability(BKCapSet);
		Court B6=new Court("B6","no");
		B6.setCapability(BKCapSet);
		
		
		
		Court TN1=new Court("TN1","no");
		TN1.setCapability(TNCapSet);
		Court TN2=new Court("TN2","no");
		TN2.setCapability(TNCapSet);
		Court TN3=new Court("TN3","no");
		TN3.setCapability(TNCapSet);
		Court TN4=new Court("TN4","no");
		TN4.setCapability(TNCapSet);
		
		Court PP1=new Court("PP1","no");
		PP1.setCapability(PPCapSet);
		Court PP2=new Court("PP2","no");
		PP2.setCapability(PPCapSet);
		Court PP3=new Court("PP3","no");
		PP3.setCapability(PPCapSet);
		Court PP4=new Court("PP4","no");
		PP4.setCapability(PPCapSet);
		Court PP5=new Court("PP5","no");
		PP5.setCapability(PPCapSet);
		Court PP6=new Court("PP6","no");
		PP6.setCapability(PPCapSet);
		
		
		Set<Court> courtSet=new HashSet<Court>();
		courtSet.add(PP6);
		courtSet.add(PP5);
		courtSet.add(PP4);
		courtSet.add(PP3);
		courtSet.add(PP2);
		courtSet.add(PP1);
		courtSet.add(TN4);
		courtSet.add(TN3);
		courtSet.add(TN2);
		courtSet.add(TN1);
		courtSet.add(B6);
		courtSet.add(B5);
		courtSet.add(B4);
		courtSet.add(B3);
		courtSet.add(B2);
		courtSet.add(B1);

		Admin admin=new Admin("conna","conna@gmail.com","0483359884","M",23,"admin");
		
		adminService.saveAdmin(admin);
		
		Hall hall=new Hall("HALL1",8,22,"no");
		hall.setAdmin(admin);
		
		hallService.saveHall(hall);
		
		
		for(Court c:courtSet)
		{
			c.setHall(hall);
			courtService.saveCourt(c);
		}
			
		

	}
	
	
	
	public Date getDateByString(String dateString)
	{
		
		SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");		
		
		Date date=new Date();
		try {
			date = formatter.parse(dateString);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return date;		
	}
	
	
	
	
	@RequestMapping(value="/mediumDataReservation",method=RequestMethod.GET)
	public void frontendreservationtest0()
	{
		
		Subscriber s1=new Subscriber("lihua1","lihua1@gmail.com","0254846854","M",23,"dsqdq484sdqsdsq");
		Subscriber s2=new Subscriber("lihua2","lihua2@gmail.com","0254846854","M",23,"dsqdq484sdqsdsq");
		Subscriber s3=new Subscriber("lihua3","lihua3@gmail.com","0254846854","M",23,"dsqdq484sdqsdsq");
		Subscriber s4=new Subscriber("lihua4","lihua4@gmail.com","0254846854","M",23,"dsqdq484sdqsdsq");
		Subscriber s5=new Subscriber("lihua5","lihua5@gmail.com","0254846854","M",23,"dsqdq484sdqsdsq");
		
		subscriberService.saveSubscriber(s1);  
		subscriberService.saveSubscriber(s2);  
		subscriberService.saveSubscriber(s3);  
		subscriberService.saveSubscriber(s4);  
		subscriberService.saveSubscriber(s5);  
		
		
		TimeInterval t1=new TimeInterval(9,getDateByString("2014-3-20"));
		TimeInterval t2=new TimeInterval(9,getDateByString("2014-3-20"));
		TimeInterval t3=new TimeInterval(10,getDateByString("2014-3-20"));
		TimeInterval t4=new TimeInterval(11,getDateByString("2014-3-20"));
		TimeInterval t5=new TimeInterval(12,getDateByString("2014-3-20"));
						
		Set<TimeInterval> timeIntervals1=new HashSet<TimeInterval>();
		timeIntervals1.add(t1);
		Set<TimeInterval> timeIntervals2=new HashSet<TimeInterval>();
		timeIntervals2.add(t2);
		Set<TimeInterval> timeIntervals3=new HashSet<TimeInterval>();
		timeIntervals3.add(t3);
		Set<TimeInterval> timeIntervals4=new HashSet<TimeInterval>();
		timeIntervals4.add(t4);
		Set<TimeInterval> timeIntervals5=new HashSet<TimeInterval>();
		timeIntervals5.add(t5);
		
		Reservation r1=new Reservation("book basket","no");
		Reservation r2=new Reservation("book basket","no");
		Reservation r3=new Reservation("book badminton","no");
		Reservation r4=new Reservation("book badminton","no");
		Reservation r5=new Reservation("book tennis","no");
		
		
		Court courtTemp=new Court();
		for(int i=0;i<courtService.getCourts().size();i++)
		{			
			Court ct=(Court)courtService.getCourts().get(i);
			for(Capability cap:ct.getCapability())
			{
				if(cap.getResource().equalsIgnoreCase("basketball"))
				{
					r1.setCourt(ct);
					r2.setCourt(ct);
				}
				if(cap.getResource().equalsIgnoreCase("badminton"))
				{
					r3.setCourt(ct);
					r4.setCourt(ct);
				}					
				if(cap.getResource().equalsIgnoreCase("tennis"))
				{
					r5.setCourt(ct);
					
				}
			}
		}
		
		r1.setSubscriber(s1);		
		r1.setTimeInterval(timeIntervals1);
		
		r2.setSubscriber(s2);		
		r2.setTimeInterval(timeIntervals2);
				
		r3.setSubscriber(s3);		
		r3.setTimeInterval(timeIntervals3);
			
		r4.setSubscriber(s4);		
		r4.setTimeInterval(timeIntervals4);
			
		r5.setSubscriber(s5);		
		r5.setTimeInterval(timeIntervals5);
		
		
		//save Reservation, TimeInterval, Court, Subscriber in relation
		reservationService.saveReservation(r1); 
		reservationService.saveReservation(r2); 
		reservationService.saveReservation(r3); 
		reservationService.saveReservation(r4); 
		reservationService.saveReservation(r5); 
	}
	
	

}
