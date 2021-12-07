package com.javaex.api.objetclass.v1;

public class LangClassTest {

	public static void main(String[] args) {
		Point p = new Point(10, 10);
		
		// 오브젝트의 메서드를 기본 상속
		System.out.println(p.getClass().getName());
		System.out.println(p.hashCode()); // 객체 식별자
		System.out.println(Integer.toHexString(p.hashCode()));
		System.out.println(p); // 특정 객체를 문자열화할 때 toString 이 속해져 있어서 문자열화 됨 
		System.out.println(p.toString()); // == System.out.println(p)
		
	}

}
