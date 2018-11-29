package state;

public class HasCard implements ATMState {

	ATMMachine atmMachine;

	public HasCard(ATMMachine newATMMachine) {
		atmMachine = newATMMachine;
	}

	public void insertCard() {
		System.out.println("You cannot enter more than 1 card");

	}

	public void ejectCard() {
		System.out.println("Card ejected");
		atmMachine.setATMState(atmMachine.getNoCardState());
	}

	public void insertPin(int pinPassed) {
		if (pinPassed == 1111) {
			System.out.println("Correct PIN entered");
			atmMachine.correctPinEntered = true;
			atmMachine.setATMState(atmMachine.hasCorrectPin);
		} else {
			System.out.println("Incorrect PIN passed");
			System.out.println("Card Ejected");
			atmMachine.setATMState(atmMachine.getNoCardState());
		}

	}

	public void requestCash(int cashToWithdraw) {
		System.out.println("Enter PIN first");

	}

}
