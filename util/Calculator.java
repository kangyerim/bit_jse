package com.jse.util;
public class Calculator {
	private int num1; //인스턴스 변수 - 값을 저장하기 위함
	private int num2;
	
	
	public void setNum1(int num1) {
		this.num1 = num1;
	}
	public int getNum1() {
		return num1;
	}
	
	public void setNum2(int num2) {
		this.num2 = num2;
	}
	public int getNum2() {
		return num2;
	}
	
	public int calc() {
		int c = num1 + num2;
		return c;
	}
	

}
