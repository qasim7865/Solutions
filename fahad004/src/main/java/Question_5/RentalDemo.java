package Question_5;


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
	//Method Definition to accept the Rental Objects and display the details of objects which has  more Rental time 
	public Rental checkMoreTotalMinutes(Rental a,Rental b) {

		if(a.totalMinutes > b.totalMinutes) {

			System.out.println("Contract Number :"+a.getContractNumber());
			System.out.println("Hours :"+a.getNumberofHours());
			System.out.println("Minutes over hour :"+a.getNumberofMinutesoverhour());

			return a;
		}
		else {

			System.out.println("Contract Number :"+b.getContractNumber());
			System.out.println("Hours :"+b.getNumberofHours());
			System.out.println("Minutes over hour :"+b.getNumberofMinutesoverhour());

			return b;
		}
	}

	//______________________________________________________________________
	//Main Method
	public static void main(String[] args) {
		int totalMinutes;
		String contractNumber;

		//______________________________________________________________________
		//Object declaration to GET the values from user
		RentalDemo	as	= new RentalDemo();


		//______________________________________________________________________
		//First  Rental object declaration with parameeters to SET the values in the Rental Class entered by user
		totalMinutes = as.getMinutes();
		contractNumber = as.getContractNumber();	
		Rental firstObj = new Rental(contractNumber,totalMinutes);



		//______________________________________________________________________
		//Second  Rental object declaration with parameeters to SET the values in the Rental Class entered by user
		totalMinutes = as.getMinutes();
		contractNumber = as.getContractNumber();	
		Rental secondObj = new Rental(contractNumber,totalMinutes);



		//______________________________________________________________________
		//Third  Rental object declaration with parameeters to SET the values in the Rental Class entered by user
		totalMinutes = as.getMinutes();
		contractNumber = as.getContractNumber();	
		Rental thirdObj = new Rental(contractNumber,totalMinutes);



		//______________________________________________________________________
		//Method Call to display the Details of each object

		System.out.println("\nFirst Object");
		as.compute(firstObj);


		System.out.println("\n\nSecond Object");		
		as.compute(secondObj);


		System.out.println("\n\nThird Object");		
		as.compute(thirdObj);


		//______________________________________________________________________
		//Method Call to display to check which object has more rental time
		System.out.println("\n\nFirst Object and Second Objects Comparison");
		as.checkMoreTotalMinutes(firstObj, secondObj);

		System.out.println("\n\nSecond  Object and Third Object Comparison");
		as.checkMoreTotalMinutes(secondObj, thirdObj);

		System.out.println("\n\nFirst Object and Third Objects Comparison");
		as.checkMoreTotalMinutes(thirdObj, firstObj);

	}

}








