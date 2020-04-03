package com.jse.app;

public class Rps {
	private int user;
	private int com;
	
	public int getUser () {
		return user;
	}
	public void setUser(int user) {
		this.user = user;
	}
	
	public int getCom() {
		return com;
	}
	public void setCom(int com) {
		this.com = com;
	}
	
	public String gameResult() {
		String gameResult = "";
		switch (user) {
		case 1: 
			if(com == 1) {
				gameResult = "비겼당";
			}else if (com == 2) {
				gameResult = "컴터가 이겼다";
			}else if (com == 3) {
				gameResult = "내가 이겼다";
			}
			break;
		case 2: 
			if(com == 1) {
				gameResult = "내가 이겼다";
			}else if (com == 2) {
				gameResult = "비겼다";
			}else if (com == 3) {
				gameResult = "컴터가 이겼다";
			}
			break;
		case 3:
			if(com == 1) {
				gameResult ="컴터가 이겼다";
			}else if (com == 2) {
				gameResult ="내가 이겼다";
			}else if (com == 3) {
				gameResult ="비겼다";
			}
			break;
		}
		
		return gameResult;
	}
}
