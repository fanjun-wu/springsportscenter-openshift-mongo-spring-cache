package org.groept.cloudMigration.model;


import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;



@Document
public class Admin extends Person
{
	
	
	private String privilege;
	
	
	
					
	@DBRef(lazy=true) 
	private Hall hall;

	
	public String getPrivilege() {
		return privilege;
	}


	public void setPrivilege(String privilege) {
		this.privilege = privilege;
	}


	
	public void unsetPrivilege() {
		this.privilege = "";	
	}
	

	public Admin( String name, String email, String telephone,
			String gender, int age,String privilege) {
		super( name, email, telephone, gender, age);
		this.privilege=privilege;
		// TODO Auto-generated constructor stub
	}
	
	public Admin(){
		
	}


	
	
	
	public void basicSetHall(Hall myHall) {
		if (this.hall != myHall) {
			if (myHall != null){
				if (this.hall != myHall) {
					Hall oldhall = this.hall;
					this.hall = myHall;
					if (oldhall != null)
						oldhall.unsetAdmin();
				}
			}
		}	
	}
	


	

	public Hall getHall() {
		return this.hall;	
	}
	
	
	public void setHall(Hall hall) {
		this.hall = hall;
	}
	
	/*public void setHall(Hall myHall) {
		this.basicSetHall(myHall);
		myHall.basicSetAdmin(this);
			
	}*/
	

	
	
	public void unsetHall() {
		if (this.hall == null)
			return;
		Hall oldhall = this.hall;
		this.hall = null;
		oldhall.unsetAdmin();	
	}



	
	
	
}

