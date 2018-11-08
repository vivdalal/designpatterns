package strategy;

public class Animal {

	public String name;
	public String favFood;
	public double speed;
	public double height;
	public int weight;
	public String sound;
	
	
	public Flys flyingType;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getFavFood() {
		return favFood;
	}

	public void setFavFood(String favFood) {
		this.favFood = favFood;
	}

	public double getSpeed() {
		return speed;
	}

	public void setSpeed(double speed) {
		this.speed = speed;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}
	
	public void setSound(String sound) {
		this.sound = sound;
	}
	
	public String getSound() {
		return sound;
	}
	
	
	public String tryToFly() {
		return flyingType.fly();
	}
	
	
	public void setFlyingType(Flys newFlyingType) {
		flyingType = newFlyingType;
	}

}
