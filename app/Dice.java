package com.jse.app;
/*
public class Dice {
	private int diceNum;
	private String expect;
	
	
	public void setExpect (String expect) {
		this.expect = expect;
	}
	public String getExpect () {
		return expect;
	}
	
	public void setDiceNum(int diceNum) {
		this.diceNum = diceNum;
	}
	public int getDiceNum() {
		return diceNum;
	}
	
	public String result() {
		String result = "";
		switch(diceNum) {
		case 1 : case 3 : case 5 :result ="홀"; break;
		case 2 : case 4 : case 6 :result ="짝"; break;
		}

		String result2 = "틀림";
		if(expect.equals(result)) {
			result2 = "맞음";
		}
		
		return result2;
	}

	
}

*/
public class Dice{
	private String expect;
	private int diceNum;
	
	public String getExpect() {
		return expect;
	}
	public void setExpect(String expect) {
		this.expect = expect;
	}
	
	public int getDiceNum() {
		return diceNum;
	}
	public void setDiceNum(int diceNum) {
		this.diceNum = diceNum;
	}
	
	public String result() {
		String result = "";
		switch(diceNum) {
		case 1: case 5: case 3: result ="홀"; break;
		case 2: case 4: case 6: result ="짝"; break;
		}
		
		String result2 = "틀림";
		if(result.equals(expect)) {
			result2 ="맞음";
		}
		return result2;
	}
	
	
}
	

