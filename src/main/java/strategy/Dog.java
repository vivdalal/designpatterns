package strategy;

public class Dog extends Animal{

	public void bark() {
		System.out.println("Bark Bark!!");
	}
	
	public Dog(Flys flyingType) {
		super();
		
		setSound("Bark");
		
		this.flyingType = flyingType;
		
	}
	
}
