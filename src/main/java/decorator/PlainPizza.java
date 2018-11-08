package decorator;

public class PlainPizza implements Pizza{
	
	public PlainPizza() {
		System.out.println("Adding dough");
	}

	public String getDescription() {
		return "Thin Dough";
	}

	public double getCost() {
		return 4.00;
	}

}
