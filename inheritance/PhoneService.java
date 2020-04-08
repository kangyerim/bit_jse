package com.jse.inheritance;

public class PhoneService {
	private Phone[] phones;
	private int count;
	private CelPhone[] celPhones;

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	public CelPhone[] getCelPhones() {
		return celPhones;
	}

	public void setCelPhones(CelPhone[] celPhones) {
		this.celPhones = celPhones;
	}

	public PhoneService() {
		phones = new Phone[3];
		celPhones = new CelPhone[3];
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
	public void addCelPhone(CelPhone celphone) {
		celPhones[count] = celphone;
		count++;
	}
}
