package w3resource;

import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Array1 {
    public static void main(String[] args) {

          /*  String s = "Hello World! 3 + 3.0 = 6";

            // create a new scanner with the specified String Object
            Scanner scanner = new Scanner(s);

            // check if the scanner's next token matches "World"
                System.out.println(""+scanner.hasNext("World!"));

            // check if the scanner's next token matches "Hello"
                System.out.println(""+scanner.hasNext("Hello"));

            // print the rest of the string
                System.out.println(""+scanner.nextLine());

            // close the scanner
                scanner.close();
        }
    }*/


        // create an empty array list1 with an initial capacity
        ArrayList<Integer> arrlist = new ArrayList<Integer>(5);

        // use add() method to add elements in the list
        arrlist.add(1111);
        arrlist.add(2222);
        arrlist.add(33333);

        // let us print all the elements available in list1
        System.out.println("Printing list1:");
        for (Integer solo : arrlist) {
            System.out.println("Number = " + solo);
        }
        for (Object arrlistItem : arrlist) {
            System.out.println("Number = "+arrlist.indexOf(arrlistItem)+" is " + arrlistItem);
        }
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++");
    }}
/*        // create an empty array list2 with an initial capacity
        ArrayList<Integer> arrlist2 = new ArrayList<Integer>(5);

        // use add() method to add elements in list2
        arrlist2.add(25);
        arrlist2.add(30);
        arrlist2.add(31);
        arrlist2.add(35);

        // let us print all the elements available in list2
        System.out.println("Printing list2:");
        for (Integer number : arrlist2) {
            System.out.println("Number = " + number);
        }
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++");*/
/*
        // inserting all elements, list2 will get printed after list1
        arrlist.addAll(1,arrlist2);
        System.out.println("Printing all the elements");
        // let us print all the elements available in list1
        for (Integer number : arrlist) {
            System.out.println("Number = " + number);
        }
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++");*/
/*
        int retval = arrlist.size();
        System.out.println("List consists of "+ retval +" elements");
        System.out.println("Performing clear operation !!");
        arrlist.clear();
        retval = arrlist.size();
        System.out.println("Now, list consists of "+ retval +" elements");
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++");*/
/*
        boolean retval1 = arrlist.isEmpty();
        if (retval1 == true) {
            System.out.println("list is empty");
        } else {
            System.out.println("list is not empty");
        // printing all the elements available in list
        for (Integer number : arrlist) {
            System.out.println("Number = " + number);}
        }
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++");*/

 /*       Scanner find = new Scanner(System.in);
        System.out.println("Enter your find ");
        int a=find.nextInt();

// let us print all the elements available in list
        for (Integer number : arrlist) {
            System.out.println("Number = " + number);
        }

        // list contains element 10
        boolean retval = arrlist.contains(a);

        if (retval == true) {
            System.out.println("element "+a+" is contained in the list");
        } else {
            System.out.println("element "+a+" is not contained in the list");
        }
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++");*//*
*/
     /*   // create an empty array list with an initial capacity
        ArrayList<String> arrlist = new ArrayList<String>(5);

        // use add() method to add values in the list
        arrlist.add("G");
        arrlist.add("E");
        arrlist.add("F");
        arrlist.add("M");
        arrlist.add("E");

        System.out.println("Size of list: " + arrlist.size());

        // let us print all the values available in list
        for (String value : arrlist) {
            System.out.println("Value = " + value);
        }

        // Retrieving the index of last occurrence of element "E"
        int retval = arrlist.lastIndexOf("E");
        System.out.println("The last occurrence of E is at index " + retval);



    }
*/