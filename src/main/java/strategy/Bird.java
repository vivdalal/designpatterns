package strategy;

public class Bird extends Animal{

	public Bird(Flys flyingType) {
		super();
		
		setSound("Tweet");
		
		this.flyingType = flyingType;
	}
}
