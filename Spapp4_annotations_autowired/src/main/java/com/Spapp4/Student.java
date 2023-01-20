package com.Spapp4;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;
@Component
@Configuration
public class Student {

	private int rollno;
	private float persentage;
	private String name;
	@Autowired//if we remove this it will show null that field
	private DateOfBrithBean dateOfBrithBean;

	public int getRollno() {
		return rollno;
	}

	public float getPersentage() {
		return persentage;
	}

	public String getName() {
		return name;
	}

	public DateOfBrithBean getDateOfBrithBean() {
		return dateOfBrithBean;
	}

	public void setRollno(int rollno) {
		this.rollno = rollno;
	}

	public void setPersentage(float persentage) {
		this.persentage = persentage;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setDateOfBrithBean(DateOfBrithBean dateOfBrithBean) {
		this.dateOfBrithBean = dateOfBrithBean;
	}

	@Override
	public String toString() {
		return "[rollno=" + rollno + ", persentage=" + persentage + ", name=" + name + ", dateOfBrithBean="
				+ dateOfBrithBean + "]";
	}

}
