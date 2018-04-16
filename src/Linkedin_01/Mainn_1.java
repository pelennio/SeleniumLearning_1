package Linkedin_01;

/**
 * Created by len4ik on 3/30/18.
 */
public class Mainn_1 {
    public static void main(String[] args) throws InterruptedException {


        try {
            String welcome = "Welcome!";
            char[] chars = welcome.toCharArray();
            char lastChar = chars[chars.length - 1];
            System.out.println("last char: " + lastChar);

        } catch (ArrayIndexOutOfBoundsException e) {
            e.printStackTrace();
            System.out.println("Array index exeption");
            return;
        }  catch (Exception e) {
            System.out.println("Any exeption");
        }

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Code ran successfully");

        doSome();


    }

    public static void doSome() throws InterruptedException {
        Thread.sleep(100);

    }
}