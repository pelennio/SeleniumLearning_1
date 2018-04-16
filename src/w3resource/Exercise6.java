package w3resource;

import java.util.Scanner;

/**
 * Created by len4ik on 2/25/18.
 */
public class Exercise6 {
    public static void main(String[] args) {


        Scanner en = new Scanner(System.in);
        System.out.println("Input first number: ");
        int a = en.nextInt();

        System.out.println("Input second number: ");
        int b = en.nextInt();

        System.out.println(a + "+" + b + "=" + (a + b));
        System.out.println(a + "-" + b + "=" + (a - b));
        System.out.println(a + "x" + b + "=" + (a * b));
        System.out.println(a + "/" + b + "=" + (a / b));
        System.out.println(a + " mod " + b + "=" + (a % b));


    }
}
