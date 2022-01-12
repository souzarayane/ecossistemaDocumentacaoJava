package com.dio.base;

public class While {

	private String code = "";
	private int totalValue = 0;
	
	private String[] items;
	
	public void Order(String code, int totalValue) {
		this.code = code;
		this.totalValue = totalValue;
	}
	
	public void printItems() {
		int i = 0;
		while(i < items.length) {
			System.out.println(items[i]);
			i++;
		}
	}
	
}
