package com.jse.card;

public class CardServiceImpl implements CardService{
	private Card[] cards; //for-배열은 한 셋트
	private int count;
	
	public CardServiceImpl() {
		cards = new Card[3];
		count = 0; // Main의 16번째 줄 i=0;과 맞춤
	}
	
	@Override
	public int count() {
		return count;
	}
	@Override
	public void add(Card card) { //card 하나씩 받을 준비 : 카드를 카드s에 넣어야지
		cards[count] = card;
		count++;
	}
	@Override
	public Card[] list() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Card detail(Card card) {
		// TODO Auto-generated method stub
		return null;
	}

	public void printCard() {
		Card[] cards = list();
		for(int i=0; i<3; i++) {//for-배열은 한 셋트
		System.out.println(String.format("카드 모양 :  %s, 카드 숫자 :  %d", cards[i].getKind(), cards[i].getNumber()));
		}
	}



	@Override
	public void update(Card card) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Card card) {
		// TODO Auto-generated method stub
		
	}
}
