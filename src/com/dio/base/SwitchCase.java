package com.dio.base;

public class SwitchCase {

	private final int totalValue = 0;
	
	public double calculaFee() {
		switch(this.totalValue) {
			case 100:
				return totalValue * 0.99;
			case 200:
				return totalValue * 1.99;
			default:
				return totalValue;
		}
	}
	
}
