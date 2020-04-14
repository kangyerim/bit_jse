package com.jse.algorithm;

public class Gugudan {
	public static void main(String[] args) {
			for(int i = 1; i<10; i++) {
				for (int j = 2; j < 6; j++) { //여기가 한 바퀴 다 돌아야 위의 for문이 한 칸 움직임
					System.out.print(String.format("%d * %d = %d \t", j, i, j * i));
				}
				System.out.println();
			}
			System.out.println();
			for(int i = 1; i<10; i++) {
				for (int j = 6; j < 10; j++) { //여기가 한 바퀴 다 돌아야 위의 for문이 한 칸 움직임
					System.out.print(String.format("%d * %d = %d \t", j, i, j * i));
				}
				System.out.println();
			}
		}
		
		
	}
