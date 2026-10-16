public class Person {
    protected String name;
    protected String phoneNumber;
    protected String emailAddress;
    public Person(String name, String phoneNumber, String emailAddress) {
    this.name = name;
    this.phoneNumber = phoneNumber;
    this.emailAddress = emailAddress;
    }
    // Get set buat mengisi nama,no hp , dan email address
    public String getName() { 
        return this.name; 
    }
    public void setName(String name) {
         this.name = name; 
    }
    
    public String getPhoneNumber() 
    { return this.phoneNumber; 

    }
    public void setPhoneNumber(String phoneNumber) { 
    this.phoneNumber = phoneNumber; 
    }
    
    public String getEmailAddress() { 
    return this.emailAddress; 
    }
    public void setEmailAddress(String emailAddress) { 
    this.emailAddress = emailAddress; 
    }
    public void purchaseParkingPass() {
        System.out.println("Tidak Ada Tarif Parkir Di Polinema");
    }
}