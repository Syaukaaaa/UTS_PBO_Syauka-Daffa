public class Profesor extends Person {
    private double salary;
    public Profesor(String name, String phoneNumber, String emailAddress, double salary) {
    super(name, phoneNumber, emailAddress); 
    this.salary = salary;
    }
    public double getSalary() { 
    return this.salary; 
    }
    public void setSalary(double salary) { 
    this.salary = salary;}
    @Override
    public void purchaseParkingPass() {
    System.out.println("Tidak Ada Bayar Parkir Di Polinema");
    }
}
