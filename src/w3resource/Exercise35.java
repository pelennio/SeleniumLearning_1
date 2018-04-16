package w3resource;

import java.util.Scanner;
public class Exercise35 {
    //Area of a polygon = (n*s^2)/(4*tan(π/n))
      public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input the length of a side of the polygon: ");
        double s = input.nextDouble();
          System.out.print("Input the number of sides on the polygon: ");
        int n = input.nextInt();
        System.out.print("The area of the polygon is: " + polygonArea(s,n)+"\n");
    }
    public static double polygonArea(double s, int n) {
        return (n*(s*s))/(4*Math.tan(Math.PI/n));
    }
}