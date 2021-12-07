package com.javaex.oop.practice031;

public class Member {
	private String id;
	private String name;
	private int point;
	
	public Member (String id, String name, int point) {
		this.id = id;
		this.name = name;
		this.point = point;
	}

	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPoint() {
		return point;
	}
	public void setPoint(int point) {
		this.point = point;
	}
	
	public void showInfo() {
		System.out.printf("회원님의 id는 %s, 성함은 %s, 포인트는 %d 점입니다.", id, name, point);
	}

}
