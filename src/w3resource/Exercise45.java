package w3resource;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.io.File;
import java.util.TimeZone;

public class Exercise45 {

 public static void main(String[] args) {
  System.out.println("/home/students/abc.txt  : " + new File("/Users/len4ik/Desktop/IMG_2219.png").length() + " bytes");
  System.out.println("/home/students/test.txt : " + new File("test.txt").length() + " bytes");


  SimpleDateFormat cdt = new SimpleDateFormat("yyyy/MM/dd HH:mm");
  SimpleDateFormat cdt1 = new SimpleDateFormat("yyyy/MM/dd HH:mm");
  cdt.setCalendar(Calendar.getInstance(TimeZone.getTimeZone("CST")));
  cdt1.setCalendar(Calendar.getInstance(TimeZone.getTimeZone("GMT")));

  System.out.println("\nNow in CST: "+cdt.format(System.currentTimeMillis()));

  System.out.println("\nNow in GMT: "+cdt1.format(System.currentTimeMillis()));



 }
}