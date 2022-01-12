package com.dio.base;

public class IfElse {

	private String code = "";
	private double totalValue = 0;
	
	public void Order(String code, double totalValue) {
		this.code = code;
		this.totalValue = totalValue;
	}
	
	public double calculaFee() {
		if(totalValue > 100) {
			return totalValue * 0.99;
		}else {
			return totalValue;
		}
	}
	
}
