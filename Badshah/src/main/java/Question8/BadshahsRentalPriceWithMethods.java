/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question8;

import Question1.BadshahsMotto2;
import java.util.Scanner;

/**
 *
 * @author princ
 */
public class BadshahsRentalPriceWithMethods {
    public static int getInput(){
        Scanner input = new Scanner(System.in);
        System.out.println("Please Enter the number of minutes equipment is rented.");
        int data = input.nextInt();
        return data;
    }
    
    public static String getContractNumber(){
        Scanner input = new Scanner(System.in);
        System.out.println("Please Enter the contract number.");
        String data = input.nextLine();
        return data;
    }
    
    public static String getPhoneNumber(){
        System.out.println("Enter the user phone number");
        Scanner keyboard = new Scanner(System.in);
        return keyboard.nextLine();
    }
    
    public static void displayCompanyMotto(){
        BadshahsMotto2 companyMottoWithBorder = new BadshahsMotto2();
        companyMottoWithBorder.displayMottoWithBorder();
    }
    
    public static void calculateRentAndDisplayData(Rental obj){
        int hours = obj.getHoursForRental();
        int additionalMinutes = obj.getAdditionalMinutesForRental();
        int price = obj.getPrice();
        System.out.println("The contract number is = " + obj.getContractNumber());
        System.out.println("The user phone number is = " + obj.getPhoneNumber());
        System.out.println("Total hours = " + hours);
        System.out.println("Total additional minutes = "+ additionalMinutes);
        System.out.println("The hourly rate is = " + Rental.HOURLY_RENT);
        System.out.println("Total price = " + price);
    }
    
    public static void calculateRentAndDisplayData(int minutes){
        int hours = minutes / 60;
        int additionalMinutes = minutes % 60;
        int price = (Rental.HOURLY_RENT * hours) + additionalMinutes;
        System.out.println("Total hours = " + hours);
        System.out.println("Total additional minutes = "+ additionalMinutes);
        System.out.println("The hourly rate is = " + Rental.HOURLY_RENT);
        System.out.println("Total price = " + price);
    }
    
    public static void main(String[] args) {
        int minutes = getInput();
        displayCompanyMotto();
        calculateRentAndDisplayData(minutes);
    }
}
