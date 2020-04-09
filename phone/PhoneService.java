package com.jse.phone;

public class PhoneService {
	private Phone[] phones;
	private int count;
	private CelPhone[] celPhones;
	private Iphone[] iphones;
	private GalaxyNote[] galaxys;

	public PhoneService() {
		phones = new Phone[3];
		celPhones = new CelPhone[3];
		iphones = new Iphone[3];
		galaxys = new GalaxyNote[3];
		count = 0;
	}

	public void add(Phone phone) { // 한명씩 추가한다
		phones[count] = phone;
		count++;
	}
	
	public void add(CelPhone celphone) { //add이름이 같아도 타입이 다르면 됩:overloading
		celPhones[count] = celphone;
		count++;
	}
	
	public void add(Iphone iphone) {
		iphones[count] = iphone;
		count++;
	}
	
	public void add(GalaxyNote galaxy) {
		galaxys[count] = galaxy;
		count++;
	}
	
	public Iphone[] getIphones() {
		return iphones;
	}

	public void setIphones(Iphone[] iphones) {
		this.iphones = iphones;
	}

	public GalaxyNote[] getGalaxys() {
		return galaxys;
	}

	public void setGalaxys(GalaxyNote[] galaxys) {
		this.galaxys = galaxys;
	}

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

	public void setPhones(Phone[] phones) {
		this.phones = phones;
	}

	public Phone[] getPhones() {
		return phones;
	}

}
