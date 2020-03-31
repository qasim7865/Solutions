package Question3;

import java.util.Scanner;

public class KhizarsEventPriceWithMethods {
    public static void main(String[] args) {
        System.out.println("Number of guests>>"+numOfGuests());
        displayCompanyMotto();
        computePrice(numOfGuests());
    }
    public static int numOfGuests(){
        int guests;
        Scanner keyboard=new Scanner(System.in);
        System.out.println("Enter number of guests>>");
        guests=keyboard.nextInt();
        return guests;
    }
    public static void displayCompanyMotto(){
        System.out.println("********Khizar's makes the food that makes it a party.*********");
    }
    public static void computePrice(int x){
        int totalPrice;
        totalPrice=x*35;
        System.out.println("Total price>>"+totalPrice);
        if(x>=50){
            System.out.println("Event is large");
        }
        else{
            System.out.println("Event is not large");
        }
    }
}
