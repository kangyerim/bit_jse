package com.jse.card;

import javax.swing.JOptionPane;

import com.jse.util.Constants;

public class CardController {
	public static void main(String[] args) {
		CardServiceImpl service = new CardServiceImpl();
		Card card = null;
		while (true) {
			switch (JOptionPane.showInputDialog(Constants.CARD_MENU)) {
			case "0":
				return;
			case "1":
				for(int i=0; i<3; i++) { //카드 3장 입력 받기 Main의 i 와 CardService의 count는 같은 내용
					String[] values = JOptionPane.showInputDialog(Constants.CARD_INPUT).split(",");
					card = new Card();
					card.setKind(values[0]);
					card.setNumber(Integer.parseInt(values[1]));
					service.add(card);
				}
				break;
			case "2":
			//	JOptionPane.showMessageDialog(null, service.printCard());
				break;
			}
		}
	}
}
