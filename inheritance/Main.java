package com.jse.inheritance;

import javax.swing.JOptionPane;

public class Main {
	public static void main(String[] args) {
		PhoneService service = new PhoneService();
		String messege = "";
		while (true) {
			System.out.println("");
			switch (JOptionPane.showInputDialog("(0)종료   (1)전화번호 입력  (2)전화번호 확인" + "\t(3)휴대전화 입력\t (4)휴대전화출력"
					+ "(5)아이폰 등록  (6)아이폰 출력  (7)갤럭시 등록  (8)갤럭시 출력")) {
			case "0":
				return;
			case "1":
				for (int i = 0; i < 3; i++) {
					String[] values = JOptionPane.showInputDialog("전화번호, 이름, 제작사 입력").split(",");
					service.add(new Phone(values[0], values[1], values[2]));
				}

				break;
			case "2":
				Phone[] phones = service.getPhones(); // 저장된 배열을 가져왔
				messege = "";
				for (int i = 0; i < 3; i++) {
					messege += String.format("%s, %s, %s\n", phones[i].getName(), phones[i].getPhoneNumber(),
							phones[i].getCompany());
				}
				JOptionPane.showMessageDialog(null, messege);
				break;
			case "3":
				for (int i = 0; i < 3; i++) { // value는 for안에서만 쓰니까 같은text로 써도 되었다
					String[] values = JOptionPane.showInputDialog("휴대폰번호, 이름, 제작사, 이동가능여부 입력").split(",");
					service.add(new CelPhone(values[0], values[1], values[2], true));
				}
				break;
			case "4":
				CelPhone[] celPhones = service.getCelPhones();
				messege = "";
				for (int i = 0; i < 3; i++) {
					messege += String.format("%s, %s, %s, %s\n", celPhones[i].getName(), celPhones[i].getPhoneNumber(),
							celPhones[i].getCompany(), celPhones[i].getMove());
				}
				JOptionPane.showMessageDialog(null, messege);
				break;
			case "5":
				for (int i = 0; i < 3; i++) {
					String[] values = JOptionPane.showInputDialog("아이폰번호, 이름, 제작사, 검색할래?").split(",");
					service.add(new Iphone(values[0], values[1], values[2], true, values[3]));
				}
				break;
			case "6":
				Iphone[] iphones = service.getIphones();
				messege = "";
				for (int i = 0; i < 3; i++) {
					messege += String.format("%s, %s, %s, %s, %s\n", iphones[i].getPhoneNumber(), iphones[i].getName(),
							iphones[i].getCompany(), iphones[i].getMove(), iphones[i].getSearch());
				}
				JOptionPane.showMessageDialog(null, messege);
				break;
			case "7":
				for (int i = 0; i < 3; i++) {
					String[] values = JOptionPane.showInputDialog("갤럭시번호, 이름, 제작사, 포터블, 검색, 빅사이즈").split(",");
					service.add(new GalaxyNote(values[0], values[1], values[2], true, values[3], values[4]));
				}
				break;
			case "8":
				GalaxyNote[] galaxys = service.getGalaxys();
				messege = "";
				for (int i = 0; i < 3; i++) {
					messege += String.format("%s, %s, %s, %s, %s, %s\n", galaxys[i].getPhoneNumber(),
							galaxys[i].getName(), galaxys[i].getCompany(), galaxys[i].getMove(), galaxys[i].getSearch(),
							galaxys[i].getBigsize());
				}
				JOptionPane.showMessageDialog(null, messege);
				break;
			}
		}
	}
}
