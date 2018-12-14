package com.qa.textBasedAdventure;

public class Treasure {
	
	private int treasurePositionX;
	private int treasurePositionY;
	
	public Treasure(int treasurePositionX, int treasurePositionY) {
		this.treasurePositionX = treasurePositionX;
		this.treasurePositionY = treasurePositionY;
	}

	public int getTreasurePositionX() {
		return treasurePositionX;
	}

	public void setTreasurePositionX(int treasurePositionX) {
		this.treasurePositionX = treasurePositionX;
	}

	public int getTreasurePositionY() {
		return treasurePositionY;
	}

	public void setTreasurePositionY(int treasurePositionY) {
		this.treasurePositionY = treasurePositionY;
	}
	
	

}
