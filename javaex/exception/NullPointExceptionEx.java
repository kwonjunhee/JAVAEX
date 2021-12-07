package com.javaex.exception;

public class NullPointExceptionEx {

	public static void main(String[] args) {
		String str = new String("hello");
		str = null;
		
		System.out.println(str.toString());
	}

}
