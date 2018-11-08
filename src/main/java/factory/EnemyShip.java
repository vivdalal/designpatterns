package factory;

public abstract class EnemyShip {

	private String name;
	private double amtDamage;

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getDamage() {
		return this.amtDamage;
	}

	public void setDamage(double amtDamage) {
		this.amtDamage = amtDamage;
	}

	public void followHeroShip() {
		System.out.println(getName() + "is following the Hero  Ship!");
	}

	public void enemyShipShoots() {
		System.out.println(getName() + " attacks and does " + getDamage());
	}
	
	public void displayEnemyShip() {
		System.out.println(getName() + " is on the screen.");
	}

}
