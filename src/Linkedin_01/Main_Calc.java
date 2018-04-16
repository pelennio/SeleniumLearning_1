package Linkedin_01;

import java.util.Scanner;

public class Main_Calc{

    public static void main(String[] args) {

        String s1 = getInput("Enter a numeric value: ");
        String s2 = getInput("Enter a numeric value: ");
        String s3 = getInput("Shose from (+ - * / ) ");

        double result=0;


        switch (s3)
        {case "+":
            result = addValues(s1, s2);
            break;
            case "/":
                result = divideValues(s1, s2);
                break;
            case "*":
                result = multiValues(s1, s2);
                break;
            case "-":
                result = substractValues(s1, s2);
                break;}
        System.out.println("Result: "+result);
    }

    private static double addValues(String s1, String s2) {
        double d1 = Double.parseDouble(s1);
        double d2 = Double.parseDouble(s1);
        return  d1+d2;
    }private static double substractValues(String s1, String s2) {
        double d1 = Double.parseDouble(s1);
        double d2 = Double.parseDouble(s1);
        return  d1-d2;
    }private static double multiValues(String s1, String s2) {
        double d1 = Double.parseDouble(s1);
        double d2 = Double.parseDouble(s1);
        return  d1*d2;
    }private static double divideValues(String s1, String s2) {
        double d1 = Double.parseDouble(s1);
        double d2 = Double.parseDouble(s1);
        return  d1/d2;
    }


    private static String getInput(String promt) {
        System.out.print(promt);
        Scanner sc = new Scanner(System.in);
        return sc.nextLine();
    }
}
