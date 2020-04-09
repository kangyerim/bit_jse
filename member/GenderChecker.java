package com.jse.member;
import java.util.Scanner;

public class GenderChecker {
	public static void main(String[] args) {
		find();
	}
	static void find() {
		System.out.println("주민번호를 입력하세요");
		Scanner scanner = new Scanner(System.in);
		String num = scanner.next();
		char ch = num.charAt(7);
		//String a = "";
		//char c = '';
		//case '1'
		switch(ch) {
		case '1':case '3': num ="남성"; break;
		case '2':case '4': num ="여성"; break;
		case '5':case '6': num ="외국인"; break;
		//default:
		case '0':case '7':case '8':case '9': num ="(잘못된 값)"; break;
		}
		System.out.println(String.format("이 사람은 %s 이다.", num));
	}
	
}
