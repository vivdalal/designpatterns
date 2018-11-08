package factory;

public class EnemyShipFactory {
	
	public EnemyShip makeEnemyShip(String shipType) {
		
		EnemyShip enemyShip = null;
		if(shipType.equalsIgnoreCase("U")) {
			enemyShip = new UFOEnemyShip();
		}else if(shipType.equalsIgnoreCase("R")){
			enemyShip = new RocketEnemyShip();
		}else if(shipType.equalsIgnoreCase("B")) {
			enemyShip = new BigUFOEnemyShip();
		}
		
		return enemyShip;
	}

}
