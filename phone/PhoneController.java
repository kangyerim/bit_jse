package com.jse.phone;
import com.jse.util.Constants;
import javax.swing.JOptionPane;

public class PhoneController {

	public static void main(String[] args) {
		PhoneService service = new PhoneServiceIpml();
		String messege = "";
		while (true) {
			System.out.println("");
			switch (JOptionPane.showInputDialog(Constants.MENU)) {
			case "0":
				return;
			case "1":
				for (int i = 0; i < 3; i++) {
					String[] values = JOptionPane.showInputDialog(Constants.PHONE_MENU).split(",");
					service.add(new Phone(values[0], values[1], values[2]));
				}

				break;
			case "2":
				Phone[] phones = service.phoneList(); // 저장된 배열을 가져왔
				messege = "";
				for (int i = 0; i < 3; i++) {
					messege += phones[i].toString()+"\n";
				}
				JOptionPane.showMessageDialog(null, messege);
				break;
			case "3":
				for (int i = 0; i < 3; i++) { // value는 for안에서만 쓰니까 같은text로 써도 되었다
					String[] values = JOptionPane.showInputDialog(Constants.CELPHONE_MENU).split(",");
					service.add(new CelPhone(values[0], values[1], values[2], true));
				}
				break;
			case "4":
				CelPhone[] celPhones = service.celPhoneList();
				messege = "";
				for (int i = 0; i < 3; i++) {
					messege += celPhones[i].toString()+"\n";
				}
				JOptionPane.showMessageDialog(null, messege);
				break;
			case "5":
				for (int i = 0; i < 3; i++) {
					String[] values = JOptionPane.showInputDialog(Constants.IPHONE_MENU).split(",");
					service.add(new Iphone(values[0], values[1], values[2], true, values[3]));
				}
				break;
			case "6":
				Iphone[] iphones = service.iList();
				messege = "";
				for (int i = 0; i < 3; i++) {
					messege += iphones[i].toString()+"\n";
				}
				JOptionPane.showMessageDialog(null, messege);
				break;
			case "7":
				for (int i = 0; i < 3; i++) {
					String[] values = JOptionPane.showInputDialog(Constants.GALAXYNOTE_MENU).split(",");
					service.add(new GalaxyNote(values[0], values[1], values[2], true, values[3], values[4]));
				}
				break;
			case "8":
				GalaxyNote[] galaxys = service.galList();
				messege = "";
				for (int i = 0; i < 3; i++) {
					messege += galaxys[i].toString()+"\n";
				}
				JOptionPane.showMessageDialog(null, messege);
				break;
			}
		}
	}
}
