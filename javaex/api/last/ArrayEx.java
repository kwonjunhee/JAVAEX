package com.javaex.api.last;

import java.util.Arrays;
import java.util.Collections;


public class ArrayEx {
	public static void main(String[] args) {
//		arrayCopyEx();
//		basicSortEx();
//		basicSortDescEx();
//		customClassSort();
		basicSearch();
	}
	
	
	private static void basicSearch() {
		Integer[] scores = { 80, 50, 70, 90, 75, 88, 77 }; // find 75
		// 이진 검색 방식은 미리 정렬이 되어 있어야 한다.
		Arrays.sort(scores);
		System.out.println("원본: " +Arrays.toString(scores)); 
		int index = Arrays.binarySearch(scores, 75);
		System.out.println("75의 인덱스: " + index); 
	}	
	
	
	// 정렬의 꽃 피었다~
	private static void customClassSort() {
		Member[] members = { 
				new Member("홍길동"), new Member("고길동"), new Member("장길산"), new Member("임꺽정")
		};
		System.out.println("원본: " + Arrays.toString(members));
		Arrays.sort(members);
		System.out.println("정렬: " +Arrays.toString(members));
		Arrays.sort(members, Collections.reverseOrder()); 
		System.out.println("역순 정렬:"+ Arrays.toString(members));
	}
	
	
	
	// 큰 -> 작은: 내림차순 Descending
	private static void basicSortDescEx(){ 
		Integer[] scores = { 80, 50, 70, 90, 75, 88, 77 };
		System.out.println("원본: " +Arrays.toString(scores));
		// 기본 타입은 역순 정렬이 안됨 - compaterTo가 없음
		Arrays.sort(scores, Collections.reverseOrder());
		System.out.println("역순 정렬:"+ Arrays.toString(scores));
		
	}
	
	// 작은 -> 큰 : 오름차순 Ascending
	private static void basicSortEx() {
		int[] scores = { 80, 50, 70, 90, 75, 88, 77 };
		System.out.println("원본: " +Arrays.toString(scores));
		Arrays.sort(scores);
	
		System.out.println("정렬:"+ Arrays.toString(scores));
		
		
	}
	
	
	private static void arrayCopyEx() {
		int arr[] = new int[]{ 1, 2, 3, 4, 5 };
		
		// System 이용 복사
		int[] target = new int[arr.length];
		System.arraycopy(arr/*원본 배열*/,
		 0/*시작 인덱스*/, target/*대상 배역*/, 0/*시작 인덱스*/, 0/*복사할 길이*/);
		System.out.println("원본 배열: " + Arrays.toString(arr));
		System.out.println("System 복제: " + Arrays.toString(target));
		
		// Arrays의 복제 메서드
		target = Arrays.copyOf(arr, arr.length);
		
		System.out.println("CopyOf: " + Arrays.toString(target));
		
		// 배열 일부 복제
		target = Arrays.copyOfRange(arr, // 원본 배열
				1/*복사 시작 인덱스*/, 3/**/);
		System.out.println("CopyOfRange: " + Arrays.toString(target));
	}
}
