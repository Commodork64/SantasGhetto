package com.qa.textBasedAdventure;

public class Player {
	
	private int positionX;
	private int positionY;
	private boolean dead = false;
	private String name;
	private boolean winnerWinner = false;
	
	public boolean isWinnerWinner() {
		return winnerWinner;
	}

	public void setWinnerWinner(boolean winnerWinner) {
		this.winnerWinner = winnerWinner;
	}

	public boolean isDead() {
		return dead;
	}

	public void setDead(boolean dead) {
		this.dead = dead;
	}

	
	public int getPositionX() {
		return positionX;
	}

	public void setPositionX(int positionX) {
		this.positionX = positionX;
	}

	public int getPositionY() {
		return positionY;
	}

	public void setPositionY(int positionY) {
		this.positionY = positionY;
	}

	public String getName() {
		return name;
	}

	public String setName(String name) {
		this.name = name;
		return name;
	}

	private int HP;
	
	public int getHP() {
		return HP;
	}

	public void setHP(int hP) {
		HP = hP;
	}

	public Player(int posx, int posy, String name, int HP){
		
		this.positionX = posx;
		this.positionY = posy;
		this.name = name;
		this.HP = HP;
		
	}

}
