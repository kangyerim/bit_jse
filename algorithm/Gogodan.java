package com.jse.algorithm;

public class Gogodan {
	public static void main(String[] args) {
		for(int j = 1; j<10; j++) {
			for(int i = 2; i <6; i++) {
				System.out.print(String.format("%d * %d = %d \t", i , j, j*i));
			}
			System.out.println();
		}
		System.out.println();
		for(int j = 1; j <10; j++) {
			for(int i =6; i <10; i++) {
				System.out.print(String.format("%d * %d = %d \t", i, j ,i*j));
			}
			System.out.println();
		}
	}
}
//2 * 1 = 2		3 * 1 = 3		4 * 1 = 4
//2 * 2 = 4		3 * 2 = 6		4 * 2 = 8