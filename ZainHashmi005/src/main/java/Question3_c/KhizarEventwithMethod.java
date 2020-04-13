package Question3_c;

import java.util.Scanner;

public class KhizarEventwithMethod {
	static Scanner input=new Scanner(System.in);
	public static int guest()
	{
		int guest;
		System.out.println("Enter no of guest:");
		guest=input.nextInt();
		input.close();
		return guest;
	}
	public static String getEventnumber() {
		System.out.println("Enter Event No:");
		return input.next() ;
	}
	public static void moto()
	{
		System.out.println("************************************************\n"
				+ "*Khizar’s makes the food that makes it a party.*\n"
				+ "************************************************");
	}
	public static void price(Event obj)
	{
		System.out.println("Number of Guest:  "+obj.NoofGuest);
		System.out.println("price per guest:  "+Event.PRICEPERGUEST);
		System.out.println("Total price:      $"+obj.price);
		boolean result=(obj.NoofGuest>=Event.LARGEEVENT)?true:false;
		System.out.println("Large Event       "+result);
	}
	
}
