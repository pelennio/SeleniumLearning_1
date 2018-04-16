package w3resource;

/**
 * Created by len4ik on 2/26/18.
 */
public class Exercise50 {
    public static void main(String[] args) {

        System.out.println("Divided by 3:  ");
        for (int i = 1; i < 100; i++) {
            if (i % 3 == 0) {
                System.out.print(i + ", ");
            }
        }


        System.out.println("\n\n"+"Divided by 5:  ");
        for (int i = 1; i < 100; i++) {
            if (i % 5 == 0) {
                System.out.print(i + ", ");
            }
        }

        System.out.println("\n\n"+"Divided by 3 & 5:  ");
        for (int i = 1; i < 100; i++) {
            if (i % 15 == 0) {
                System.out.print(i + ", ");
            }
        }
    }
}
