package com.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class car_category {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int categoryid;
	private float DailyRates;
	private float WeeklyRates;
	private float MonthlyRates;
	private String categoryname;
	public int getCategoryid() {
		return categoryid;
	}
	public void setCategoryid(int categoryid) {
		this.categoryid = categoryid;
	}
	public float getDailyRates() {
		return DailyRates;
	}
	public void setDailyRates(float dailyRates) {
		DailyRates = dailyRates;
	}
	public float getWeeklyRates() {
		return WeeklyRates;
	}
	public void setWeeklyRates(float weeklyRates) {
		WeeklyRates = weeklyRates;
	}
	public float getMonthlyRates() {
		return MonthlyRates;
	}
	public void setMonthlyRates(float monthlyRates) {
		MonthlyRates = monthlyRates;
	}
	public String getCategoryname() {
		return categoryname;
	}
	public void setCategoryname(String categoryname) {
		this.categoryname = categoryname;
	}
	public car_category(int categoryid, float dailyRates, float weeklyRates, float monthlyRates, String categoryname) {
		super();
		this.categoryid = categoryid;
		DailyRates = dailyRates;
		WeeklyRates = weeklyRates;
		MonthlyRates = monthlyRates;
		this.categoryname = categoryname;
	}
	public car_category() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
