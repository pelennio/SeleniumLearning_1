package w3resource;

import java.nio.charset.Charset;

public class Exercise39 {
    
 public static void main(String[] args) {
     int amount = 0;
		for(int i = 1; i <= 4; i++){
			for(int j = 1; j <= 4; j++){
				for(int k = 1; k <= 4; k++){
					if(k != i && k != j && i != j){
						amount++;
						System.out.println(i + "" + j + "" + k);
					}
				}
			}
		}
		System.out.println("Total number of the three-digit-number is " + amount);


	 System.out.println("List of available character sets: ");
	 for (String str : Charset.availableCharsets().keySet()) {
		 System.out.println(str);

		}
}}