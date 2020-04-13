/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question2;

import java.util.Scanner;

/**
 *
 * @author Shahzaib
 */
public class KhizarsEventPrice {
      public static void main(String[] args) {
        System.out.println("*************************************************");
        System.out.println("* Khizar’s makes the food that makes it a party.*");
        System.out.println("*************************************************");
                Scanner input=new Scanner(System.in);
        System.out.print("Enter number of peoples in Event ");
        
        int TotalPeople = input.nextInt();
        int Price = 35;
        System.out.println("Prize per person "+Price);
        int NetPrice=(Price*TotalPeople);
        System.out.println("Total price " +"$"+NetPrice);
        
        if (TotalPeople>50){
            boolean y=true;
            System.out.println("Event is large");
            
        }
        else 
        {boolean y=false;
            System.out.println("Event is small");}
    }
}
