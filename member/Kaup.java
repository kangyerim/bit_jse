package com.jse.member;
/*
 개발자님 키와 몸무게를 이용하여
 카우푸지수를 구하고
 그 결과 정상, 저체중, 비만 등으로 몸의 상태만
 알려주는 프로그램을 만들어주세요~
 */
public class Kaup {
	private double hight;
	private double weight;
	
	public double getHight() {
		return hight;
	}
	public void setHight(double hight) {
		this.hight = hight / 100;
	}
	
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	
	public String kaupResult() {
		String state = "";
		double kaup = weight / (hight*hight);
		if(kaup < 13) {
			state = "영양실조";
		}else if(kaup < 15) {
			state = "여윔";
		}else if(kaup < 18) {
			state = "정상";
		}else if(kaup <20) {
			state = "과체중";
		}else if(20 <= kaup) {
			state = "비만";
		}else{
			state = "잘못된 값 입니다.";
		}
		return state;
	}
}
