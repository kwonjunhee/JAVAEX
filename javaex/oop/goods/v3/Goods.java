package com.javaex.oop.goods.v3;

// v3: 생성자
// 객체의 초기화 담당, new 키워드와 함께 호줄

public class Goods {
	// 필드
	private String name;
	private int price;
	
	// 생성자
	// 생성자를 선언하지 않으면 자바 컴파일러가 기본 생성자를 끼워 넣는다.
	// 생성자를 하나라도 선언했다면 자바 컴파일러는 기본 생성자를 끼워 넣지 않는다.
	public Goods(String name, int price) {
		this.name = name;
		this.price = price;
	}
	
	
	// 외부 접근 방식 노출
	// getter / setter
	public String getName() {
		return name;
	}
	
//	setter가 없으면 ReadOnly
//	public void setName(String name) {
//		this.name = name;
//	}

	public int getPrice() {
		return price;
	}
	
//	public void setPrice(int price) {
//		this.price = price;
//	}
//	
	public void showInfo() {
		System.out.println("상품명: " + name);
		System.out.println("가격: " + price);
	}
}
