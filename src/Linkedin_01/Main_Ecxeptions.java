package Linkedin_01;

public class Main_Ecxeptions {

    public static void main(String[] args) {
	// write your code here
        /*System.out.println("Hello World");
        int x=1;
        String y="Hello";*/

       /* String welcome = "Welcome";
        char[] chars = welcome.toCharArray();
        for (char character: chars) {

            System.out.println("last char:" + character);
        }*/

        try {
            String welcome = "Welcome";
            char[] chars = welcome.toCharArray();
            char lastChar=chars[chars.length-1];
            System.out.println("Last char: " + (lastChar));
            String nothing = null;
            System.out.println(nothing.length());


        }catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array");
            e.printStackTrace();
            return;

        }catch (NullPointerException e) {
            System.out.println("Null Ex");
            e.printStackTrace();
            return;

        }catch (Exception e) {
            System.out.println("All Exeption");
            e.printStackTrace();
            return;
        }

        System.out.println("Code ran successfully");


       /* String nothing = "null";
        System.out.println(nothing);
        char[] newNothig = nothing.toCharArray();
        System.out.println("string length=" + newNothig.length+ newNothig[2]);
*/

    }
}
