package com.javaex.oop.problem02;

import java.util.Scanner;

public class Friend {
	
	private String name;
	private String phoneNumber;
	private String school;
	
	public Friend (String name, String phoneNumber, String school) {
		this.name = name;
		this.phoneNumber = phoneNumber;
		this.school = school;
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("친구를 3명 등록해주세요");
		name = scanner.next(this.name);
		phoneNumber = scanner.next(this.phoneNumber);
		school = scanner.next(this.school);
		
		
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getSchool() {
		return school;
	}

	public void setSchool(String school) {
		this.school = school;
	}
	

	}
}
