package w3resource;

import java.util.Scanner;

/**
 * Created by len4ik on 2/26/18.
 */
class Ex13 {
    int a;
    int b;

    public void setData(int a, int b) {
        Scanner in = new Scanner(System.in);
        System.out.println("Input Width");
        a = in.nextInt();
        this.a=a;
        System.out.println("Input Height");
        b = in.nextInt();
        this.b=b;
    }

    public void Perimeter() {
        int f = 2 * (a + b);
        System.out.println("Perimeter is "+f);
    }


    public static void main(String[] args) {
        Ex13 p1=new Ex13();
//        Ex13 p2=new Ex13();
        p1.setData(2,4);
//        p2.setData(1,1);
        p1.Perimeter();
//        p2.Perimeter();


    }




}
