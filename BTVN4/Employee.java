package BTVN4;

import java.util.Scanner;

public class Employee {
    static Scanner scanner = new Scanner(System.in);
    public String id;
    public String name;
    public int age;
    public int workingDays;
    public double salary;
    final int Price=50;
    public Employee(){
    }

    public Employee(String id, String name, int age, int workingDays) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.workingDays = workingDays;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getWorkingDays() {
        return workingDays;
    }

    public void setWorkingDays(int workingDays) {
        this.workingDays = workingDays;
    }

    public double salary(){
        return workingDays*Price;
    }

    public void input(){
        System.out.println("Input id: ");
        id = scanner.nextLine();
        System.out.println("Input name: ");
        name = scanner.nextLine();
        System.out.println("Input age: ");
        age = scanner.nextInt();
        System.out.println("Input working days: ");
        workingDays = scanner.nextInt();
    }
    public void output(){
        System.out.println("Id: "+id);
        System.out.println("Name: "+name);
        System.out.println("Age: "+age);
        System.out.println("Working days: "+workingDays);
        System.out.println("Salary: "+salary());
    }

    public static void main(String[] args) {
        Employee a = new Employee();
        a.input();
        a.output();
    }
}
