package com.jse.app;
import java.util.Scanner;
public class HelloJava {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("이름이 뭐에요?");
		String name = scanner.next();
		System.out.println("안녕하세요,"+name+"씨.");
		System.out.println("어디 사세요?");
		String where = scanner.next();
		System.out.println("아~"+where+"은 살기 좋은 곳이죠.");
		System.out.println("몇 살이에요?");
		int age = scanner.nextInt();
		System.out.println(age +"살 입니다.");
		System.out.println("키는 몇이고, 몸무게는 몇 kg 입니까?");
		double height = scanner.nextDouble();
		double weight = scanner.nextDouble();
		System.out.println("혈액형이 뭐에요?");
		char bloodType = scanner.next().charAt(0);

		int a = 0;
		System.out.println(a);
	}

}
