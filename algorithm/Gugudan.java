package com.jse.algorithm;

public class Gugudan {
	public static void main(String[] args) {
			for(int i = 1; i<10; i++) {
				for (int dan = 2; dan < 6; dan++) { //여기가 한 바퀴 다 돌아야 위의 for문이 한 칸 움직임
					System.out.print(String.format("%d * %d = %d \t", dan, i, dan * i));
				}
				System.out.println();
			}
			System.out.println();
			for(int i = 1; i<10; i++) {
				for (int dan = 6; dan < 10; dan++) { //여기가 한 바퀴 다 돌아야 위의 for문이 한 칸 움직임
					System.out.print(String.format("%d * %d = %d \t", dan, i, dan * i));
				}
				System.out.println();
			}
		}
		
		
	}
