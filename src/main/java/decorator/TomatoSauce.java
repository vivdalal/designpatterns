package decorator;

public class TomatoSauce extends ToppingDecorator{

	public TomatoSauce(Pizza newPizza) {
		super(newPizza);
		System.out.println("Adding tomato sauce");
	}

	
	public String getDescription() {
		return tempPizza.getDescription() + ", TomatoSauce";
	}

	public double getCost() {
		return tempPizza.getCost() + .20;
	}
	
}
