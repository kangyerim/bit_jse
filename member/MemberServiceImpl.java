package com.jse.member;

public class MemberServiceImpl implements MemberService {
	private Member[] members;
	private int count;

	public MemberServiceImpl() {
		members = new Member[5];
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
		Member[] searchByName = null;
		int nameCount = count(name);
		if (nameCount != 0) {
			searchByName = new Member[nameCount];
			int j = 0;
			for (int i = 0; i < count; i++) {
				System.out.println(members[i]);
				if (name.equals(members[i].getName())) {
					searchByName[j] = members[i];
					j++;
				}
				if (nameCount == j) {
					break;
				}
			}
		}

		return searchByName;
	}

	@Override
	public Member[] searchByGender(String gender) {
		Member[] searchByGender = null;
		return searchByGender;
	}

	@Override
	public Member detail(String userid) {
		Member detail = null;
		for (int i = 0; i < count; i++) {
			if (userid.equals(members[i].getUserid())) {
				detail = members[i];
				break;
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
		int count = 0;
		for (int i = 0; i < this.count; i++) {
			if (name.equals(members[i].getName())) {
				count++;
			}
		}
		return count;
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
				break;
			}
		}
	}

}
