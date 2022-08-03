package BTVN3;

import java.util.Scanner;

public class PTB2 {
    public float a,b,c;
    Scanner scanner = new Scanner(System.in);
    public PTB2(){
    }
    public void input(){
        System.out.println("a= ");
        a = scanner.nextFloat();
        System.out.println("b= ");
        b = scanner.nextFloat();
        System.out.println("c= ");
        c = scanner.nextFloat();
    }
    public void solve(){
        if(a==0){
            System.out.println("x= " + -c/b);
        }
        else {
            float delta = b*b - 4*a*c;
            if(delta<0){
                System.out.println("Vo nghiem");
            }
            else if(delta==0){
                System.out.println("x= " + -b/2*a);
            }
            else {
                System.out.println("x1= "+ (-b + Math.sqrt(delta))/(2*a));
                System.out.println("x2= "+ (-b -Math.sqrt(delta))/(2*a));
            }
        }
    }

    public static void main(String[] args) {
        PTB2 a = new PTB2();
        a.input();
        a.solve();
    }
}
