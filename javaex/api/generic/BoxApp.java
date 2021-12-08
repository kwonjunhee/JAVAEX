package com.javaex.api.generic;

public class BoxApp {
	public static void main(String[] args) {
		IntBox iBox = new IntBox();
		iBox.setContent(10);
		System.out.println("intBox: " + iBox.getContent());
		
		StringBox sBox = new StringBox();
		sBox.setContent("String");
		System.out.println("StringBox: " + sBox.getContent());

		ObjBox oBox = new ObjBox();
		oBox.setContent(10);
		oBox.setContent("String");
		
		// 캐스팅해줘야함
//		String value = oBox.getContent();
		String value = (String) oBox.getContent();		
		System.out.println("content: " + value);
		
		GenericBox<Integer> intGBox = new GenericBox<Integer>();
		// 1. 컴파일러에서 타입 체크 가능
		intGBox.setContent(10);
		// 2. 다운캐스팅의 불편을 해소
		Integer iValue = intGBox.getContent();
		System.out.println("contetnt: " + iValue);
		
		GenericBox<String> strGBox = new GenericBox<>();
		
	}
}
