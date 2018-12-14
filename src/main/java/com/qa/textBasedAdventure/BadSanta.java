package com.qa.textBasedAdventure;

public class BadSanta {
	
	private int positionX;
	private int positionY;
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

	public BadSanta(int positionX, int positionY) {
		this.positionX = positionX;
		this.positionY = positionY;
	}
	
	public void updateSanta(Player player) {
		if (positionX < player.getPositionX()) {
			positionX++;
		}
		else {
			positionX--;
		}
		if (positionY < player.getPositionY()) {
			positionY++;
		}
		else
			positionY--;
	}
}
