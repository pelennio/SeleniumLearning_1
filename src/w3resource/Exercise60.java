package w3resource;

import java.util.Scanner;

public class Exercise60 {


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input number a: ");
//        int a = in.nextInt();
        double a = in.nextDouble();
//        System.out.print("Input number b: ");
//        int b = in.nextInt();
//        System.out.print("Input number c: ");
//        int c = in.nextInt();
        String result="";

        if (a > 0 && a < 1) {
            result = "Positive small number";
        }
        if (a >= 1 ) {
            result = "Positive big number";
        }
        else if (a ==0) {
            result = "zero";
        }
        else if (a < 0) {
            result = "Negative number";
        }


        System.out.println("\n=============================");
        System.out.println(a+" - "+result);
    }
}