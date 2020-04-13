package Question_2;
import java.util.Scanner;

import Question_1.BadshahsMotto2;

public class BadshahsRentalPrice {
	//_______________________________________________________________-
	//compute mthod is used to calculate hours minutes and price
	
	public static void compute(int y) {
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
	
	Scanner as = new Scanner(System.in);
	
	System.out.print("Enter Time In Minutes : ");
	
	int y = as.nextInt();
	
	//called to print motto
	BadshahsMotto2.main(null);
	
	BadshahsRentalPrice.compute(y);
}
}

