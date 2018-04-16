package Linkedin_01;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Locale;

/**
 * Created by len4ik on 3/21/18.
 */
public class Main_NumberFormat {
    public static void main(String[] args) {
//        Loop_03 a = new Loop_03();
//        a.main(new String[]"fgbfg", "fgb fg");


double doubleValue = 1_123_456.78;
        NumberFormat numberFormat=NumberFormat.getIntegerInstance();
        System.out.println(numberFormat.format(doubleValue));
        Locale locale=new Locale("ua", "UK");
        NumberFormat locaFormat = NumberFormat.getNumberInstance(locale);
        System.out.println(locaFormat.format(doubleValue));


        DecimalFormat df = new DecimalFormat("$00.00");
        System.out.println(df.format(1));
    }

}
