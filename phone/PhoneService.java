package com.jse.phone;

public interface PhoneService {
	public void add(Phone phone);
	public void add(CelPhone phone);
	public void add(GalaxyNote phone);
	public void add(Iphone phone);
	public Iphone[] iList();
	public GalaxyNote[] galList();
	public Phone[] phoneList();
	public CelPhone[] celPhoneList();
	public void detail(Iphone phone);
	public void detail(GalaxyNote phone);
	public int count();
	public void update(Phone phone);
	public void delete(Phone phone);
}
