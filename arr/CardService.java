package com.jse.arr;

public class CardService {
	private CardBean[] cards; //for-배열은 한 셋트
	private int count;
	
	public CardService() {
		cards = new CardBean[3];
		count = 0; // Main의 16번째 줄 i=0;과 맞춤
	}
	public void setCards(CardBean[] cards) {
		this.cards = cards;
	}
	public CardBean[] getCards() {
		return cards;
	}
	public void setCount(int count) {
		this.count = count;
	}
	public int getCount() {
		return count;
	}
	public void add(CardBean card) { //card 하나씩 받을 준비 : 카드를 카드s에 넣어야지
		cards[count] = card;
		count++;
	}
}
