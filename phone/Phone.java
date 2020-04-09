package com.jse.phone;

public class Phone {
	private String phoneNumber,name,company;

	public Phone(String phoneNumber, String name, String company) {
		this.company = company;
		
		this.name = name;
		this.phoneNumber = phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public String getCompany() {
		return company;
	}

	@Override // an-notation : 주석 - error에 @주소뜨면 overide안한거
	public String toString() {
		return "Phone : phoneNumber=" + phoneNumber + ", name=" + name + ", company=" + company;
	}

}

class CelPhone extends Phone {
	private boolean portable;
	private String move;

	public CelPhone(String phoneNumber, String name, String company, boolean portable) {
		super(phoneNumber, name, company);
		this.portable = portable;
		setPortable(portable);
	}

	public boolean isPortable() {
		return portable;
	}

	public void setPortable(boolean portable) {
		/*
		if (portable) {
			this.move = "휴대 가능";
		} else {
			this.move = "휴대 불가능";
		}
		*/
		this.move = (portable) ? "휴대 가능" : "휴대 불가능"; //같은 퍼포먼슨데 속도가 더 빠름
	}

	public String getMove() {
		return move;
	}

	public void setMove(String move) {
		this.move = move;
	}

	@Override
	public String toString() {
		return super.toString() + ", portable=" + portable + ", move=" + move + "]";
	}

}

class Iphone extends CelPhone {
	private String search;

	public Iphone(String phoneNumber, String name, String company, boolean portable, String search) {
		super(phoneNumber, name, company, portable);
		this.search = search;
	}

	public String getSearch() {
		return search;
	}

	public void setSearch(String search) {
		this.search = search;
	}

	@Override
	public String toString() {

		return super.toString() + ", search = " + search;
	}
}

class GalaxyNote extends Iphone {
	private String bigsize;

	public GalaxyNote(String phoneNumber, String name, String company, boolean portable, String search,
			String bigsize) {
		super(phoneNumber, name, company, portable, search);
		this.bigsize = bigsize;
	}

	public String getBigsize() {
		return bigsize;
	}

	public void setBigsize(String bigsize) {
		this.bigsize = bigsize;
	}

	@Override
	public String toString() {
		return super.toString() + ", bigsize=" + bigsize + "]";
	}

}
