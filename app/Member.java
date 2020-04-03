package com.jse.app;

public class Member {
	private String id; //인스턴스 변수 / 참조주소 :reference
	public Member() { //생성자
		
	}
	public void setId(String id) { //메서드 에어리어
		System.out.println("지역변수 들어옴" + id);
		this.id = id;
		System.out.println("인스턴스 변수에 저장됨 :" + this.id);
	}
	public String getId() {
		return this.id;
	}
	
}

/*
public class Member {
	private String id;	//인스턴스
	public Member() { //생성자
		
	}
	public void setId(String id) { //메서드
		
	}
	public void getId() {
		
	}
	
}*/