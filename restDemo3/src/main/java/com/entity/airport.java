package com.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class airport 

{
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private int airportid;
private String airportname;
private int cityid;
private int stateid;
private int hubid;

	

public int getAirportid() {
	return airportid;
}

public airport() {
	super();
	// TODO Auto-generated constructor stub
}

public airport(int airportid, String airportname, int cityid, int stateid, int hubid) {
	super();
	this.airportid = airportid;
	this.airportname = airportname;
	this.cityid = cityid;
	this.stateid = stateid;
	this.hubid = hubid;
}

@Override
public String toString() {
	return "airport [airportid=" + airportid + ", airportname=" + airportname + ", cityid=" + cityid + ", stateid="
			+ stateid + ", hubid=" + hubid + "]";
}

public void setAirportid(int airportid) {
	this.airportid = airportid;
}

public String getAirportname() {
	return airportname;
}

public void setAirportname(String airportname) {
	this.airportname = airportname;
}

public int getCityid() {
	return cityid;
}

public void setCityid(int cityid) {
	this.cityid = cityid;
}

public int getStateid() {
	return stateid;
}

public void setStateid(int stateid) {
	this.stateid = stateid;
}

public int getHubid() {
	return hubid;
}

public void setHubid(int hubid) {
	this.hubid = hubid;
}


}
