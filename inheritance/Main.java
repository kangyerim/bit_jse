package com.jse.inheritance;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		PhoneService service = new PhoneService();
		while (true) {
			System.out.println("(0)종료   (1)전화번호 입력  (2)전화번호 확인");
			switch (scanner.nextInt()) {
			case 0:
				return;
			case 1:
				System.out.println("전화번호, 이름, 제작사 입력");
				for (int i = 0; i < 3; i++) {
					service.add(new Phone(scanner.next(), scanner.next(), scanner.next()));
				}
				break;
			case 2:
				Phone[] phones = service.getPhones();
				for (int i = 0; i < 3; i++) {
					System.out.println(String.format("%s, %s, %s", phones[i].getName(), phones[i].getPhoneNumber(),
							phones[i].getCompany()));
				}
				break;
			}
		}
	}
}
