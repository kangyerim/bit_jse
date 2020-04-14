package com.jse.member;

public class MemberServiceImpl implements MemberService {
	private Member[] members;
	private int count;
	boolean ok;

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
		members[count] = member;
		count++;
	}

	@Override
	public boolean login(Member member) {
		boolean ok = false;
		for (int i = 0; i < members.length; i++) { // 5명의 5개 값중에서 1명의 2개의 값을 확인 :: 검색 search engine :: while아닌이유 :리밋이
													// 없어서
			if (member.getUserid().equals(members[i].getUserid())
					&& member.getPasswd().equals(members[i].getPasswd())) {
				ok = true;
			}
		}
		return ok;
	}

}
