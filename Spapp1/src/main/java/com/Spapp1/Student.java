package com.Spapp1;

public class Student {
//Dependency in primitive
	private int rollno;
	private float persentage;

// Dependence in String
	private String name;

//*****Dependency in Object(Basic)*****
//After adding obj Dependency now this class is have 3 dependency from DOB class now there is 6 Dependency
	private DateOfBrithBean dateOfBrithBean;

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

// To String

	@Override
	public String toString() {
		return "[rollno=" + rollno + ", persentage=" + persentage + ", name=" + name + ", dateOfBrithBean="
				+ dateOfBrithBean + "]";
	}

	

}
