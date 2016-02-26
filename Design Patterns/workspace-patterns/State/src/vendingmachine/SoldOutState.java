package vendingmachine;

public class SoldOutState implements State {
    VendingMachine vendingMachine;
 
    public SoldOutState(VendingMachine gumballMachine) {
        this.vendingMachine = gumballMachine;
    }
 
	public void insertCoin() {
		System.out.println("You can't insert a coin, the machine is sold out");
	}
 
	public void ejectCoin() {
		System.out.println("You can't eject, you haven't inserted a coin yet");
	}
 
	public void turnCrank() {
		System.out.println("You turned, but there are no soda bottles");
	}
 
	public void dispense() {
		System.out.println("No soda dispensed");
	}
 
	public String toString() {
		return "sold out";
	}
}
