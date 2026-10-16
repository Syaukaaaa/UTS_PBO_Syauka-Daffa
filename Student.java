public class Student extends Person {
    private String studentNumber;
    private double averageMark;
    public Student(String name, String phoneNumber, String emailAddress, String studentNumber, double averageMark) {
        super(name, phoneNumber, emailAddress); 
        this.studentNumber = studentNumber;
        this.averageMark = averageMark;
    }
    public String getStudentNumber() {
         return this.studentNumber; 
        }
    public double getAverageMark() { 
        return this.averageMark; 
    }
    public boolean isEligibleToEnroll() {
        return this.averageMark >= 60.0;
    }
    public String getSeminarsTaken() {
        return "Anda Punya Akses Di Techno Fair Seminar Polinema";
    }
    @Override
    public void purchaseParkingPass() {
        System.out.println("Tidak ada bayar Parkir di poltek");
    }
}
