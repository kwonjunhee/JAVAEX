package com.javaex.oop.goods.v3;

public class GoodsApp {

	public static void main(String[] args) {
		
		
		//v.2
//		Goods notebook = new Goods();
//		notebook.setName("Macbook Air");
//		notebook.setPrice(1600000);
		Goods notebook = new Goods("Macbook Air", 1600000);
		
		
		// v.2
//		Goods smartphone = new Goods();
//		smartphone.setName("iPhone 13");
//		smartphone.setPrice(1000000);
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
