public class Main_2 {
    public static void main(String[] args) {
        Student mhs = new Student("Daffa", "08123", "daffa@mail.com", "2541070", 85.0);
        Profesor dosen = new Profesor("Ibu Endah", "08456", "endah@mail.com", 9000000);
        Graduate_Student alumni = new Graduate_Student("Helmi", "08789", "helmi@mail.com", "2541010", 90.0, 2025, "IT Consultant");
        System.out.println("=== Nama Tiap Entitas ===");
        System.out.println("Mahasiswa Aktif : " + mhs.getName());
        System.out.println("Dosen Pengajar  : " + dosen.getName());
        System.out.println("Alumni Lulusan  : " + alumni.getName());
        System.out.println();// Ijin buk, ini buat batasnya biar ngak nyampur 
        System.out.print("Parkir Mahasiswa : "); mhs.purchaseParkingPass();
        System.out.print("Parkir Dosen     : "); dosen.purchaseParkingPass();
        System.out.print("Parkir Alumni    : "); alumni.purchaseParkingPass();
    }
}
