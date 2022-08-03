package BTVN1;

import java.util.Scanner;

public class Rectangle {
        static Scanner scanner = new Scanner(System.in);
        private double length;
        private double width;

        public Rectangle(){
        }
        public void input(){
            do{
                System.out.println("Input length: ");
                length = scanner.nextFloat();
                System.out.println("Input width: ");
                width = scanner.nextFloat();
            }
            while (length <=0 || width<=0);
        }

        public double getLength() {
            return length;
        }

        public void setLength(double length) {
            this.length = length;
        }

        public double getWidth() {
            return width;
        }

        public void setWidth(double width) {
            this.width = width;
        }

        public double getPerimeter(){
            return 2*(length+width);
        }
        public double getArea(){
            return length*width;
        }
        public Rectangle(double length, double width){
            this.length=length;
            this.width=width;
        }
        public void output(){
            System.out.println("Lenght: " + length);
            System.out.println("Width: " + width);
            System.out.println("Perimeter: " + getPerimeter());
            System.out.println("Area: "+getArea());
        }
}
