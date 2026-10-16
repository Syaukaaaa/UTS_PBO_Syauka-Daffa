public class Admin extends User {
    public Admin(UserProfile userProfile) {
        super(userProfile);
    }
    public void updateVehicleDetails(String vehicleId) {
        System.out.println("Admin " + this.userProfile.getName() + " Jangan Lupa Ditambah Kendaraanya");
    }
    public void addVehicle() {
        System.out.println("Admin " + this.userProfile.getName() + " Asik Dapat Kendaraan.");
    }
    public void retrieveComplain() {
        System.out.println("Admin " + this.userProfile.getName() + " Oke maap, Komplain Akan Kami Proses");
    }
    public void verifyUser(Customer customer) {
        System.out.println("Admin " + this.userProfile.getName() + " memverifikasi customer:" + customer.userProfile.getName());
    }
}
