package w3resource;

import java.util.Scanner;

public class Ex6 {


    /**
     * Created by len4ik on 2/26/18.
     */
    public static void main(String[] args) {


        int a, i, c, n;

        System.out.print("Input number of rows : ");

        Scanner in = new Scanner(System.in);
        n = in.nextInt();


        for (i = 1; i <= n; i++) {
            for (c = i; c <= (n + 1); c++) {
                System.out.print(" ");
            }
            for (a = i; a >= 1; a--) {
                System.out.print(a);
            }
            for (a = 2; a<=i && i!=1; a++) {
                System.out.print(a);
            }

            System.out.println("");
        }/////////////////

        for (i = n-1; i >= 1; i--) {
            for (c = i-1; c <= n; c++) {
                System.out.print(" ");
            }
            for (a = i; a >= 1; a--) {
                System.out.print(a);
            }
            for (a = 2; a<=i && i!=1; a++) {
                System.out.print(a);
            }

            System.out.println("");
        }

    }
}