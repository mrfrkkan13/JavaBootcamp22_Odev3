package Entities;

public class Costumer {
    public int id;
    public String city;
    
    
    public Costumer() {
        System.out.println("müşteri nesnesi başlatıldı");
        
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


    public String getCity() {
        return city;
    }


    public void setCity(String city) {
        this.city = city;
    }

   

}
