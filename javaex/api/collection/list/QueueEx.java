package com.javaex.api.collection.list;

import java.util.LinkedList;
import java.util.Queue;

public class QueueEx {
	public static void main(String[] args) {
		Queue<Integer> queue = new LinkedList<>();
		
		// First Input First Output ( FIFO )
		for (int i = 1; i <= 10; i++) {
			queue.offer(i); // enqueue
			System.out.println("QUEUE:" + queue);
		}
		
		// queue의 첫번째 데이터 확인
		System.out.println("PEEK: " + queue.peek());
		System.out.println("QUEUE:" + queue);

		while(!queue.isEmpty()) {
			System.out.println("POLL: " + queue.poll()); 
			System.out.println("QUEUE:" + queue);
		}
		
	}
}
