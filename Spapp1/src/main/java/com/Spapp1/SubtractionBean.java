package com.Spapp1;

public class SubtractionBean {
	// Dependency in the form of Primitives

	private int num1, num2;

	public SubtractionBean(int num1, int num2) {
		this.num1 = num1;
		this.num2 = num2;
	}

	public int doSum() {
		return num1 - num2;

	}

}
