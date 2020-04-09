package com.jse.card;

public class CardService {
	private Card[] cards; //for-배열은 한 셋트
	private int count;
	
	public CardService() {
		cards = new Card[3];
		count = 0; // Main의 16번째 줄 i=0;과 맞춤
	}
	public void setCards(Card[] cards) {
		this.cards = cards;
	}
	public Card[] getCards() {
		return cards;
	}
	public void setCount(int count) {
		this.count = count;
	}
	public int getCount() {
		return count;
	}
	public void add(Card card) { //card 하나씩 받을 준비 : 카드를 카드s에 넣어야지
		cards[count] = card;
		count++;
	}
}
