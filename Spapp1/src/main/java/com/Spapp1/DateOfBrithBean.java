package com.Spapp1;

public class DateOfBrithBean {
	private int day;
	private String month;
	private int year;
	public void setDay(int day) {
		this.day = day;
	}
	public void setMonth(String month) {
		this.month = month;
	}
	public void setYear(int year) {
		this.year = year;
	}
	@Override
	public String toString() {
		return "[day=" + day + ", month=" + month + ", year=" + year + "]";
	}
	
	
}
