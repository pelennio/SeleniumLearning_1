package Linkedin_01.utilities;

/**
 * Created by len4ik on 4/2/18.
 */
public class MainHelper {
   /* public static final int ADD = 1001;
    public static final int SUBTRACT=1002;
*/

    private int total;


    public MainHelper(int total) {
        this.total = total;
    }

    public int getTotal() {
        return total;
    }

    /*public void setTotal(int total) {
        this.total = total;
    }*/
    public int addNumber(String prompt, Operation operation) throws  NumberFormatException{
        String input = InputHelper.getInput(prompt);
        int value = Integer.parseInt(input);


        switch (operation){
            case ADD:
                total+=value;
                break;
            case SUBTRACT:
                total-=value;
                break;

        }


       // total +=value;
        return value;

    }
    public enum Operation {
        ADD, SUBTRACT;
    }
}
