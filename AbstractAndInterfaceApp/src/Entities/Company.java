package Entities;

public class Company extends Costumer {
    public String taxtNumber;
    public String CompanyName;

    public String getCompanyName() {
        return CompanyName;
    }

    public void setCompanyName(String companyName) {
        CompanyName = companyName;
    }

    public String getTaxtNumber() {
        return taxtNumber;
    }

    public void setTaxtNumber(String taxtNumber) {
        this.taxtNumber = taxtNumber;
    }
    
}
