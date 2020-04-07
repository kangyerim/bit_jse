package com.jse.swing;

import java.util.Scanner;

public class Egine {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		GradeService gradeService = new GradeService();
		MemberBean[] members = new MemberBean[3];
		ItemService itemSerivce = new ItemService();
		
		while(true) {
			System.out.println("(0)종료  (1)성적표 입력  (2)성적표 출력  (3)못했더  (4)회원가입  (5)회원 확인  "
					+ "(6)상품 등록  (7)상품 확인");
			switch(scanner.nextInt()) {
			case 0: System.out.println("종료");return;
			case 1: System.out.println("성적표");
			for(int i=0; i<3; i++) {
				System.out.println("이름, 국어, 영어, 수학 점수를 입력하세요");
				gradeService.add(new GradeBean(scanner.next(),scanner.nextInt(),scanner.nextInt(),scanner.nextInt()));
			}
				break;
			case 2:
				GradeBean[] grades = gradeService.getGrades();
				for(int i=0; i<3; i++) { 
					System.out.println(String.format("[%s : 총 %d 점, 평균 %d 점, 학점 %s]", grades[i].getName(), grades[i].totalScore(),grades[i].averageScore(), grades[i].grade()));
				}
				break;
			case 3:
				System.out.println("총점 순으로 1, 2, 3등의 이름 나열하기");
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
					MemberBean member = members[i];
					System.out.println(member.check());
				}
				break;
			case 6:
				System.out.println("상품의 이름, 가격, 색상 입력하기");
				for(int i=0; i<3; i++) {
					itemSerivce.add(new ItemBean(scanner.next(), scanner.nextInt(), scanner.next()));
				}
				break;
			case 7:
				System.out.println("상품 내역 확인");
				ItemBean[] items = itemSerivce.getItems(); //???좌항 모르겠다??????
				for(int i=0; i<3; i++) {
					System.out.println(String.format("[ %s : 가격 %d원, 색상 %s ]", items[i].getName(), items[i].getPrice(), items[i].getColor()));
				}
				break;
			
			}
		}
	}

	public static MemberBean join(Scanner scanner) {
		System.out.println("사용할 아이디, 비밀번호, 이름, 나이 입력해");
		return new MemberBean(scanner.next(), scanner.next(), scanner.next(), scanner.nextInt());
	}
	/*
	 * public static Member join(Scanner scanner) { Member member = new Member();
	 * System.out.println("사용할 아이디를 입력"); member.setUserid(scanner.next());
	 * System.out.println("비밀번호를 입력"); member.setPasswd(scanner.next());
	 * System.out.println("이름은 무엇"); member.setName(scanner.next());
	 * System.out.println("나이는 몇 살"); member.setAge(scanner.nextInt()); return
	 * member; }
	 */

}
/*
 * System.out.println("이름을 입력하세요"); grade.setName(scanner.next());
 * System.out.println("국어 점수를 입력하세요"); grade.setKorean(scanner.nextInt());
 * System.out.println("영어 점수를 입력하세요"); grade.setEnglish(scanner.nextInt());
 * System.out.println("수학 점수를 입력하세요"); grade.setMath(scanner.nextInt());
 * 
 * 
 */
