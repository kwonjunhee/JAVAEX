package com.javaex.oop.staticmember;

// 목표: 어떤 상황에서든 단 한개의 인스턴스만 유지
public class Singleton {
	// static 블록에서 생성자를 호출
	private static Singleton instance = new Singleton(); // 클래스 자신이 나만의 생성자를 호출. ㄱㅊ
	
	// 생성자
	private Singleton() {
		
	}

	// getter
	public static Singleton getInstance() {
		return instance;
	}
	
	
}
