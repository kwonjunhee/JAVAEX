package com.javaex.oop.point.v4;

public class ColorPoint extends Point {
	private String color;
	
	public ColorPoint(int x, int y, String color) {
		super(x, y);
		this.color = color;
	}
	
	@Override
	public void draw(boolean bDraw) {
		String message = String.format("색깔점[x=%d, y=%d, color=%s]을 ", x, y, color);
		message += bDraw ? "그렸습니다.": "지웠습니다.";
		System.out.println(message);
		
	}

}
