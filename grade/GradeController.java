package com.jse.grade;

import com.jse.util.Constants;
import javax.swing.*;

public class GradeController {
	public static void main(String[] args) {
		JFrame frame = new JFrame("성적관리");
		frame.setSize(600, 400);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		GradeServiceImpl gradeService = new GradeServiceImpl();
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
				JOptionPane.showMessageDialog(null, gradeService.printGrades());
				break;
			case "3":
				JOptionPane.showMessageDialog(null, gradeService.ranking());
				break;

			}
		}
	}

}
