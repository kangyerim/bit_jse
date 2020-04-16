package com.jse.member;

public class MemberServiceImpl implements MemberService {
	private Member[] members;
	private int count;

	public MemberServiceImpl() {
		members = new Member[5];
	}

	@Override
	public void add(Member member) {
		members[count] = member;
		count++;
	}
	@Override
	public Member[] list() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public Member detail(Member member) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int count() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Member login(Member member) {
		Member ok = null;
		for (int i = 0; i < members.length; i++) { // 5명의 5개 값중에서 1명의 2개의 값을 확인 :: 검색 search engine :: while아닌이유 :리밋이
													// 없어서
			if (member.getUserid().equals(members[i].getUserid())
					&& member.getPasswd().equals(members[i].getPasswd())) {
				ok = new Member();
				ok = members[i];
				break; //일 끝나면 브레이크
			}
		}
		return ok;
	}



	@Override
	public void update(Member member) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Member member) {
		// TODO Auto-generated method stub
		
	}


}
