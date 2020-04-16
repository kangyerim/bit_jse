package com.jse.phone;

public interface PhoneService {
	public void add(Phone phone);
	public Phone[] list();
	public CelPhone[] celList();
	public Iphone[] iList();
	public GalaxyNote[] galList();
	public void detail(Phone phone);
	public void celDetail(CelPhone celPhone);
	public void iDetail(Iphone iphone);
	public void gDetail(GalaxyNote galaxy);
	public int count();
	public void update(Phone phone);
	public void delete(Phone phone);
}
