package BTVN1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Rectangle a = new Rectangle();
        System.out.println("Input rectangle a: ");
        a.input();
        a.output();

        Rectangle b = new Rectangle();
        System.out.println("Input rectangle b: ");
        System.out.println("Input length: ");
        b.setLength(scanner.nextDouble());
        System.out.println("Input width: ");
        b.setWidth(scanner.nextDouble());
        b.output();

        if(a.getArea()> b.getArea()){
            System.out.println("Hinh chu nhat a co dien tich lon hon");
        }
        else if (a.getArea() < b.getArea()){
            System.out.println("Hinh chu nhat b co dien ich lon hon");
        }
        else System.out.println("Hai hinh co dien tich bang nhau");
    }
}
