package Linkedin_01;

import com.gargoylesoftware.htmlunit.html.HtmlNextId;

import java.util.Scanner;

/**
 * Created by len4ik on 3/23/18.
 */
public class Main_if {


    private static String[] months =
                {"January", "February", "March",
                        "April", "May", "June",
                        "July", "August", "September",
                        "October", "November", "December"};

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true){
            System.out.println("Enter month: ");
            String monthName=scanner.nextLine();
            if (monthName.length()==0){
                break;
            }
            int monthNumber = getMonthNumber(monthName);
            if (monthNumber==-1) {
                System.out.println("Month not found");
            }else{
                System.out.println(String.format("%s is month number %d", monthName, monthNumber+1));
            }
        }
//        loopManth();
//        loopManth();
      /*  for (String month : months) {
            System.out.println(month);
        }*/
 /*     int counter=0;
        while (counter<months.length) {
            System.out.println(months[counter]);
            counter++;
        }*/
 /*int counter=0;
        do {
            System.out.println(months[counter]);
            counter++;
            if (counter==5) break;
        } while (counter<=months.length);
*/
    }
    private static void loopManth() {
        for (int i=0;i< months.length; i++) {
            System.out.println(months[i]);
        }
    }

private static int getMonthNumber(String monthName) {
    for (int i = 0; i < months.length; i++) {
        if (monthName.equalsIgnoreCase(months[i])) {
            return i;
        }
    }
    return -1;
}
    }

