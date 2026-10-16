public class User {
    protected UserProfile userProfile; 
    public User(UserProfile userProfile) {
        this.userProfile = userProfile;
    }
    public void logIn(int userId, String password) {   
        if (this.userProfile.getUserId() == userId && this.userProfile.getPassword().equals(password)) {
            System.out.println("User " + this.userProfile.getName() + " yey bisa login");
        } else {
            System.out.println("Gabisa Login Hayyo, Coba cek ID sama password");
        }
    }
    public void recoverPassword() {
        System.out.println("Cek Password Kak Di : " + this.userProfile.getEmailId());
    }
    public void logOut() {
        System.out.println("User " + this.userProfile.getName() + "Sudah Keluar");
    }
}