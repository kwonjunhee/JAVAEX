package com.javaex.api.collection.hash;

public class Student {
	int id;
	String name;
	
	public Student(String name, int id) {
		this.name = name;
		this.id = id;
	}
	
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + "]";
	}
	
	// hashCode 비교 -> equals 확인 -> 동등 객체
	@Override
	public int hashCode() {
		// 객체 식별값 (정수)
		return id;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Student) {
			// downcasting
			Student other = (Student) obj;
			return name.equals(other.name) && id == other.id;
		}
		return super.equals(obj);
	}

	public static void main(String[] args) {
		
	}

}
