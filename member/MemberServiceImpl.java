package com.jse.member;

public class MemberServiceImpl implements MemberService {
	private Member[] members;
	private int count;

	public MemberServiceImpl() {
		members = new Member[50000];
		count = 0;
	}

	@Override
	public void add(Member member) {
		members[count] = member;
		count++;
	}

	@Override
	public Member[] list() {

		return members;
	}

	@Override
	public Member[] searchByName(String name) {
		Member[] searchs = null;
		int searchCount = count(name);
		if(searchCount != 0) {
			searchs = new Member[searchCount];
			int j = 0;
			for(int i = 0; i < count; i++) {
				if(name.equals(members[i].getName())) {
					searchs[j] = members[i];
					j++;
					if(searchCount == j) {
						break;
					}
				}
			}
			
		}
		return searchs;
	}

	@Override
	public Member[] searchByGender(String gender) {
		Member[] serchGenders = null;

		return serchGenders;
	}

	@Override
	public Member detail(String userid) {
		Member detail = new Member();
		for (int i = 0; i < count; i++) {
			if (userid.equals(members[i].getUserid())) {
				detail = members[i];
			}
		}
		return detail;
	}

	@Override
	public int count() {
		return count;
	}

	@Override
	public int count(String name) {
		int returnCount = 0;
		for (int i = 0; i < count; i++) {
			if (name.equals(members[i].getName())) {
				returnCount++;
			}
		}
		return returnCount;
	}

	@Override
	public Member login(Member member) {
		Member login = null;
		for (int i = 0; i < count; i++) {
			if (member.getUserid().equals(members[i].getUserid())
					&& member.getPasswd().equals(members[i].getPasswd())) {
				login = members[i];
				break;
			}
		}
		return login;
	}

	@Override
	public void update(Member member) {
		for (int i = 0; i < count; i++) {
			if (member.getUserid().equals(members[i].getUserid())) {
				members[i].setPasswd(member.getPasswd());
				break;
			}
		}
	}

	@Override
	public void delete(Member member) {
		for (int i = 0; i < count; i++) {
			if (member.getUserid().equals(members[i].getUserid())
					&& member.getPasswd().equals(members[i].getPasswd())) {
				members[i] = members[count - 1];
				members[count - 1] = null;
				count--;
			}
		}
	}

}
