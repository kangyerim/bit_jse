package com.jse.game;
import java.util.Random;
import com.jse.member.Member;
import java.util.Scanner;

import com.jse.member.Kaup;
import com.jse.util.Calculator;

public class GameController {
	public static String test; //
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		Member member = new Member();
		Random random = new Random();
		Calculator calculator = null;
		Dice dice = new Dice();
		Rps rps = new Rps(); //인스턴스를 만든다
		Kaup kaup = null;
		
		
		while(true) {
			System.out.println("0.종료  "
					+ "1.회원가입  "
					+ "2.로그인  "
					+ "3.계산기  "
					+ "4.주사위 홀짝"
					+ "5.1부터 100까지의 합"
					+ "6.가위바위보"
					+ "(7)카우프 지수");
			int flag = scanner.nextInt();
			
			switch(flag) {
			case 0: System.out.println("가위바위보"); return;
			case 1: System.out.println("회원가입");
			System.out.println("아이디 입력");
			String userid = scanner.next();
			member.setUserid(userid);
			
			break;
			case 2:
				System.out.println("로그인");
				System.out.println("아이디 입력");
				String id2 = scanner.next();
				String returnId = member.getUserid();
				System.out.println("로그인된 아이디" + returnId);
				if(id2.equals(returnId)) {
					System.out.println("로그인 성공!");
				}else {
					System.out.println("로긴 실패~");
				}
				break;
			case 3:
				calculator = new Calculator();
				System.out.println("계산기");
				System.out.println("첫번째 수 입력");
				int a = scanner.nextInt();
				calculator.setNum1(a); // a받아서 num1에 저장
				System.out.println("두번째 수 입력");
				int b = scanner.nextInt();
				calculator.setNum2(b); // b받아서 num2에 저장
				
				int c = calculator.calc(); // 연산은닉
				System.out.println("두 수의 합"+ c);
				break;
				
			case 4:
				System.out.println("주사위 홀짝 맞추기 게임 시작");
				System.out.println("기대하는 홀/짝을 입력해주세요");
				
				String expect = scanner.next();
				System.out.println(String.format("사용자가 입력한 값 : %s", expect));
				dice.setExpect(expect);
				
				int diceNum = random.nextInt(4);
				System.out.println(String.format("컴퓨터가 생성한 숫자 : %s", diceNum));
				dice.setDiceNum(diceNum);
				
				String result = dice.result();
				System.out.println(String.format("결과 값은? : %s", result));
				break;
			case 6:
				System.out.println("1.가위  2.바위  3.보 를 입력하세요");
				int i = scanner.nextInt();
				System.out.println(String.format("사용자의 값은 %s 입니다.", i));
				rps.setUser(i);
				int p = random.nextInt(3)+1;
				System.out.println(String.format("컴퓨터의 값은 %s 입니다", p));
				rps.setCom(p);
				
				String gameResult = rps.gameResult();
				System.out.println(gameResult);			
				break;
				
			case 7:
				kaup = new Kaup();
				System.out.println("키를 입력하세요.");
				kaup.setHight(scanner.nextDouble());
				System.out.println("몸무게를 입력하세요.");
				kaup.setWeight(scanner.nextDouble());
				System.out.println(kaup.kaupResult());
				break;
			}
		}
	}
	
	
	/*
	static void switchDice() {
		System.out.println("주사위 홀짝 맞추기 게임 시작");
		System.out.println("기대하는 홀/짝을 입력해주세요");
		Scanner scanner = new Scanner(System.in);
		String expect = scanner.next();
		System.out.println(String.format("사용자가 입력한 값 : %s", expect));
		Random random = new Random();
		int dice1 = random.nextInt(4);
		System.out.println(String.format("컴퓨터가 생성한 값 : %d", dice1));
		String result = "";
		switch(dice1) {
		case 1 : case 3 : case 5 :result ="홀"; break;
		case 2 : case 4 : case 6 :result ="짝"; break;
		}
		System.out.println(String.format("컴퓨터의 결과 값은? : %s", result));
		String result2 = "틀림";
		if(expect.equals(result)) {
			result2 = "맞음";
		}
		System.out.println(String.format("결과 :%s", result2));
	}*/
}
