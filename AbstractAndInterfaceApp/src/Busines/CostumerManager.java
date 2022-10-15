package Busines;

import Entities.Costumer;

public class CostumerManager {
    private Costumer costumer;
    private IcreditManager icreditManager;

    public CostumerManager(Costumer costumer,IcreditManager icreditManager) {
        this.icreditManager=icreditManager;
        this.costumer=costumer;
    }

    public void save(){
        System.out.println("müşteri kayedildi");
    }

    public void delete(){
        System.out.println("müşteri silindi");
    }

    public void giveCredit(){
        icreditManager.calculate();
        System.out.println("kredi verildi");
    }
    
}
