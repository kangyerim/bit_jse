package com.jse.grade;

public interface GradeService {
	public void add(Grade grade);

	public void setGradeBean(Grade[] grades);

	public Grade[] getGrades();

	public void setCount(int count);

	public int getCount();

	public int totalScore(Grade grade);

	public int averageScore(Grade grade);

	public String record(Grade grade);

	public String printGrades();

	public String ranking();

}
