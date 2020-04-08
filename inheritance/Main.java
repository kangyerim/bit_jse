package com.jse.inheritance;

import javax.swing.JOptionPane;

public class Main {
	public static void main(String[] args) {
		PhoneService service = new PhoneService();

		while (true) {
			System.out.println("");
			switch (JOptionPane.showInputDialog("(0)종료   (1)전화번호 입력  (2)전화번호 확인")) {
			case "0":
				return;
			case "1":
				for (int i = 0; i < 3; i++) {
					String[] values = JOptionPane.showInputDialog("전화번호, 이름, 제작사 입력").split(",");
					service.add(new Phone(values[0], values[1], values[2]));
				}

				break;
			case "2":
				Phone[] phones = service.getPhones();
				String message = "";
				for (int i = 0; i < 3; i++) {
					message += String.format("%s, %s, %s\n", phones[i].getName(), phones[i].getPhoneNumber(),
							phones[i].getCompany());
				}
				JOptionPane.showMessageDialog(null, message);
				break;
			}
		}
	}
}
