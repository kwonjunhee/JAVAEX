package com.javaex.oop.goods.v4;

public class GoodsApp {

	public static void main(String[] args) {
		
		
		//v.2
//		Goods notebook = new Goods();
//		notebook.setName("Macbook Air");
		// 생성자 1 호출
		Goods notebook = new Goods("Macbook Air");
		notebook.setPrice(1600000);

		
		// v.2
//		Goods smartphone = new Goods();
//		smartphone.setName("iPhone 13");
//		smartphone.setPrice(1000000);
		
		// 생성자 2 호출
		Goods smartphone = new Goods("iPhone 13", 1000000);
		
//		smartphone.setPrice(10000);
//		System.out.printf("%s, %d원%n", 
//				notebook.getName(), notebook.getPrice());
		notebook.showInfo();	
		
//		System.out.printf("%s, %d원%n", 
//				smartphone.getName(), smartphone.getPrice());
		smartphone.showInfo();
	}

}
