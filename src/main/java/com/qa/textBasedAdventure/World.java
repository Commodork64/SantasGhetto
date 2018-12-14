package com.qa.textBasedAdventure;

public class World implements message {
	
	public int minX = 0;
	public int minY = 0;
	public int maxX = 100;
	public int maxY = 100;
	public int getMinX() {
		return minX;
	}

	public int getMinY() {
		return minY;
	}

	public int getMaxX() {
		return maxX;
	}

	public int getMaxY() {
		return maxY;
	}

	public int turnCount = 0;
	
	public World() {

	}
	
	public void moveNorth(Player player) {
		System.out.println("You plough northward through the snow.");
		player.setPositionY(player.getPositionY() + 1); 
	}
	
	public void moveSouth(Player player) {
		System.out.println("You forge ahead, southward bound.");
		player.setPositionY(player.getPositionY() - 1); 
	}
	
	public void moveWest(Player player) {
		System.out.println("The winds of the west blow strongly.");
		player.setPositionX(player.getPositionX() - 1); 
	}
	
	public void moveEast(Player player) {
		System.out.println("You head towards the east.");
		player.setPositionX(player.getPositionX() + 1); 
	}
	
	//check player
	public void checkLocation(Player player, BadSanta santa, Treasure treasure) {
		System.out.println("Your current positionX is: " + player.getPositionX());
		System.out.println("Your current positionY is: " + player.getPositionY());
		System.out.println("You are: " + (int)(treasure.getTreasurePositionX() - player.getPositionX()) + " X positions away from the treasure.");
		System.out.println("You are: " + (int)(treasure.getTreasurePositionY() - player.getPositionY()) + " Y positions away from the treasure.");
		int santaIsThisFarAway = (int)(santa.getPositionX() - (int)player.getPositionX()); // make this positive.
		System.out.println("santa is " + Math.abs(santaIsThisFarAway)  + " moves away at most!");
	}
	
	// this will give the feeling of santa coming for you.
	public void printMessage() {
		if (turnCount == 5) {
			System.out.println("");
			turnCountFive();
		}
		else if (turnCount == 10) {
			System.out.println("");
			turnCountTen();
		}
		else if (turnCount == 25) {
			System.out.println("");
			turnCountTwenty();
		}
		
		turnCount++;
	}
	
	public void turnCountFive() {
		System.out.println("The storm has arrived and delivered with it a harsh "
				+ "freezing cold that snaps at your resolve. In the distance you "
				+ "can here the sound of a booming voice... 'So-hoho!'");
	}
	
	public void turnCountTen() {
		System.out.println("The storm has began to settle down but now in the "
				+ "distance, you can see 'it'. A round belly, a grey beard. "
				+ "Whatever it is, it's getting closer.");
	}
	
	public void turnCountTwenty() {
		System.out.println("He's close now. Breathing down your neck. Only the "
				+ "treasure can save you, hurry!!");
	}
	
	public boolean AmIWinner(Player player, Treasure treasure) {
		if (player.getPositionX() == treasure.getTreasurePositionX() && player.getPositionY() == treasure.getTreasurePositionY()) {
			player.setWinnerWinner(true);
			return true;
		}
		else {
			return false;
		}
		
	}
	
	public boolean whereIsSanta(Player player, BadSanta santa){
		if (santa.getPositionX() == player.getPositionX() && santa.getPositionY() == player.getPositionY()) {
			player.setDead(true);
			return true;
		}
		else {
			return false;
		}
	}
}
