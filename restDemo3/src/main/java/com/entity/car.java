package com.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class car
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
private int categoryid;

private float daily_rates;

private float weekly_rates;

private float monthly_rates;

private String categoryname;

public car() {
	super();
	// TODO Auto-generated constructor stub
}

public car(int categoryid, float daily_rates, float weekly_rates, float monthly_rates, String categoryname) {
	super();
	this.categoryid = categoryid;
	this.daily_rates = daily_rates;
	this.weekly_rates = weekly_rates;
	this.monthly_rates = monthly_rates;
	this.categoryname = categoryname;
}

@Override
public String toString() {
	return "car [categoryid=" + categoryid + ", daily_rates=" + daily_rates + ", weekly_rates=" + weekly_rates
			+ ", monthly_rates=" + monthly_rates + ", categoryname=" + categoryname + "]";
}

public int getCategoryid() {
	return categoryid;
}

public void setCategoryid(int categoryid) {
	this.categoryid = categoryid;
}

public float getDaily_rates() {
	return daily_rates;
}

public void setDaily_rates(float daily_rates) {
	this.daily_rates = daily_rates;
}

public float getWeekly_rates() {
	return weekly_rates;
}

public void setWeekly_rates(float weekly_rates) {
	this.weekly_rates = weekly_rates;
}

public float getMonthly_rates() {
	return monthly_rates;
}

public void setMonthly_rates(float monthly_rates) {
	this.monthly_rates = monthly_rates;
}

public String getCategoryname() {
	return categoryname;
}

public void setCategoryname(String categoryname) {
	this.categoryname = categoryname;
}


}
