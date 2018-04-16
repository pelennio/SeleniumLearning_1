package w3resource;

import java.util.Scanner;

/**
 * Created by len4ik on 2/25/18.
 */
public class Ex12 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int arr[] = new int[3];
        for (int i=0; i<3; i++) {
            System.out.println("Enter " + (i+1) + "st value: ");

            arr[i]=in.nextInt();
        }


        for (int i=0; i<3; i++) {
        System.out.println(arr[i]);}
    }
}
