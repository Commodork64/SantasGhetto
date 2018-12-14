package com.qa.textBasedAdventure;

public class Elf implements message {
	
	private int positionX;
	private int positionY;
	
	public Elf(int posX, int posY) {
		this.positionX = posX;
		this.positionY = posY;
	}
	
	public void checkIfFound(Player player) {
		if (positionX == player.getPositionX() && positionY == player.getPositionY()) {
			printMessage();
		}
	}
	
	
	
	public int getPositionX() {
		return positionX;
	}

	public int getPositionY() {
		return positionY;
	}

	public void printMessage() {
		System.out.println("You come across a small hole in the ground. "
				+ "As you approach it, you hear a small whine and before long "
				+ "out pops an Elf, covered in cuts and graises");
		System.out.println("My god. You're still alive... ");
		System.out.println("He.. He hasn't found you yet then. ");
		System.out.println("Listen to me closely, the one who is after "
				+ "you. It's him, it's Santa Claws. The meanist drug lord "
				+ "in the world. He got ol' Claus hooked on eggnogg and "
				+ "he'll do it to you too!");
		System.out.println("The elf quickly disappeared back into the hole. "
				+ "His message was far colder than the storm ever could be. "
				+ "Santa is coming to town.");
	}

}
