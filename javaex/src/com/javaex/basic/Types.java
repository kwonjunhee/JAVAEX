package com.javaex.basic;

public class Types {
	public static void main(String[] args) {
//		intLongEx();
//		floatDoubleEx();
//		charEx();
//		booleanEx();
//		promotionEx();
		castingEx();
	}
	// 형 변환 (Casting)
	private static void castingEx() {
		// 표현 범위 대 -> 소
		// 명시적 변환
		
		float f = 123.456f;
		System.out.println(f);

		int i = (int)f;
		System.out.println(i);
		
		int i2 = 1234567890;
		System.out.println(Integer.toBinaryString(i2));
		
		short s = (short)i2;
		System.out.println(Integer.toBinaryString(s));
		
		// 형 변환 시 자료 유실 가능성 다분, 주의.
		
	}
	
	
	
	
	
	//형 변환 (Promotion)
	private static void promotionEx() {
		// 표현 범위 소 -> 대
		// 자동 변환
		byte b = 25; // 1바이트 정수
		System.out.println(b);
		
		short s = b; // 2바이트 정수
		System.out.println(s);
		
		int i = s;
		System.out.println(i);

		float f = i; // 4바이트 실수
		System.out.println(f);
	}
	
	
	
	//논리형:참 or 거짓 
	// 비교연산 or 논리연산 결과 => 흐름제어(조건 분기, 반복)
	private static void booleanEx() {
		boolean b1 = true; // 참
		boolean b2 = false; // 거짓
		
		System.out.println(b1);
		System.out.println(b2);
		
		boolean result;
		
		int var1 = 3;
		int var2 = 5;
		
		result = var1 < var2; // 비교연산 or 논리연산 결과
		
		System.out.println(var1 + " < " + var2 + " = " +result);
	}
	
	
	//문자형 타입: 부호 없는 정수(2byte, 코드)
	private static void charEx() {
		char ch1 = 'A';
		char ch2 = '한';
		
		System.out.println(ch1);
		System.out.println(ch2);
		
		// ch1 4글자 뒤 
		System.out.println((char) (ch1 + 4)); // 표현범위가 다른 연산을 할 시 큰 범위에 맞추어진다.
	}
	
	//실수형 타입
	public static void floatDoubleEx() {
		// float(4) < double(8:default)

		float floatVar = 3.14159F; // F or f
		double doubleVar = 3.14159;
		
		floatVar = 0.1234567890123456789F;
		doubleVar = 0.1234567890123456789;
		
		System.out.println("float: " + floatVar);
		System.out.println("double: "+ doubleVar);
		// 정밀도 포기, 표현 범위 확장
		
		System.out.println(0.1*3);
		
		//지수 표기법
		floatVar = 3E-6F; // 3*10^(-6)
		System.out.println(floatVar);
		
	}
	
	
	//정수형 타입
	public static void intLongEx() {
		//byte(1) < short(2) < int(4:default) < long(8)
		int intVar1; // 선언
		int intVar2; // 선언
		
		intVar1 = 2021; // 초기화
//		int intVar2 = 12345678901234; // 범위 초과
		System.out.println(intVar1); // 조회
		
		long longVar1 = 2021; // 선언 + 초기화
		long logngVar2 = 12345678901234L; //L or 1
		
		// 2진수, 8진수, 16진수
		int bin, oct, hex;
		bin = 0b1101; // 2진수 0b
		oct = 072; //8진수는 0
		hex = 0xFF; //16진수는 0x
		
		System.out.println(bin);
		System.out.println(oct);
		System.out.println(hex);
		
	}
}
