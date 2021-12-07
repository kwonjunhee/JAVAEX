package com.javaex.oop.point.v2;

public class PointApp {

	public static void main(String[] args) {
		// 기본 생성자 호출
		Point p1 = new Point();
		p1.setX(10);
		p1.setY(20);
		p1.draw();
		
		
		Point p2 = new Point(30, 40);
		p2.draw();
	}

}
