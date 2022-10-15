package Busines;

public class MilitaryCreditManager  extends BaseCreditManager   implements IcreditManager{

    @Override
    public void calculate() {
        System.out.println("ASker kredisi hesaplandı");        
    }
    
    
}
