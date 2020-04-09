package com.jse.algorithm;

public class Sum1To5 {
	public static void main(String[] args) {
		sum();
		sum1();
	}
	
	static void sum() {
		int sum = 0;
		for(int i=1; i<=5; i++) {
			System.out.println(i);
			sum += i;
		}
		System.out.println(String.format(">>>>>>>%d", sum));
	}
	
	static void sum1() {
		int sum1 = 0;
		for(int p = 1; p <=10; p++) {
			System.out.println(p);
			sum1 += p;
		}
		System.out.println(String.format("<<<<%d", sum1));
	}
	
}
