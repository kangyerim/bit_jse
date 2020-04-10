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
		String[] names = { "이름", "아이디", "패스워드", "주민번호", "추가사항" };
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
			JOptionPane.showMessageDialog(this, 
					String.format("%s / %s / %s / %s", 
							jfields[0].getText(),
							jfields[1].getText(),
							jfields[2].getText(),
							jfields[3].getText()));
			String[] data = String.format("%s / %s / %s / %s", 
					jfields[0].getText(),
					jfields[1].getText(),
					jfields[2].getText(),
					jfields[3].getText()).split("/");
			String[] names = data[0].split(",");
			//각 스플릿을 통해 담는다
			
			Member[] members = memberService.getMembers();
			for(int i=0; i<members.length; i++) {
				System.out.println(members[i].toString());
			}
		} else if (e.getSource() == cancelButton) {

		}
	}


}
