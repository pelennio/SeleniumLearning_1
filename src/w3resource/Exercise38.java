package w3resource;

/*Write a Java program to count the letters, spaces, numbers and other characters of an input string. Go to the editor
        Expected Output

		The string is :  Aa kiu, I swd skieo 236587. GH kiu: sieo?? 25.33
		letter: 23
		space: 9
		number: 10
		other: 6*/

import java.util.Scanner;

public class Exercise38 {

    public static void main(String[] args) {
        //test
        String test = "Aa kiu, I swd skieo 236587. GH kiu: sieo?? 25.33";
        System.out.println("The string is :" + test);
        count(test);
        //input value
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input a string: ");
        String letters = scanner.nextLine();
        System.out.println("The string is :" + letters);
        count(letters);

    }

    public static void count(String x) {
        char[] ch = x.toCharArray();
        int letter = 0;
        int space = 0;
        int num = 0;
        int other = 0;
        for (int i = 0; i < x.length(); i++) {
            if (Character.isLetter(ch[i])) {
                letter++;
            } else if (Character.isDigit(ch[i])) {
                num++;
            } else if (Character.isSpaceChar(ch[i])) {
                space++;
            } else {
                other++;
            }
        }
        System.out.println("letter: " + letter);
        System.out.println("space: " + space);
        System.out.println("number: " + num);
        System.out.println("other: " + other);
    }
}