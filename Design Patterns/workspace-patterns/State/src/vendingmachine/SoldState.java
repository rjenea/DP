package vendingmachine;

public class SoldState implements State {
 
    VendingMachine vendingMachine;
 
    public SoldState(VendingMachine vendingMachine) {
        this.vendingMachine = vendingMachine;
    }
       
	public void insertCoin() {
		System.out.println("Please wait, we're already giving you a soda");
	}
 
	public void ejectCoin() {
		System.out.println("Sorry, you already turned the crank");
	}
 
	public void turnCrank() {
		System.out.println("Turning twice doesn't get you another soda!");
	}
 
	public void dispense() {
		vendingMachine.releaseSoda();
		if (vendingMachine.getCount() > 0) {
			vendingMachine.setState(vendingMachine.getNoCoinState());
		} else {
			System.out.println("Oops, out of soda!");
			vendingMachine.setState(vendingMachine.getSoldOutState());
		}
	}
 
	public String toString() {
		return "dispensing a soda";
	}
}


