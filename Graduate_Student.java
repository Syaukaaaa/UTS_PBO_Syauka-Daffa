public class Graduate_Student extends Student {
    private int graduationYear;
    private String currentJob;
    public Graduate_Student(String name, String phoneNumber, String emailAddress,String studentNumber, double averageMark,int graduationYear, String currentJob) {
    super(name, phoneNumber, emailAddress, studentNumber, averageMark);
    this.graduationYear = graduationYear;
    this.currentJob = currentJob;
    }
    public int getGraduationYear() { 
        return this.graduationYear; 
    }
    public void setGraduationYear(int graduationYear) { 
        this.graduationYear = graduationYear; 
    }
    
    public String getCurrentJob() { 
        return this.currentJob; 
    }
    public void setCurrentJob(String currentJob) { 
        this.currentJob = currentJob; 
    }
    @Override
    public void purchaseParkingPass() {
        System.out.println("Khusus Alumni bayar 2.000 hehehe");
    }
}