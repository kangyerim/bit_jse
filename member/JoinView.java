package com.jse.member;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class JoinView extends JFrame implements ActionListener {
	private static final long serialVersionUID = 1L;
	JButton saveButton, cancelButton; // open이랑 actionperform이 공유해야해서 위로 올림
	JLabel[] jlabels;
	JTextField[] jfields;
	JPanel panel;
	MemberService memberService;

	public JoinView() {
		memberService = new MemberServiceImpl();
	}

	public void open() {
		this.setSize(500, 500);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		panel = new JPanel();
		this.add(panel);
		this.setVisible(true);
		jlabels = new JLabel[5];
		jfields = new JTextField[5];
		String[] names = { "이름", "아이디", "패스워드", "주민번호", "주소" };
		for (int i = 0; i < names.length; i++) {
			jlabels[i] = new JLabel(names[i]);
			panel.add(jlabels[i]);
			jfields[i] = new JTextField();
			panel.add(jfields[i]);
		}
		saveButton = new JButton("저장");
		cancelButton = new JButton("취소");
		saveButton.addActionListener(this); // **
		cancelButton.addActionListener(this); // **
		panel.add(saveButton);
		panel.add(cancelButton);
		jlabels[0].setBounds(40, 10, 40, 40);
		jlabels[1].setBounds(40, 50, 40, 40);
		jlabels[2].setBounds(40, 90, 60, 40);
		jlabels[3].setBounds(40, 130, 40, 40);
		jlabels[4].setBounds(40, 170, 60, 40);
		jfields[0].setBounds(120, 10, 200, 30);
		jfields[1].setBounds(120, 50, 200, 30);
		jfields[2].setBounds(120, 90, 200, 30);
		jfields[3].setBounds(120, 130, 280, 30);
		jfields[4].setBounds(120, 180, 280, 120);
		saveButton.setBounds(125, 330, 80, 30);
		cancelButton.setBounds(240, 330, 80, 30);
		this.setLocationRelativeTo(null);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == saveButton) { // == 주소값을 비교
			jfields[0].setText("홍길동,유관순,이순신,신사임당,이도");
			jfields[1].setText("hong,you,lee,shin,leedo");
			jfields[2].setText("1,1,1,1,1");
			jfields[3].setText("900101-1,941024-2,010815-1,130313-2,200418-1");
			jfields[4].setText("서울,서울,서울,부산,부산");
			String data = String.format("%s / %s / %s / %s / %s", jfields[0].getText(), jfields[1].getText(),
					jfields[2].getText(), jfields[3].getText(), jfields[4].getText());

			String[][] matrix = new String[4][5]; // 내가 마지막에 보고 싶은 칸의 모양 가로*세로
			for (int i = 0; i < 4; i++) {
				for (int j = 0; j < 5; j++) {

				}
			}
			System.out.println("---------matrix start----------");
			String[] arr = data.split("/"); // 데이터 전처리 : token의 순서대로 자름
			Member[] members = new Member[5];
			String[] names = arr[0].split(",");
			String[] userids = arr[1].split(",");
			String[] passwds = arr[2].split(",");
			String[] ssns = arr[3].split(",");
			String[] addrs = arr[4].split(",");
			
			
			for (int i = 0; i < 5; i++) {
				members[i]=new Member();
				members[i].setName(names[i]);
				members[i].setUserid(userids[i]);
				members[i].setPasswd(passwds[i]);
				members[i].setSsn(ssns[i]);
				members[i].setAddrs(addrs[i]);
				memberService.add(members[i]);
				
			}

			System.out.println("---------matrix end----------");

		} else if (e.getSource() == cancelButton) {

		}
	}

}
