package state;

public class HasPIN implements ATMState {
	ATMMachine atmMachine;

	public HasPIN(ATMMachine newATMMachine) {
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
		System.out.println("Already entered PIN");

	}

	public void requestCash(int cashToWithdraw) {
		if(cashToWithdraw > atmMachine.cashInMachine) {
			System.out.println("Not enough cash in the machine");
			System.out.println("Card Ejected");
			atmMachine.setATMState(atmMachine.getNoCardState());
		} else {
			System.out.println(cashToWithdraw + " is provided by the machine");
			atmMachine.setCashInMachine(atmMachine.cashInMachine - cashToWithdraw);
			System.out.println("Card Ejected");
			atmMachine.setATMState(atmMachine.getNoCardState());
			
			if(atmMachine.cashInMachine <= 0) {
				atmMachine.setATMState(atmMachine.getNoCashState());
			}
		}

	}

}
