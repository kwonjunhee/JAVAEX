package com.javaex.api.last;

public class WrapperEx {
	public static void main(String[] args) {
		Integer i = new Integer(10); // deprecated
		Integer i2 = Integer.valueOf(10);
		
		Integer i3= Integer.valueOf("10");
		
		// 자동 박싱
		Integer i4 = 10; // Integer i4 = Integer.valueOf10)
		
		// 자동 언박싱
		int value = i4; // int value = i4.intvalue();
		
		// 포장된 값의 비교
		System.out.println(i == i2); // Wra[[er 클래스도 객페다. 객체 주소의 비교
		System.out.println(i.intValue() == i2.intValue());
		System.out.println(i.equals(i2));
	}
}
