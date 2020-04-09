package com.jse.grade;

public class GradeServiceImpl implements GradeService {

	private Grade[] grades;
	private int count;

	public GradeServiceImpl() {
		grades = new Grade[3];
		count = 0;
	}
	@Override
	public void setGradeBean(Grade[] grades) {
		this.grades = grades;
	}
	@Override
	public Grade[] getGrades() {
		return grades;
	}

	@Override
	public void add(Grade grade) { // 그레이드ㅓ비스에서 가져온 거 .콘크리트 메서드
		grades[count] = grade;
		count++;
	}
	@Override
	public void setCount(int count) {
		// TODO Auto-generated method stub
		this.count=count;
	}
	@Override
	public int getCount() {
		// TODO Auto-generated method stub
		return count;
	}
	@Override
	public int totalScore(Grade grade) {
		return grade.getKorean() + grade.getEnglish() + grade.getMath();
	}
	@Override
	public int averageScore(Grade grade) {
		// TODO Auto-generated method stub
		return totalScore(grade)/3;
	}
	@Override
	public String record(Grade grade) {
		String result ="";
		int deci = averageScore(grade)/10;
		switch(deci) {
		case 9: result ="A"; break;
		case 8: result ="B"; break;
		case 7: result ="C"; break;
		case 6: result ="D"; break;
		case 5: result ="E"; break;
		}
		return result;
	}
	@Override
	public String printGrades() {
		String result = "";
		Grade[] grades = getGrades();
		for(int i=0; i<3; i++) { 
			result += String.format("[%s : 총 %d 점, 평균 %d 점, 학점 %s]", grades[i].getName(), totalScore(grades[i]),averageScore(grades[i]), record(grades[i]));
		}
		return result;
	}

}
