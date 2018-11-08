package strategy;

public class AnimalStrategy {

	public static void main(String[] args) {
		
		Animal dog  = new Dog(new CantFly());
		
		Animal bird = new Bird(new ItFlys());
		
		System.out.println("Dog says: " + dog.tryToFly());
		System.out.println("Bird says:  " + bird.tryToFly());
		
		dog.setFlyingType(new ItFlys());
		System.out.println("Dog says: " + dog.tryToFly());

	}

}
