package com.qa.textBasedAdventure;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	// create game objects.
    	Player player = new Player(50, 50, "", 100); // posX, posY, name, HP
    	Treasure treasure = new Treasure(30, 67);
    	World world = new World(); // treasure x, treasure y
    	BadSanta santa = new BadSanta(0, 98); // posX, posY
    	Elf elf = new Elf(70, 60);
    	
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter your name adventurer...");
        String input = (player.setName(sc.next()));
        
        System.out.println("Welcome: " + player.getName() + " to Santa's ghetto.");
        
        world.printMessage();
        
        // main game loop.
        while(player.isDead() == false || player.isWinnerWinner() == true) {  	
        	
        	System.out.println("What would you like to do?");
        	input = sc.next().toLowerCase();
        	
        	if (input.equals("check") || input.equals("c")) {
        		world.checkLocation(player, santa, treasure);
        	}
        	else if (input.equals("north") || input.equals("n")) {
        		if (player.getPositionY() == world.maxY) {
        			System.out.println("You are as north as you can go");
        		}
        		else {
        			world.moveNorth(player);
        		}
        	}
        	else if (input.equals("south") || input.equals("s")) {
        		if (player.getPositionY() == world.minY) {
        			System.out.println("You are as south as you can go");
        		}
        		else {
        			world.moveSouth(player);
        		}
        	}
        	else if (input.equals("west") || input.equals("w")) {
        		if (player.getPositionX() == world.minX) {
        			System.out.println("You are as west as you can go");
        		}
        		else {
        			world.moveWest(player);
        		}
        	}
        	else if (input.equals("east") || input.equals("e")) {
        		if (player.getPositionX() == world.maxX) {
        			System.out.println("You are as east as you can go");
        		}
        		else {
        			world.moveEast(player);
        		}
        	}
        	else {
        		System.out.println("Invalid Command");
        		continue;
        	}
        	
        	if (world.whereIsSanta(player, santa)) {
        		System.out.print("Santa has found you! You are dead!");
        	}
        	if (world.AmIWinner(player, treasure)) {
        		System.out.println("You have found the treasure, well done!");
        		break; // I have literally no idea why this doesn't exit without a break.
        	}
        	
        	elf.checkIfFound(player);
        	world.printMessage();
        	santa.updateSanta(player);

        }
        
        System.out.println("Thank you for playing!");
        
    }
    
}
