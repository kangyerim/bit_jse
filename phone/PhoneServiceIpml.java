package com.jse.phone;

public class PhoneServiceIpml implements PhoneService{
	private Phone[] phones;
	private int count;
	private CelPhone[] celPhones;
	private Iphone[] iphones;
	private GalaxyNote[] galaxys;

	public PhoneServiceIpml() {
		phones = new Phone[3];
		celPhones = new CelPhone[3];
		iphones = new Iphone[3];
		galaxys = new GalaxyNote[3];
		count = 0;
	}

	public void add(Phone phone) {
		phones[count] = phone;
		count++;
	}
	public Phone[] list() {
		return phones;
	}
	@Override
	public CelPhone[] celList() {
		// TODO Auto-generated method stub
		return null;
	}
	
	@Override
	public Iphone[] iList() {
		// TODO Auto-generated method stub
		return null;
	}
	
	@Override
	public GalaxyNote[] galList() {
		// TODO Auto-generated method stub
		return null;
	}
	
	@Override
	public void celDetail(CelPhone celPhone) {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public void iDetail(Iphone iphone) {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public void gDetail(GalaxyNote galaxy) {
		// TODO Auto-generated method stub
		
	}
	public int count() {
		return count;
	}
	@Override
	public void detail(Phone phone) {
		// TODO Auto-generated method stub
		
	}
	


	@Override
	public void update(Phone phone) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Phone phone) {
		// TODO Auto-generated method stub
		
	}





}
