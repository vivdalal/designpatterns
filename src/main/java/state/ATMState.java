package state;

public interface ATMState {

	void insertCard();
	void ejectCard();
	void insertPin(int pinPassed);
	void requestCash(int cashToWithdraw);
	
	
}
