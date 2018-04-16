package Linkedin_01;

import Linkedin_01.utilities.InputHelper;

/**
 * Created by len4ik on 4/2/18.
 */
public class MAin_Scanner {
    public static void main(String[] args) {

        InputHelper helper = new InputHelper();
        String input = helper.getInput("Enter value#1: ");
        System.out.println("The value of your input::: " + input);
        input=helper.getInput("Enter value#2: ");
        System.out.println("The value of your input::: " + input);
    }


    }
