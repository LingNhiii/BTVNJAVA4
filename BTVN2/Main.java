package BTVN2;

public class Main {
    public static void main(String[] args) {
        Employee a = new Employee("A",23,"TH","CNTT");
        Employee b = new Employee("B", 21, "HN", "QLI");
        Employee c = new Employee("C", 21, "HP", "CNTT");
        Employee d = new Employee("D", 24, "QLI", "CNTT");
        Employee e = new Employee("E", 25, "HN", "QLI");
        System.out.println("\t\t\tTHONG TIN CAC NHAN VIEN");
        System.out.printf("%-15s%-15s%-15s%-15s%-15s%n", "MaNV", "TenNV", "Tuoi", "Dia Chi", "Bo Phan");
        a.display();
        b.display();
        c.display();
        d.display();
        e.display();
    }
}
