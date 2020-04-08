package com.jse.inheritance;

public class PhoneService {
	private Phone[] phones;
	private int count;

	public PhoneService() {
		phones = new Phone[3];
		count = 0;
	}

	public void setPhones(Phone[] phones) {
		this.phones = phones;
	}

	public Phone[] getPhones() {
		return phones;
	}

	public void add(Phone phone) { //한명씩 추가한다
		phones[count] = phone;
		count++;
	}
}