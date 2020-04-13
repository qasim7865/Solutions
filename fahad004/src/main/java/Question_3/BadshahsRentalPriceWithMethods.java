package Question_3;

import java.util.Scanner;

import Question_1.BadshahsMotto2;

public class BadshahsRentalPriceWithMethods {

	//_______________________________________________________________________
	//Method to get the Number of Total minutes 
	public int Getvalue() {

		Scanner s = new Scanner(System.in);
		System.out.print("Enter The Total Minutes : ");
		int yh = s.nextInt();
		return yh;
	}

	//_______________________________________________________________________
	//Method to get the  Motto 

	public	void RentalDemo() {
		System.out.println(	 "SSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSS"+"\nS                                   S"+"\nS Badshah's makes it Fun in the Sun S"+"\nS                                   S"+"\nSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSS");	}


	//_______________________________________________________________________--
	//Method to get the Number of hours, minutes, and price 
	public	void compute(int y) {

		int hours = y/60;
		int minutes = y%60;
		int yhj = hours*40;
		int ykj = minutes *1;
		int uy = yhj + ykj;
		if(y>=60) {
			System.out.println("\n\nHours   : "+hours+"\nMinutes : "+minutes+"\nPrice   : "+uy+"$");}
		else {
			System.out.println("\n\nHours   : "+hours+"\nMinutes : "+minutes+"\nPrice   : "+"40$");}



	}

	public static void main(String[] args) {
		BadshahsRentalPriceWithMethods	as	= new BadshahsRentalPriceWithMethods();

		//First Method Call
		int y = as.Getvalue();

		//Second Method Call
		as.RentalDemo();

		//Third Method Call
		as.compute(y);

	}

}



