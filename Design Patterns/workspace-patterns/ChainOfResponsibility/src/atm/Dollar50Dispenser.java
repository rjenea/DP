package atm;
public class Dollar50Dispenser implements DispenseChain {
 
    private DispenseChain nextHandler;
     
    @Override
    public void setNextHandler(DispenseChain nextHandler) {
        this.nextHandler=nextHandler;
    }
 
    @Override
    public void dispense(Currency cur) {
        if(cur.getAmount() >= 50){
            int num = cur.getAmount()/50;
            int remainder = cur.getAmount() % 50;
            System.out.println("Dispensing "+num+" 50$ note");
            if(remainder !=0) this.nextHandler.dispense(new Currency(remainder));
        }else{
            this. nextHandler.dispense(cur);
        }
    }
 
}
