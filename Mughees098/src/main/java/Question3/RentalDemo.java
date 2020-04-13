
package Question3;

import java.util.Scanner;

public class RentalDemo {
    
       
final static int RENT_PER_HOUR = 40;
final static int RENT_PER_ADDITIONAL_MINUTE = 1;
final static int MINUTES_IN_AN_HOUR = 60;
static int minutesRented;
static int hoursRented;
static int additionalMinutes;
static int equipment;
static int total_price;
static String contractNumber;

Scanner input = new Scanner(System.in);
    
    public void rentalTime(){
        
    System.out.print("Enter the number of minutes you want to rent for:");
    minutesRented = input.nextInt();
    hoursRented = minutesRented / MINUTES_IN_AN_HOUR;
    additionalMinutes = minutesRented % MINUTES_IN_AN_HOUR;
        
    }
    
    public void RentalDemocompanysMotto(){
    
    System.out.println("SsSsSsSsSsSsSsSsSsSsSsSsSsSsSsSsSsSsSsSsSs");
    System.out.println("Ss                                      Ss");
    System.out.println("Ss   Sammy's makes it fun in the sun.   Ss");
    System.out.println("Ss                                      Ss");
    System.out.println("SsSsSsSsSsSsSsSsSsSsSsSsSsSsSsSsSsSsSsSsSs");

    }
    
    public void contractNumber(){
        
        System.out.print("Enter the Contract Number:");
        contractNumber = input.nextLine();
    }
    
    
    public void computeDetails(){
        
    System.out.print("Enter equipment quantity:");
    equipment = input.nextInt();
    
    total_price = hoursRented * RENT_PER_HOUR + additionalMinutes * RENT_PER_ADDITIONAL_MINUTE * equipment;

    System.out.println("No. of hours rented: " + hoursRented + " hour");
    System.out.println("No. of additional minuted rented: " + 
    additionalMinutes + " minutes");
    System.out.println("Total rent: $" + total_price);
        
    }
    
    
    
    
}
