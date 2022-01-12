package com.dio.base;

public class DoWhile {

	private String[] items;
	
	public void printItems() {
		int i = 0;
		
		do {
			System.out.println(items[i]);
			i++;
		}while(i < items.length);
	}
	
}
