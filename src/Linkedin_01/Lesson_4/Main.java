package Linkedin_01.Lesson_4;

import Linkedin_01.Lesson_3.ClothingItem;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by len4ik on 4/6/18.
 */
public class Main {
    public static void main(String[] args) {

        List<String> states = new ArrayList<String>();
        states.add("California");
        states.add("Texas");
        states.add("Oregon");
        states.add("Washington");
        states.add("Teennessee");

        System.out.println("+++++++++++++++++++++++++++++++++++++++");
        for (String state :
                states) {
            System.out.println((states.indexOf(state)+1)+" - "+ state);
        }
/**
 * hello
 * <b>I'm clever</b>
 */
        String  someState=states.get(1);
        System.out.println("+++++++++++++++++++++++++++++++++++++++");
        System.out.println("The second state is: "+someState);
        int pos = states.indexOf("Oregon");
        System.out.println("+++++++++++++++++++++++++++++++++++++++");

//        states.clear();

        states.set(pos, "Bererefo");

        System.out.println("+++++++++++++++++++++++++++++++++++++++");
        for (String state :
                states) {
            System.out.println((states.indexOf(state)+1)+" - "+ state);

        }
        System.out.println(states.size());

        states.addAll(states);
        System.out.println("+++++++++++++++++++++++++++++++++++++++");
        for (String state :
                states) {
            System.out.println((states.lastIndexOf(state)+1)+" - "+ state);
        }
        System.out.println(states.size());


    }
}
