package com.jse.member;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class MemberView extends JFrame implements ActionListener {
	private static final long serialVersionUID = 1L;
	JButton saveButton, listButton, loginButton; // open이랑 actionperform이 공유해야해서 위로 올림
	JLabel[] jlabels;
	JTextField[] jfields;
	JPanel panel;
	MemberService memberService;

	public MemberView() {
		memberService = new MemberServiceImpl();
	}

	public void open() {
		this.setSize(500, 500);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		panel = new JPanel();
		this.add(panel);
		this.setVisible(true);
		jlabels = new JLabel[6];
		jfields = new JTextField[6];
		String[] names = { "이름", "아이디", "패스워드", "주민번호", "주소", "검색결과" };
		for (int i = 0; i < names.length; i++) {
			jlabels[i] = new JLabel(names[i]);
			panel.add(jlabels[i]);
			jfields[i] = new JTextField();
			panel.add(jfields[i]);
		}
		saveButton = new JButton("저장");
		listButton = new JButton("목록");
		loginButton = new JButton("로그인");
		saveButton.addActionListener(this); // **
		listButton.addActionListener(this); // **
		loginButton.addActionListener(this); // **
		panel.add(saveButton);
		panel.add(listButton);
		panel.add(loginButton);
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
		loginButton.setBounds(320, 330, 80, 30);
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

			String[] arr = data.split("/");
			Member[] members = new Member[5];
			String[] names = arr[0].split(",");
			String[] userids = arr[1].split(",");
			String[] passwds = arr[2].split(",");
			String[] ssns = arr[3].split(",");
			String[] addrs = arr[4].split(",");

			for (int i = 0; i < 5; i++) {
				members[i] = new Member();
				members[i].setName(names[i]);
				members[i].setUserid(userids[i]);
				members[i].setPasswd(passwds[i]);
				members[i].setSsn(ssns[i]);
				members[i].setAddrs(addrs[i]);
				memberService.add(members[i]);
			}

		} else if (e.getSource() == listButton) {
			JOptionPane.showMessageDialog(this, "클릭!!!");
			Member[] members = memberService.getMembers();
			String result = "";
			for (int i = 0; i < members.length; i++) {
				result += members[i];
			}
			jfields[5].setText(result);
			jfields[0].setText("");
			jfields[1].setText("");
			jfields[2].setText("");
			jfields[3].setText("");
			jfields[4].setText("");
		}
	}

}
