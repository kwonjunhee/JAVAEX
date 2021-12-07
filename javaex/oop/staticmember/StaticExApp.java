package com.javaex.oop.staticmember;

public class StaticExApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		staticEx s1 = new staticEx();
		System.out.ptintln("RefCount: " + staticEc.refCount);

		System.out.ptintln("RefCount: " + staticEc.refCount);
		
		s2 = null;
		
		System.out.println("s2 해제");
		System.out.println("RefCount:" + StaticEx.refCount);
		
		// 주의: 가비지 컬렉터를 직접 호출하지 않는다.
		System.gc();
		try {
			Thread.sleep(3000); // 3초 대기
			System.out.println("RefCount:" + StaticEx.refCount);

		} catch(Exception e) {
			
		}

	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
