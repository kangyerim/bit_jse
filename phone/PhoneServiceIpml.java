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
	public void update(Phone phone) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Phone phone) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void add(CelPhone phone) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void add(GalaxyNote phone) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void add(Iphone phone) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Phone[] phoneList() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public CelPhone[] celPhoneList() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void detail(Iphone phone) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void detail(GalaxyNote phone) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int count() {
		// TODO Auto-generated method stub
		return 0;
	}





}
