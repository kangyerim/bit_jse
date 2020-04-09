package com.jse.member;

public class Member {
	private String userid;
	private String passwd;
	private String name;
	private int age;

	public Member(String userid, String passwd,String name,int age) {
		// TODO Auto-generated constructor stub
		this.userid = userid;
		this.passwd = passwd;
		this.name = name;
		this.age = age;
	}
	
	public Member() {
		// TODO Auto-generated constructor stub
	}

	public String getUserid () {
		return userid;
	}
	public void setUserid(String userid) {
		this.userid = userid;
	}
	public String getPasswd() {
		return passwd;
	}
	public void setPasswd(String passwd) {
		this.passwd = passwd;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	public String check() {
		String check = String.format("%s, %s, %s, %d", userid, passwd, name, age );
		return check;
	}
}
