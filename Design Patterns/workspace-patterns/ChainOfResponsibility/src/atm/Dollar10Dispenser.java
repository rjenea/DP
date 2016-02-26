package atm;
public class Dollar10Dispenser implements DispenseChain {
 
    private DispenseChain nextHandler;
     
    @Override
    public void setNextHandler(DispenseChain nextHandler) {
        this.nextHandler=nextHandler;
    }
 
    @Override
    public void dispense(Currency cur) {
        if(cur.getAmount() >= 10){
            int num = cur.getAmount()/10;
            int remainder = cur.getAmount() % 10;
            System.out.println("Dispensing "+num+" 10$ note");
            if(remainder !=0) this.nextHandler.dispense(new Currency(remainder));
        }else{
            this. nextHandler.dispense(cur);
        }
    }
 
}
