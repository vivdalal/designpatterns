package decorator;

public class PizzaMaker {

	public static void main(String[] args) {
		Pizza basicPizza = new TomatoSauce(new Mozzarella(new PlainPizza()));
		
		System.out.println(basicPizza.getClass());

		System.out.println("ingredients : " + basicPizza.getDescription());
		System.out.println("cost: $" + basicPizza.getCost());
	}

}
