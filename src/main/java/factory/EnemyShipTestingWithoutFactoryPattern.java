package factory;

import java.util.Scanner;

public class EnemyShipTestingWithoutFactoryPattern {
	
	public static void main(String[] args) {
		
		EnemyShip enemyShip = null;
		
		Scanner userInput = new Scanner(System.in);
		
		String enemyOption = "";
		
		System.out.println("What type of ship? u/r");
		
		if(userInput.hasNextLine()) {
			enemyOption = userInput.nextLine();
		}
		
		if(enemyOption.equalsIgnoreCase("U")) {
			enemyShip = new UFOEnemyShip();
		}else if(enemyOption.equalsIgnoreCase("R")) {
			enemyShip = new RocketEnemyShip();
		}
		
		doStuffEnemy(enemyShip);
	}
	
	public static void doStuffEnemy(EnemyShip enemyShip) {
		
		enemyShip.displayEnemyShip();
		enemyShip.followHeroShip(); 
		enemyShip.enemyShipShoots();
	}

}
