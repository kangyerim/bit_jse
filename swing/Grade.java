package com.jse.swing;
/*
클라이언트에서 프로그램 개발 요청이 왔습니다. 
이름과 국,영,수 세과목점수를 입력받아서() 
[홍길동 : 총점 ***점, * 평균***점,학점 : F] 을 출력하는 프로그램을 만들어 주세요. 
단) 평균은 소수점이하는 절삭합니다 평균점수가 90점 이상 A * 80점 이상이면 B 
70점 이상이면 C 60점 이상이면 D 50점 이상이면 E 50점 미만이면 F 학점입니다라고
 출력되게 해주세요
 * */
public class Grade {
	private String name;
	private int korean;
	private int english;
	private int math;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getKorean() {
		return korean;
	}
	public void setKorean(int korean) {
		this.korean = korean;
	}
	public int getEnglish() {
		return english;
	}
	public void setEnglish(int english) {
		this.english = english;
	}
	public int getMath() {
		return math;
	}
	public void setMath(int math) {
		this.math = math;
	}
	
	public int totalScore() {
		return korean + english + math;
	}
	public int averageScore() {
		return totalScore()/3;
	}
	/*
	public String grade() {
		String grade = "";
		if(averageScore() >= 90) {
			grade = "A";
		}else if(averageScore() >=80) {
			grade = "B";
		}else if(averageScore() >= 70) {
			grade = "C";
		}else if(averageScore() >= 60) {
			grade = "D";
		}else if(averageScore() >= 50) {
			grade = "E";
		}else {
			grade = "F";
		}
		return grade;
	}
	*/
	
	public String grade( ) {
		String grade ="";
		int deci = averageScore()/10;
		switch(deci) {
		case 9: grade ="A"; break;
		case 8: grade ="B"; break;
		case 7: grade ="C"; break;
		case 6: grade ="D"; break;
		case 5: grade ="E"; break;
		}
		return grade;
	}
	
	
	
	public String reportCard() {
		String reportCard = String.format("[%s : 총 %d 점, 평균 %d 점, 학점 %s]", getName(), totalScore(),averageScore(), grade() );
		return reportCard;
	}
	
	
	
	
}
