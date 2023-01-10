package com.Spapp1;


public class AdditionBean {
	//Dependency in the form of Primitives
	private int num1,num2;

	public AdditionBean() {
		//System.out.println("AdditionBean.AdditionBean()");//sortcut for systrace = "systr"
	}

	public int getNum1() {
		return num1;
	}

	public void setNum1(int num1) {
		this.num1 = num1;
	}

	public int getNum2() {
		return num2;
	}

	public void setNum2(int num2) {
		this.num2 = num2;
	}
	public int doSum() {
		return num1+num2;
		
	}
	
	
 
}
