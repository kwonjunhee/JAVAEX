package com.javaex.oop.point.v4;


// 상속 받기
public class ColotPoint extends Point {
	private String color;
	
	public ColotPoint(int x, int y, String color) {
		super(x, y);  // 부모 생성자
		this.color = color;
	}
	// 컴파일러에게 이 메서드가 오버라이딩한 메서드인지를 확인
	@Override
	
	public void draw(boolean bDraw) {
		// 부모로부터 물려 받은 메서드를 덮어쓰기
		String message = String.format("색깔점[x=%d, y=%d, color =%s]을 ",x,y, color);
		message += bDraw ? "그렸습니다.": "지웠습니다.";
		System.out.println(message);
		
		// 부모의 메서드를 호출하려면
		super.draw(bDraw);
	}
}
