package com.javaex.api.generic;

public class GenericBox<T> {
	T content; // 미정상태

	public T getContent() {
		return content;
	}

	public void setContent(T content) {
		this.content = content;
	}
	
	
}
