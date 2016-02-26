package atm;
public class Dollar20Dispenser implements DispenseChain {
 
    private DispenseChain nextHandler;
     
    @Override
    public void setNextHandler(DispenseChain nextHandler) {
        this.nextHandler=nextHandler;
    }
 
    @Override
    public void dispense(Currency cur) {
        if(cur.getAmount() >= 20){
            int num = cur.getAmount()/20;
            int remainder = cur.getAmount() % 20;
            System.out.println("Dispensing "+num+" 20$ note");
            if(remainder !=0) this.nextHandler.dispense(new Currency(remainder));
        }else{
            this. nextHandler.dispense(cur);
        }
    }
 
}
