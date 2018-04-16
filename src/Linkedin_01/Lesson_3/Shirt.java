package Linkedin_01.Lesson_3;

/**
 * Created by len4ik on 4/5/18.
 */
public class Shirt extends ClothingItem{
    public String getPattern() {
        return pattern;
    }

    public void setPattern(String pattern) {
        this.pattern = pattern;
    }

    public String pattern="Not set";


    public Shirt(String size, double price) {super("Shirt", size, price);
    }
}
