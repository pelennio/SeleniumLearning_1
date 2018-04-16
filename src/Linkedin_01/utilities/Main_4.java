package Linkedin_01.utilities;

/**
 * Created by len4ik on 4/2/18.
 */
public class Main_4 {
    public static void main(String[] args) {

        MainHelper helper = new MainHelper(100);
        try {
            while (true){
                int input = helper.addNumber("Enter a number: ", MainHelper.Operation.SUBTRACT);

                int total = helper.getTotal() ;
                String message = String.format(
                        "Entered: %d, total =%d", input, total
                );
                System.out.println(message);
            }
        } catch (NumberFormatException e) {
            System.out.println("All done");;
        }
        int ole=3;
        int ole1 = 5;

        System.out.println(String.format("you say me: %d, and after that - %d", ole, ole1));

    }
}
