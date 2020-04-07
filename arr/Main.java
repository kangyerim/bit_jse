package com.jse.arr;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		CardService service = new CardService();
		while (true) {
			System.out.println("(0)Exit  (1)카드 3장 받기  (2)출력");
			switch (scanner.nextInt()) {
			case 0:
				return;
			case 1:
				System.out.println("카드 3장 받기 : 모양, 숫자");
				for(int i=0; i<3; i++) { //카드 3장 입력 받기 Main의 i 와 CardService의 count는 같은 내용
					service.add(new CardBean(scanner.next(),scanner.nextInt()));
				}
				break;
			case 2:
				CardBean[] cards = service.getCards();
				for(int i=0; i<3; i++) {//for-배열은 한 셋트
				System.out.println(String.format("카드 모양 :  %s, 카드 숫자 :  %d", cards[i].getKind(), cards[i].getNumber()));
				}
				break;
			}
		}
	}
}
