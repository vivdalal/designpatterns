package state;

public class ATMMachine {

	ATMState hasCard;
	ATMState noCard;
	ATMState hasCorrectPin;
	ATMState atmOutOfMoney;
	
	ATMState atmState;
	
	int cashInMachine = 1000;
	boolean correctPinEntered = false;
	
	public ATMMachine() {
		hasCard = new HasCard(this);
		noCard = new NoCard(this);
		hasCorrectPin = new HasPIN(this);
		atmOutOfMoney = new NoCash(this);
		
		atmState = noCard;
		
		if(cashInMachine < 0) {
			atmState = atmOutOfMoney;
		}
	}
	
	public void setATMState(ATMState newATMState) {
		atmState = newATMState;
	}
	
	public void setCashInMachine(int newCashInMachine) {
		cashInMachine = newCashInMachine;
	}
	
	public void insertCard() {
		atmState.insertCard();
	}
	
	public void ejectCard() {
		atmState.ejectCard();
	}
	
	public void requestCash(int cashToWithdraw) {
		atmState.requestCash(cashToWithdraw);
	}
	
	public void insertPin(int pinPassed) {
		atmState.insertPin(pinPassed);
	}
	
	public ATMState getYesCardState() {
		return hasCard;
	}
	
	public ATMState getNoCardState() {
		return noCard;
	}
	
	public ATMState getHasPin() {
		return hasCorrectPin;
	}
	
	public ATMState getNoCashState() {
		return atmOutOfMoney;
	}
}
