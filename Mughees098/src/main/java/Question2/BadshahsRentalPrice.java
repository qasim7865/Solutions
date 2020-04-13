
package Question2;

import java.util.Scanner;

public class BadshahsRentalPrice {
Scanner obj=new Scanner(System.in);
public void ptcal(){    
    
final int RENT_PER_HOUR = 40;
final int RENT_PER_ADDITIONAL_MINUTE = 1;
final int MINUTES_IN_AN_HOUR = 60;
int minutesRented;
int hoursRented;
int additionalMinutes;
int equipment;
int total_price;
Scanner input = new Scanner(System.in);

System.out.println("SsSsSsSsSsSsSsSsSsSsSsSsSsSsSsSsSsSsSsSsSs");
System.out.println("Ss                                      Ss");
System.out.println("Ss   Sammy's makes it fun in the sun.   Ss");
System.out.println("Ss                                      Ss");
System.out.println("SsSsSsSsSsSsSsSsSsSsSsSsSsSsSsSsSsSsSsSsSs");
    

System.out.print("Enter equipment quantity:");
equipment = input.nextInt();

System.out.print("Enter the number of minutes you want to rent for:");
minutesRented = input.nextInt();

hoursRented = minutesRented / MINUTES_IN_AN_HOUR;

additionalMinutes = minutesRented % MINUTES_IN_AN_HOUR;

total_price = hoursRented * RENT_PER_HOUR + additionalMinutes * RENT_PER_ADDITIONAL_MINUTE * equipment;

System.out.println("No. of hours rented: " + hoursRented + " hour");
System.out.println("No. of additional minuted rented: " + 
additionalMinutes + " minutes");
System.out.println("Total rent: $" + total_price);


 

}
}

