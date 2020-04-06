package com.jse.swing;
import java.util.Scanner;

public class Egine {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Grade[] grades = new Grade[3]; //3명 저장할거야 - 선언
		Member[] members = new Member[3];
		
		while(true) {
			System.out.println("(0)종료  (1)성적표 입력  (2)성적표 출력  (3)못했더  (4)회원가입  (5)회원 확인");
			switch(scanner.nextInt()) {
			case 0: System.out.println("종료");return;
			case 1: System.out.println("성적표");
			for(int i=0; i<3; i++) { //input을 3번 반복할거야 - 선언한거 저장
				grades[i] = input(scanner); //아규먼트 : vs 파라미터 : ;;syntax ㅅㄱ
			}
				break;
			case 2:
				for(int i=0; i<3; i++) { //3번 반복할 거야
					Grade grade = grades[i];
				
					System.out.println(grade.reportCard());
				}
				break;
			case 3:
				
				break;
			case 4:
				System.out.println("회원가입을 하자");
				for(int i=0; i<3; i++) {
					members[i] = join(scanner);
				}
				break;
			case 5:
				System.out.println("회원 목록 보기");
				for(int i=0; i<3; i++) {
					Member member = members[i];
					System.out.println(member.check());
				}
				break;
			}
		}
	}
	public static Member join(Scanner scanner) {
		Member member = new Member();
		System.out.println("사용할 아이디를 입력");
		member.setUserid(scanner.next());
		System.out.println("비밀번호를 입력");
		member.setPasswd(scanner.next());
		System.out.println("이름은 무엇");
		member.setName(scanner.next());
		System.out.println("나이는 몇 살");
		member.setAge(scanner.nextInt());
		return member;
	}
	
	
	public static Grade input(Scanner scanner) { 
		Grade grade = new Grade();
		System.out.println("이름을 입력하세요");
		grade.setName(scanner.next());
		System.out.println("국어 점수를 입력하세요");
		grade.setKorean(scanner.nextInt());
		System.out.println("영어 점수를 입력하세요");
		grade.setEnglish(scanner.nextInt());
		System.out.println("수학 점수를 입력하세요");
		grade.setMath(scanner.nextInt());
		return grade;
	}

	
}
/*
System.out.println("이름을 입력하세요");
grade.setName(scanner.next());
System.out.println("국어 점수를 입력하세요");
grade.setKorean(scanner.nextInt());
System.out.println("영어 점수를 입력하세요");
grade.setEnglish(scanner.nextInt());
System.out.println("수학 점수를 입력하세요");
grade.setMath(scanner.nextInt());


*/













