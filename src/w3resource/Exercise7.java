package w3resource;

import java.util.Scanner;

/**
 * Created by len4ik on 2/25/18.
 */
public class Exercise7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Input first number: ");
        int a = in.nextInt();
        for (int i = 1; i < 11; i++) {
            System.out.println(a + "x" + i + "=" + (a * i));
        }

    }
}
