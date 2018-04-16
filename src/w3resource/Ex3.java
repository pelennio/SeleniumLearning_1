package w3resource;

import java.util.Scanner;

/**
 * Created by len4ik on 2/26/18.
 */
public class Ex3 {


        public static void main(String[] Strings) {

            Scanner input = new Scanner(System.in);

            System.out.print("Input an integer between 0 and 1000: ");
            int num = input.nextInt();

            int firstDigit = num % 10;
            int remainingNumber = num / 10;
            int SecondDigit = remainingNumber % 10;
            remainingNumber = remainingNumber / 10;
            int thirdDigit = remainingNumber % 10;

            int sum = thirdDigit + SecondDigit + firstDigit;

            System.out.println("The sum of all digits in " + num + " is " + sum);

        }
    }

