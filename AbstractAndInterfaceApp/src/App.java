import java.time.Period;

import Busines.BaseCreditManager;
import Busines.CostumerManager;
import Busines.CostumerManager;
import Busines.CreditManager;
import Busines.IcreditManager;
import Busines.MilitaryCreditManager;
import Busines.TeacherCreditManager;
import Entities.Company;
import Entities.Costumer;
import Entities.Person;

public class App {
    public static void main(String[] args) throws Exception {

    
        CostumerManager costumerManager=new CostumerManager(new Costumer(),new MilitaryCreditManager() );
        costumerManager.giveCredit();
    
        BaseCreditManager teacherCredit =new TeacherCreditManager();
        teacherCredit.calculate();
        teacherCredit.save();
    
    
    
        /*   CreditManager creditManager = new CreditManager();
        creditManager.calculate();
        creditManager.save();
        Costumer costumer = new Costumer();
        costumer.setId(1);
        Company company = new Company();
        company.setId(2);
        company.setTaxtNumber("12341241");
        company.setCity("istanbul");
        company.setCompanyName("asus");
        Person person = new Person();
        person.setCity("ankara");
        person.setFirstName("ömer");
        person.setId(3);
        person.setLastName("kan");
        person.setNationalIdentity("123412314");

        CostumerManager costumerManager = new CostumerManager(new Person());
*/
    }
}
