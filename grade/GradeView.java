package com.jse.grade;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class GradeView extends JFrame implements ActionListener {
	private static final long serialVersionUID = 1L;
	JButton saveButton, listButton;
	JLabel[] jlabels;
	JTextField[] jfields;
	JPanel panel;
	GradeService gradeService;

	public GradeView() {
		gradeService = new GradeServiceImpl(); // ????
	}

	public void open() {
		this.setSize(500, 500);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		panel = new JPanel();
		this.add(panel);
		this.setVisible(true);
		jlabels = new JLabel[6];
		jfields = new JTextField[6];
		String[] names = { "이름", "국어", "영어", "수학", "자바", "검색 결과" };
		for (int i = 0; i < names.length; i++) {
			jlabels[i] = new JLabel(names[i]);
			panel.add(jlabels[i]);
			jfields[i] = new JTextField();
			panel.add(jfields[i]);
		}
		saveButton = new JButton("저장");
		listButton = new JButton("목록");
		saveButton.addActionListener(this);
		listButton.addActionListener(this);
		panel.add(saveButton);
		panel.add(listButton);
		jlabels[0].setBounds(40, 10, 40, 40);
		jlabels[1].setBounds(40, 50, 40, 40);
		jlabels[2].setBounds(40, 90, 60, 40);
		jlabels[3].setBounds(40, 130, 40, 40);
		jlabels[4].setBounds(40, 170, 60, 40);
		jlabels[5].setBounds(40, 210, 60, 40);
		jfields[0].setBounds(120, 10, 200, 30);
		jfields[1].setBounds(120, 50, 200, 30);
		jfields[2].setBounds(120, 90, 200, 30);
		jfields[3].setBounds(120, 130, 280, 30);
		jfields[4].setBounds(120, 180, 280, 30);
		jfields[5].setBounds(120, 210, 280, 100);
		saveButton.setBounds(125, 330, 80, 30);
		listButton.setBounds(200, 330, 80, 30);
		this.setLocationRelativeTo(null);
	}

	public void actionPerformed(ActionEvent event) { // ???
		if (event.getSource() == saveButton) { // save버튼이 필드에 있어서 여기서 쓰는거 가능?
			jfields[0].setText("강강강,김김김,이이이,최최최,한한한");
			jfields[1].setText("89,50,72,100,94");
			jfields[2].setText("46,82,100,54,87");
			jfields[3].setText("25,80,98,39,79");
			jfields[4].setText("100,78,97,59,100");
			String data = String.format("%s/%s/%s/%s/%s", jfields[0].getText(), jfields[1].getText(),
					jfields[2].getText(), jfields[3].getText(), jfields[4].getText());
			String[] arr = data.split("/");
			Grade[] grades = new Grade[5]; // 이거 뭐여
			String[] names = arr[0].split(",");
			String[] koreans = arr[1].split(",");
			String[] englishs = arr[2].split(",");
			String[] maths = arr[3].split(",");
			String[] javas = arr[4].split(",");

			for (int i = 0; i < 5; i++) {
				grades[i] = new Grade();
				grades[i].setName(names[i]);
				grades[i].setKorean(Integer.parseInt(koreans[i]));
				grades[i].setEnglish(Integer.parseInt(englishs[i]));
				grades[i].setMath(Integer.parseInt(maths[i]));
				grades[i].setJava(Integer.parseInt(javas[i]));
				gradeService.add(grades[i]);
			}

		} else if (event.getSource() == listButton) {
			Grade[] grades = gradeService.getGrades();
			String result = "";
			for (int i = 0; i < grades.length; i++) {
				result += grades[i];
			}
			jfields[5].setText(result);
			jfields[4].setText("");
			jfields[3].setText("");
			jfields[2].setText("");
			jfields[1].setText("");
			jfields[0].setText("");
		}
	}

}
