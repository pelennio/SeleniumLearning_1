package w3resource;

import java.util.Scanner;

/**
 * Created by len4ik on 3/19/18.
 */
public class MethodOverloadingDiffDataTypes {

    public void methodOne(int a){
        System.out.println(a+" methodOne(int a)");
    }

    public void methodOne(String a)
    {
        System.out.println(a+" methodOne(String a)");
    }
    public void methodOne(int a, String b){
        System.out.println(b+" methodOne(int a, String b)");
    }

    public void methodOne(String a, int b)
    {
        System.out.println(a+" methodOne(String a, int b)");
    }
    public void methodOne(int a, int b)
    {
        System.out.println(a+" "+b+" Multiple Argument Method");
    }


    public static void main(String[] args) {

        MethodOverloadingDiffDataTypes obj = new MethodOverloadingDiffDataTypes();

        obj.methodOne(10);
        obj.methodOne("I am a String");
        obj.methodOne(6,"Olena");
        obj.methodOne("Matviy", 8);
        obj.methodOne(22, 8);

    }
}
