public class Main_3 {
    public static void main(String[] args) {
        UserProfile pelanggan = new UserProfile(101, "rahasia123", "Daffa", 20, "daffa@email.com", "ktp.jpg");
        UserProfile admin = new UserProfile(999, "adminoke", "Syauka", 25, "syauka@admin.com", "sk_admin.pdf");
        Customer customer1= new Customer(pelanggan);
        Admin admin1 = new Admin(admin);

        System.out.println("====== Try  ======");
        customer1.logIn(101, "rahasia123");
        admin1.logIn(999, "adminoke");
        System.out.println();
        customer1.applyVerification("sim.png");
        admin1.addVehicle();
        admin1.verifyUser(customer1);
        
        System.out.println("Alhamdulillah Bisa & Selesai Ya ALLAH");
    }
}
