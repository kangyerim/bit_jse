package com.jse.member;

public class MemberServiceImpl implements MemberService{
	private Member[] members;
	private int count;
	public MemberServiceImpl() {
		members = new Member[5];
	}
	@Override
	public void setMembers(Member[] members) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public Member[] getMembers() {
		return members;
	}
	@Override
	public void add(Member member) {
		System.out.println("서비스로 들어온 멤버");
		System.out.println(member);
		members[count]=member;
		count++;
	}

}
