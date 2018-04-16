package w3resource;

/**
 * Created by len4ik on 2/25/18.
 */
public class Ex8 {
    public static void main(String[] args) {


        String coupon = "OUTLET";
        String coupon1 = "OUTLET";
        String coupon2 = "OUTLET";


        for (int i = 1; i <= 10; i++) {

            for (int r = 0; r < 10; r++) {
                coupon = coupon + (char) (r + '0');
                System.out.println(coupon);
                coupon = coupon1;
            }
            System.out.println("i="+i+"_________________");
            coupon1 = coupon2 + (char) (i + '0');
            coupon=coupon1;

        }

    }}