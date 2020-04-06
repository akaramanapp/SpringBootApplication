package com.demoapplication.Entity;

public class Ticket {
	private long ID;
	private String Name;
	
	
	
	public Ticket() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Ticket(long iD, String name) {
		super();
		ID = iD;
		Name = name;
	}

	public long getID() {
		return ID;
	}
	
	public void setID(long iD) {
		ID = iD;
	}
	
	public String getName() {
		return Name;
	}
	
	public void setName(String name) {
		Name = name;
	}
}