package com.Spapp1;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class IpsEngCollage {
//Dependency in form of collection
	private List<String> studentName;
	private Set<Integer> studentRollno;
	private Map<String, Integer> branchDetails;
	private Properties branchInfos;

	public void setStudentName(List<String> studentName) {
		this.studentName = studentName;
	}

	public void setStudentRollno(Set<Integer> studentRollno) {
		this.studentRollno = studentRollno;
	}

	public void setBranchDetails(Map<String, Integer> branchDetails) {
		this.branchDetails = branchDetails;
	}

	public void setBranchInfos(Properties branchInfos) {
		this.branchInfos = branchInfos;
	}

	// Business method

	public void printstudentName() {
		System.out.println("===== All StudentNames =====");
		for (String name : studentName) {
			System.out.println(name);
		}
	}

	public void printstudentRollno() {
		System.out.println("===== All StudentRollno =====");
		for (Integer rollno : studentRollno) {
			System.out.println(rollno);
		}
	}

	public void printbranchDetails() {
		System.out.println("===== All BranchDetails =====");
		for (Map.Entry<String, Integer> entry : branchDetails.entrySet()) {
			System.out.println(entry.getKey() + "-->" + entry.getValue());
		}
	}

	public void printbranchInfos() {
		System.out.println("===== All BranchInfos =====");
		Set<String> keys = branchInfos.stringPropertyNames();
		for (String key : keys) {
			System.out.println(key+"-->"+ branchInfos.getProperty(key));
		}
	}

}
