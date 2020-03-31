package Question2;

import java.util.Scanner;

public class KhizarsEventPrice {
    public static void main(String[] args) {
        int guests,price=35;
        double totalPrice;
        Scanner keyboard=new Scanner(System.in);
        System.out.println("Enter number of guests>>");
        guests=keyboard.nextInt();
        totalPrice=guests*35;
        System.out.println("********Khizar's makes the food that makes it a party.*********");
        System.out.println("Number of guests>>"+guests);
        System.out.println("Price per guest is "+price+"$");
        System.out.println("Total price>>"+totalPrice);
        displayMessage(guests);
    }
    public static void displayMessage(int x){
        if(x>=50){
            System.out.println("True");
        }
        else{
            System.out.println("False");
        }
    }
}
