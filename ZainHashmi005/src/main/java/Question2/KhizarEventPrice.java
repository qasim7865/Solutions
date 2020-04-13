package Question2;
import java.util.*;
public class KhizarEventPrice {
	public static void main(String[] args) {
		int guest;
		Scanner input=new Scanner(System.in);
		System.out.println("Enter no of guest:");
		guest=input.nextInt();
		System.out.println("************************************************\n"
				+ "*Khizar’s makes the food that makes it a party.*\n"
				+ "************************************************");
		System.out.println("Number of Guest:  "+guest);
		System.out.println("price per guest:  &35");
		System.out.println("Total price:      &"+35*guest);
		boolean result=(guest>=50)?true:false;
		System.out.println("Large Event       "+result);
		input.close();
	}
}
