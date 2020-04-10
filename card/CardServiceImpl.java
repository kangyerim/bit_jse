package com.jse.card;

public class CardServiceImpl implements CardService{
	private Card[] cards; //for-배열은 한 셋트
	private int count;
	
	public CardServiceImpl() {
		cards = new Card[3];
		count = 0; // Main의 16번째 줄 i=0;과 맞춤
	}
	
	@Override
	public void setCards(Card[] cards) {
		this.cards = cards;
	}
	@Override
	public Card[] getCards() {
		return cards;
	}
	@Override
	public void setCount(int count) {
		this.count = count;
	}
	@Override
	public int getCount() {
		return count;
	}
	@Override
	public void add(Card card) { //card 하나씩 받을 준비 : 카드를 카드s에 넣어야지
		cards[count] = card;
		count++;
	}
	public void printCard() {
		Card[] cards = getCards();
		for(int i=0; i<3; i++) {//for-배열은 한 셋트
		System.out.println(String.format("카드 모양 :  %s, 카드 숫자 :  %d", cards[i].getKind(), cards[i].getNumber()));
		}
	}
}
