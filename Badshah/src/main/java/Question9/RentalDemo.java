/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question9;

import java.util.Arrays;
import java.util.Scanner;



/**
 *
 * @author princ
 */
public class RentalDemo {
    public static void main(String[] args) {
       boolean exit = false;
       while (!exit){
       System.out.println("Choose an option to sort the object arrays in ascending order, enter 1 for sort by equipment type, enter 2 for sort by contract number, and enter 3 for sort by price. Enter 0 to exit.");
       Scanner keyboard = new Scanner(System.in);
       int option = keyboard.nextInt();
       if (option ==0){
           exit = true;
           System.out.println("Exit successfully");
       }else{
       Rental[] objects = {new Rental("A001",50,"3218801210"), new Rental("A008",130,"3218801218"), new Rental("A004",90,"3218801214"), new Rental("A006",110,"3218801216"), new Rental("A002",70,"3218801212"), new Rental("A005",100,"3218801215"), new Rental("A003",80,"3218801213")};
       Rental tempObj = null;
       for (int i=0; i<objects.length; i++){
           for (int j=0; j<objects.length; j++){
               if (option == 1){
                   if (objects[j].getEquipmentType().compareTo(objects[i].getEquipmentType())>0){
                       tempObj = objects[i];
                       objects[i]= objects[j];
                       objects[j]=tempObj;
                   }
               }
               if (option == 2){
                  if (objects[j].getContractNumber().compareTo(objects[i].getContractNumber())>0){
                       tempObj = objects[i];
                       objects[i]= objects[j];
                       objects[j]=tempObj;
                   }
               }
               if (option == 3){
                   if (objects[i].getPrice() > objects[j].getPrice()){
                       tempObj = objects[i];
                       objects[i]= objects[j];
                       objects[j]=tempObj;
                   }
               }
           }
       }
       for (int i=0; i<objects.length; i++){           
           BadshahsRentalPriceWithMethods.calculateRentAndDisplayData(objects[i]);
       }
       }
        }
    }
}
