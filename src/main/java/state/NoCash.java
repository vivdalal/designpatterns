package state;

public class NoCash implements ATMState{
	ATMMachine atmMachine;

	public NoCash(ATMMachine newATMMachine) {
		atmMachine = newATMMachine;
	}

	public void insertCard() {
		System.out.println("No money available in the machine");

	}

	public void ejectCard() {
		System.out.println("No money available in the machine. You didn't enter a card.");
	}

	public void insertPin(int pinPassed) {
		System.out.println("No money available in the machine");

	}

	public void requestCash(int cashToWithdraw) {
		System.out.println("No money available in the machine");

	}

}
