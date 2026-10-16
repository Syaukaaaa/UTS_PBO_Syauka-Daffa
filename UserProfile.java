public class UserProfile {
    private int userId;
    private String password;
    private String name;
    private int age;
    private String emailId;
    private String doc; 
    public UserProfile(int userId, String password, String name, int age, String emailId, String doc) {
        this.userId = userId;
        this.password = password;
        this.name = name;
        this.age = age;
        this.emailId = emailId;
        this.doc = doc;
    }
    public int getUserId() { 
        return this.userId; 
    }
    public String getPassword() { 
        return this.password;
     }
    public String getName() { 
        return this.name; 
    }
    public int getAge() { 
        return this.age; 
    }
    public String getEmailId() { 
        return this.emailId; 
    }
    public void editProfile(String name, int age, String emailId) {
        this.name = name;
        this.age = age;
        this.emailId = emailId;
        System.out.println("Profil " + this.name + " berhasil diperbarui!");
    }
    public void showDocuments() {
        System.out.println("Menampilkan dokumen pengguna: " + this.doc);
    }
}
