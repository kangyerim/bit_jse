package com.jse.grade;

import com.jse.util.Constants;
import javax.swing.JOptionPane;

import com.jse.member.Member;

public class GradeController {
	public static void main(String[] args) {
		GradeServiceImpl gradeService = new GradeServiceImpl();
		Member[] members = new Member[3];
		Grade grade = null;
		while (true) {
			switch (JOptionPane.showInputDialog(Constants.GRADE_MENU)) {
			case "0":
				return;
			case "1":
				for (int i = 0; i < 3; i++) {
					String[] values = JOptionPane.showInputDialog(Constants.GRADE_INPUT).split(",");
					grade = new Grade();
					grade.setName(values[0]);
					grade.setKorean(Integer.parseInt(values[1]));
					grade.setEnglish(Integer.parseInt(values[2]));
					grade.setMath(Integer.parseInt(values[3]));
					gradeService.add(grade);
				}
				break;
			case "2":
				System.out.println(gradeService.printGrades());
				break;
			case "3":
				System.out.println("총점 순으로 1, 2, 3등의 이름 나열하기");
				break;
/*
			case "4":
				System.out.println("회원가입을 하자");
				for (int i = 0; i < 3; i++) {
					members[i] = join(scanner);
				}
				break;
			case "5":
				System.out.println("회원 목록 보기");
				for (int i = 0; i < 3; i++) {
					Member member = members[i];
					System.out.println(member.check());
				}
				break;
			case "6":
				System.out.println("상품의 이름, 가격, 색상 입력하기");
				for (int i = 0; i < 3; i++) {
					// itemSerivce.add(new ItemBean(scanner.next(), scanner.nextInt(),
					// scanner.next()));
				}
				break;
			case "7":
				System.out.println("상품 내역 확인");
				// ItemBean[] items = itemSerivce.getItems(); //???좌항 모르겠다??????
				for (int i = 0; i < 3; i++) {
					// System.out.println(String.format("[ %s : 가격 %d원, 색상 %s ]",
					// items[i].getName(), items[i].getPrice(), items[i].getColor()));
				}
				break;
*/
			}
		}
	}

}
