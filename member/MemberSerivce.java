package com.jse.member;

public class MemberSerivce {
	private Member[] members;     //field에서는 선언만 가능, 멤버 복수형 멤버즈;
	public MemberSerivce() {
		members = new Member[10]; //초기화는 area에서 가능 :
	}
}
