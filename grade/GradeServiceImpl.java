package com.jse.grade;

public class GradeServiceImpl implements GradeService {

	private Grade[] grades;
	private int count;

	public GradeServiceImpl() {
		grades = new Grade[5];
		count = 0;
	}

	@Override
	public void add(Grade grade) { // 그레이드ㅓ비스에서 가져온 거 .콘크리트 메서드
		grades[count] = grade;
		count++;
	}

	@Override
	public Grade[] list() {
		return grades;
	}

	@Override
	public Grade detail(Grade grade) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int count() {
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
		return totalScore(grade) / 3;
	}

	@Override
	public String record(Grade grade) {
		String result = "";
		int deci = averageScore(grade) / 10;
		switch (deci) {
		case 9:
			result = "A";
			break;
		case 8:
			result = "B";
			break;
		case 7:
			result = "C";
			break;
		case 6:
			result = "D";
			break;
		case 5:
			result = "E";
			break;
		}
		return result;
	}

	@Override
	public String ranking() {
		grades = this.list();
		int a = totalScore(grades[0]);
		int y = totalScore(grades[1]);
		int z = totalScore(grades[2]);
		if (a > y && a > z) {
			if (y > z) {
				System.out.println(
						"1등 :" + grades[0].getName() + " 2등:" + grades[1].getName() + " 3등:" + grades[2].getName());
			} else if (z > y) {
				System.out.println(
						"1등 :" + grades[0].getName() + " 2등:" + grades[2].getName() + " 3등:" + grades[1].getName());
			}
		} else if (y > a && y > z) {
			if (a > z) {
				System.out.println(
						"1등 :" + grades[1].getName() + " 2등:" + grades[0].getName() + " 3등:" + grades[2].getName());
			} else if (z > a) {
				System.out.println(
						"1등 :" + grades[1].getName() + " 2등:" + grades[2].getName() + " 3등:" + grades[0].getName());
			}
		} else if (z > y && z > a) {
			if (y > a) {
				System.out.println(
						"1등 :" + grades[2].getName() + " 2등:" + grades[1].getName() + " 3등:" + grades[0].getName());
			} else if (a > y) {
				System.out.println(
						"1등 :" + grades[2].getName() + " 2등:" + grades[0].getName() + " 3등:" + grades[1].getName());
			}
		}
		return null;

	}

	@Override
	public void update(Grade grade) {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(Grade grade) {
		// TODO Auto-generated method stub

	}

}
