package com.Spapp4;



public class DateOfBrithBean {
	private int day;
	private String month;
	private int year;

	public void setDay(int day) {
		this.day = day;
	}
	//@Required//checks if a particular property has been set or not. 

	public void setMonth(String month) {
		this.month = month;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public int getDay() {
		return day;
	}

	public String getMonth() {
		return month;
	}

	public int getYear() {
		return year;
	}

	@Override
	public String toString() {
		return "[day=" + day + ", month=" + month + ", year=" + year + "]";
	}

}
