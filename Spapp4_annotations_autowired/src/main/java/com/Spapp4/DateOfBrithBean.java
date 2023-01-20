package com.Spapp4;

import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Component
@Configuration
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
