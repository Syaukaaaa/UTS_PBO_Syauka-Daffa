public class Customer extends User {
    private boolean verificationStatus = false;
    public Customer(UserProfile userProfile) {
        super(userProfile);
    }
    public boolean getVerificationStatus() {
        return this.verificationStatus;
    }
    public void applyVerification(String doc) {
        System.out.println("Customer " + this.userProfile.getName() + "Minta Verifikasi Tuh!");
        this.verificationStatus = true;
    }
}