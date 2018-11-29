package state;

public class NoCard implements ATMState{

	ATMMachine atmMachine;

	public NoCard(ATMMachine newATMMachine) {
		atmMachine = newATMMachine;
	}

	public void insertCard() {
		System.out.println("Card Entered successfully");
		System.out.println("Please enter a PIN");
		atmMachine.setATMState(atmMachine.getYesCardState());

	}

	public void ejectCard() {
		System.out.println("Enter a Card First!");
	}

	public void insertPin(int pinPassed) {
		System.out.println("Enter a Card First!");
	}

	public void requestCash(int cashToWithdraw) {
		System.out.println("Enter a Card First!");

	}

}
