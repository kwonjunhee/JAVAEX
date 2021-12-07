package com.javaex.exception;

import java.io.IOException;
import java.util.*;
public class ExceptionEx {

	public static void main(String[] args) {
//		arithExceptionEx();
		throwExceptionEx();
	}
	private static void throwExceptionEx() {
		ThrowsExcept except = new ThrowsExcept();
		try {
			except.executeRuntimeException();
			except.executeException();
		} catch (RuntimeException e) {
			System.err.println(e.getMessage());
		} catch (IOException e) {
			System.err.println(e.getMessage());
		}
		
		// 사용자 정의 예외 사용
		try {
			System.out.println(except.divide(100, 0));
		} catch (CustomArithException e) {
			System.err.println(e.getMessage());
			// 예외 상황 확인
			System.err.println("나뉘어지는 수: " + e.getNum1());
			System.err.println("나누는 수: " + e.getNum2());
		}
			
		System.out.println("예외 처리 완료");
	}
	
	private static void arithExceptionEx() {
		double result = 0;
		int num;
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("정수 입력: ");
		
		try {
			num = scanner.nextInt(); // 예외 발생 가능 영역 
			result = 100/num;
		} catch (InputMismatchException e ) {
			System.err.println("정수로 해 주세요");
		} catch (ArithmeticException e ) {
			System.err.println("0으로는 나눌 수 없어요");
		} catch (Exception e) { // 모든 예외 처리 가능
			e.printStackTrace();
		} finally {
			System.out.println("예외 처리 종료");
			// 예외 유무 관계 없ㅇ ㅣ가장 마지막에
			// 자원 정리 작업에 많이 활용
		}
		System.out.println(result);
		scanner.close();
	}

}
