package Linkedin_01.Lesson_5;

import java.text.DateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.GregorianCalendar;

import static javafx.scene.input.KeyCode.D;
import static javafx.scene.input.KeyCode.M;
import static javafx.scene.input.KeyCode.Y;

/**
 * Created by len4ik on 4/6/18.
 */

public class Main {
    public static void main(String[] args) {


    Date now = new Date();
        System.out.println("now="+now);

        GregorianCalendar gc = new GregorianCalendar(2009, 1, 28);
        Date date_1 = gc.getTime();
        System.out.println("date_1="+date_1);
        /**
         *
         *
         *
         */
        // TODO: 4/9/18  

        gc.add(GregorianCalendar.DATE,3);
        Date date = gc.getTime();
        System.out.println("date="+date);
        DateFormat df = DateFormat.getDateInstance(DateFormat.FULL);
        System.out.println("date in full format: "+df.format(date));
        System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
        LocalDateTime ldt = LocalDateTime.now();
        System.out.println("ldt="+ldt);
        LocalDate ld = LocalDate.of(2009,10, 4);
        System.out.println("ld "+ld);


        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("M-dd./ y");
        System.out.println(dtf.format(ld));


}


}
