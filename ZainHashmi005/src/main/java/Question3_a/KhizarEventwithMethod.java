package Question3_a;

import java.util.Scanner;

public class KhizarEventwithMethod {
	public static int guest()
	{
		int guest;
		Scanner input=new Scanner(System.in);
		System.out.println("Enter no of guest:");
		guest=input.nextInt();
		input.close();
		return guest;
	}
	public static void moto()
	{
		System.out.println("************************************************\n"
				+ "*Khizar’s makes the food that makes it a party.*\n"
				+ "************************************************");
	}
	public static void price(int guest)
	{
		System.out.println("Number of Guest:  "+guest);
		System.out.println("price per guest:  &35");
		System.out.println("Total price:      &"+35*guest);
		boolean result=(guest>=50)?true:false;
		System.out.println("Large Event       "+result);
	}
	public static void main(String[] args) {
		int guest=guest();
		moto();
		price(guest);
	}
}
