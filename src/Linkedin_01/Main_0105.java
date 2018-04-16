package Linkedin_01;

public class Main_0105 {

    public  int len (String wel) {


            char[] chars = wel.toCharArray();
            int x=chars.length;
//
//            for (int i=0; i<=chars.length; i++){
//            System.out.println("Char number "+i+" is "+chars[i]);
//            }
return (x);





    }

    public static void main(String[] args)
    {
        Main_0105 ort = new Main_0105();
        System.out.println(ort.len("Olena"));
        System.out.println(ort.len("Max"));
        System.out.println(ort.len("Leonora-ker"));


    }
}
