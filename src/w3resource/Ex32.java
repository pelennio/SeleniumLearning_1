package w3resource;

import java.util.Scanner;

/**
 * Created by len4ik on 2/26/18.
 */
public class Ex32 {
    int a = 0;
    int b = 0;


    public void setData(int a, int b) {
        Scanner in = new Scanner(System.in);
        System.out.println("Input First number - \"a\"");
        a = in.nextInt();
        this.a = a;
        System.out.println("Input Second Number - \"b\"");
        b = in.nextInt();
        this.b = b;
    }


    public static void main(String[] args) {
        Ex32 p1 = new Ex32();
        p1.setData(0, 0);
        p1.comparisson();

    }

    public void comparisson() {
        if (a < b) {
            System.out.println("a<b");
        } else if (a == b) {
            System.out.println("a=b");
        } else {
            System.out.println("a>b");
        }

    }
}
