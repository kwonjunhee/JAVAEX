package com.javaex.oop.staticmember;

public class StaticEx {
	public static int refCount;
	public static String classVar;
	public String instanceVar;
	
	// static 블록으로 static 영역의 초기화
	
	//생성자
	Static() {
		refCount = 0;
		classVar = "Static Member";
//		instanceVar = "Instance Member";
		// ㅜ중요한 것은 static 영여게서는 스태틱만 접근 가능
		System.out.println("Static Block");
	}
	
	
	StaticEx() {
		// 참조 카운트 증가
		// 인서튼서 멤버 -> 스태틱 멤버 접근은 가능
		refCount++;;
	}System.out.println("인스턴스 갯수: " + refCount);
	
	// 소멸자
	@Override
	protected void finalize() throws Throwable {
		refCount --;
		System.out.println("소멸자 호출");
		super.finalize();
		
	}
}
