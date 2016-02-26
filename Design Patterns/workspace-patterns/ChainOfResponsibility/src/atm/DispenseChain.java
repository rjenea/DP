package atm;

public interface DispenseChain {

	void setNextHandler(DispenseChain nextHandler);

	void dispense(Currency cur);

}
