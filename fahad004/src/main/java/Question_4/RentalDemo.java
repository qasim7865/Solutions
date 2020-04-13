package Question_4;

import java.util.Scanner;

import Question_3.BadshahsRentalPriceWithMethods;

public class RentalDemo {

	//_______________________________________________________________________
	//Method to get the Number of Total minutes 
	public int getMinutes() {

		Scanner s = new Scanner(System.in);
		System.out.print("Enter The Total Minutes : ");
		int yh = s.nextInt();
		return yh;
	}

	//_______________________________________________________________________
	//Method to get the  Contract Number
	public String getContractNumber() {
		Scanner s = new Scanner(System.in);
		System.out.print("Enter The Contract Number : ");
		String yh = s.nextLine();
		return yh;
	}

	//_______________________________________________________________________
	//Revised Method to get the   Details
	public void compute(Rental a) {

		//to display the motto
		BadshahsRentalPriceWithMethods wq= new BadshahsRentalPriceWithMethods();
		wq.RentalDemo();

		//to display details
		System.out.println("Contract Number  : "+a.getContractNumber());
		System.out.println("Hours : "+a.getNumberofHours());
		System.out.println("Minutes over hours  : "+a.getNumberofMinutesoverhour());
		System.out.println("Price  : "+a.getPrice());

	}


	//______________________________________________________________________
	//Main Method
	public static void main(String[] args) {


		//______________________________________________________________________
		//Object declaration to GET the values from user
		RentalDemo	as	= new RentalDemo();
		int w = as.getMinutes();
		String h = as.getContractNumber();

		//______________________________________________________________________
		//Rental object declaration with parameeters to SET the values in the Rental Class entered by user
		Rental a = new Rental(h,w);

		//______________________________________________________________________
		//Rental object declaration without parameters to SET the values
		Rental b = new Rental();


		//______________________________________________________________________
		//Method Call to display the Details
		
		System.out.println("\nObject with Parameters");
		as.compute(a);
		
		
		System.out.println("\n\nObject without Parameters");		
		as.compute(b);


	}

}







