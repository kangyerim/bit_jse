package com.jse.swing;

public class MemberSerivce {
	private MemberBean[] members;     //field에서는 선언만 가능, 멤버 복수형 멤버즈;
	public MemberSerivce() {
		members = new MemberBean[10]; //초기화는 area에서 가능 :
	}
}
