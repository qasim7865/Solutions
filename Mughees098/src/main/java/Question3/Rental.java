
package Question3;

import java.util.Scanner;

public class Rental {
Scanner input = new Scanner(System.in);
    
public final static int MINUTES_IN_AN_HOUR = 60;
public final static int RENT_PER_HOUR = 40;

private String contract_number;
private int hoursRented;
private int additionalMinutes;
private int total_price;



public int minutesRented;
final static int RENT_PER_ADDITIONAL_MINUTE = 1;
static int equipment;



public void setContractNumber(String contract_number){

this.contract_number=contract_number;
    
}

public void setHoursAndMinutes(int minutesRented){
    
this.minutesRented=minutesRented;
         
}

public String getContractNumber(){
    
    return contract_number;
}

public int getHoursAndMinutes(){
    
    return minutesRented;  
}

public int getadditionalMinutes(){
    return additionalMinutes;
}


public void display(){
    
    hoursRented = minutesRented / MINUTES_IN_AN_HOUR;
    additionalMinutes = minutesRented % MINUTES_IN_AN_HOUR;
    
    System.out.print("Enter equipment quantity:");
    equipment = input.nextInt();
    total_price = hoursRented * RENT_PER_HOUR + additionalMinutes * RENT_PER_ADDITIONAL_MINUTE * equipment;
    
   

    System.out.println("No. of hours rented: " + hoursRented + " hour");
    System.out.println("No. of additional minuted rented: " + additionalMinutes + " minutes");
    System.out.println("Total rent: $" + total_price);
        
 
}
}