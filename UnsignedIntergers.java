import java.util.Arrays;
import java.util.Scanner;

public class UnsignedIntergers {
	
	public static void valueToBase(Integer value, Integer base) 
    { 
		if (base > 36 | base < 2 ) {
            throw new NumberFormatException("Bases specified must be less than 36 and greater than 2.");
        }
	
		if(base > 2 && base < 36) {
			switch(base.toString()) {
			case "2": 
				System.out.println("The value of "+value+" in base 2 is  "+Integer.toBinaryString(value).toUpperCase());
				break;
			case "6": 
				System.out.println("The value of "+value+" in base 6 is  "+Integer.toHexString(value).toUpperCase());
				break;
			case "8": 
				System.out.println("The value of "+value+" in base 8 is  "+Integer.toOctalString(value).toUpperCase());
				break;
			default: 
				System.out.println("The value of "+value+" in base "+base +" is" +Integer.toString(value, base).toUpperCase());
			}
		}
		else {
			System.out.println("Invalid base value ");
		}
		
    }
	
	
	public static void main(String [] args) {
		Scanner reader = new Scanner(System.in);
        System.out.print("Enter a value: ");
        // nextInt() reads the next integer from the keyboard
        int value = reader.nextInt();
        System.out.print("Enter a base value : ");
        // nextInt() reads the next integer from the keyboard
        int base = reader.nextInt();
        
        valueToBase(value,base);
	}

}
