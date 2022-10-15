package Busines;

public class TeacherCreditManager extends BaseCreditManager  implements IcreditManager {

    @Override
    public void calculate() {
        System.out.println("öğretmen kredisi hesaplandı");
    }
    
}
