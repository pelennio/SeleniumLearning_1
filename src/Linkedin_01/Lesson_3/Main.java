package Linkedin_01.Lesson_3;

public class Main {

    public static void main(String[] args) {
	// write your code here
//ClothingItem item = new ClothingItem("Poter", "L", 19.99 );
//        displayProduct(item);

        Shirt shirt = new Shirt("M", 12.44);
        displayProduct(shirt);
        shirt.setPattern("Plaid");
        System.out.println("This is "+ shirt.getPattern());

        ClothingItem reallyShirt = new Shirt("L", 45.55);
        displayProduct(reallyShirt);

        Shirt shirt2= (Shirt) reallyShirt;
shirt2.setPattern("Solid");
        System.out.println("Pattern "+ shirt2);

    }

    private static void displayProduct(Product product) {
        String output = product.getClass().getSimpleName() + "{" +
                "type='" + product.getType() + '\'' +
                ", size='" + product.getSize() + '\'' +
                ", price=" + product.getPrice() +
                '}';
        System.out.println(output);
    }
    }

