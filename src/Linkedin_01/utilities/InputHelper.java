package Linkedin_01.utilities;

import java.util.Scanner;

/**
 * Created by len4ik on 4/2/18.
 */
public class InputHelper {

    public static String getInput(String prompt) {
        System.out.print(prompt);
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();


    }
}
