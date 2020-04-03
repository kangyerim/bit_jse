package com.jse.swing;
import java.util.Scanner;

public class Egine {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Grade grade = null;
		
		while(true) {
			System.out.println("(0)종료 (1)성적표");
			switch(scanner.nextInt()) {
			case 0: System.out.println("종료");return;
			case 1: System.out.println("성적표");
			grade = new Grade();
			System.out.println("이름을 입력하세요");
			grade.setName(scanner.next());
			System.out.println("국어 점수를 입력하세요");
			grade.setKorean(scanner.nextInt());
			System.out.println("영어 점수를 입력하세요");
			grade.setEnglish(scanner.nextInt());
			System.out.println("수학 점수를 입력하세요");
			grade.setMath(scanner.nextInt());
			System.out.println(grade.reportCard());
			break;
			}
		}
		


		
	}
}
