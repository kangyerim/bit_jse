package com.jse.member;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class LoginView extends JFrame implements ActionListener {
	private static final long serialVersionUID = 1L;
	JButton joinButton, loginButton; // opne이랑 actionperform이 공유해야해서 위로 올림
	JLabel[] jlabels;
	JTextField[] jfields;
	JPanel panel;

	public void login() {
		this.setSize(500, 300);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		panel = new JPanel();
		this.add(panel);
		this.setVisible(true);
		jlabels = new JLabel[2];
		jfields = new JTextField[2];
		String[] names = { "아이디", "패스워드"};
		for (int i = 0; i < names.length; i++) {
			jlabels[i] = new JLabel(names[i]);
			panel.add(jlabels[i]);
			jfields[i] = new JTextField();
			panel.add(jfields[i]);
		}
		joinButton = new JButton("회원가입");
		loginButton = new JButton("로그인");
		joinButton.addActionListener(this); // **
		loginButton.addActionListener(this); // **
		panel.add(joinButton);
		panel.add(loginButton);
		jlabels[0].setBounds(40, 10, 40, 40);
		jlabels[1].setBounds(40, 50, 40, 40);
		jfields[0].setBounds(120, 10, 200, 30);
		jfields[1].setBounds(120, 50, 200, 30);
		joinButton.setBounds(125, 330, 80, 30);
		loginButton.setBounds(240, 330, 80, 30);
		this.setLocationRelativeTo(null);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == joinButton) { // == 주소값을 비교
			JOptionPane.showMessageDialog(this, 
					
					jfields[0].getText());
		} else if (e.getSource() == loginButton) {

		}
	}


}
