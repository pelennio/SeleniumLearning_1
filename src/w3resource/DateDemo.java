package w3resource;

import java.util.*;

public class DateDemo {
   public static void main(String[] args) {

      Date date2 = new Date(99, 1, 9);
      Date date = new Date(92, 1, 10);

      System.out.println("getTime= "+date.getTime());
      System.out.println("date= "+date.toString());
//      int comparison3 = date.compareTo(date);
//      System.out.println("Original Date:" + date.toString());
//      System.out.println(date.getTime());
//      boolean before = date2.before(date);
   }
}