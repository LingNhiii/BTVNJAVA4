package BTVN2;

import java.util.Scanner;

public class Employee {
    static Scanner scanner = new Scanner(System.in);
    private static int id=0;
    public String name;
    public int age;
    public String address;
    public String department;
    public Employee(){
    }
    public Employee(String name, int age, String address, String department) {
        this.name = name;
        this.age = age;
        this.address = address;
        this.department = department;
    }
    public void input() {
        System.out.print("Nhap ten: ");
        name = scanner.nextLine();
        System.out.print("Nhap tuoi: ");
        age = scanner.nextInt();
//        scanner.nextLine();
        System.out.print("Nhap dia chi: ");
        address = scanner.nextLine();
        System.out.print("Nhap bo phan: ");
        department = scanner.nextLine();
    }
    public void display(){
        id++;
        System.out.printf("%-15s%-15s%-15s%-15s%-15s%n", id, name, age, address, department);
    }
}
