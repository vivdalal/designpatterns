package factory;

import java.util.Scanner;

public class EnemyShipTesting {

	public static void main(String[] args) {

		EnemyShipFactory enemyShipFactory = new EnemyShipFactory();
		
		EnemyShip enemyShip = null;
		
		String userInput = "";
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("What type of ship do you want? u/r/b");
		
		if(scanner.hasNextLine()) {
			userInput = scanner.nextLine();
			
			enemyShip = enemyShipFactory.makeEnemyShip(userInput);
		}
		
		if(enemyShip != null) {
			doStuffEnemy(enemyShip);	
		}else {
			System.out.println("Enter a U,R or B as input!");
		}
		
		
		

	}
	
	public static void doStuffEnemy(EnemyShip enemyShip) {
		
		enemyShip.displayEnemyShip();
		enemyShip.followHeroShip(); 
		enemyShip.enemyShipShoots();
	}

}
