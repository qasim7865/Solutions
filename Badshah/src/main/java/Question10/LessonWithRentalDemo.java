/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question10;

import java.util.Scanner;



/**
 *
 * @author princ
 */
public class LessonWithRentalDemo {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
       LessonWithRental[] lwrObj = {new LessonWithRental("A001", 70, 2), new LessonWithRental("A004", 100, 0), new LessonWithRental("A003", 80, 1), new LessonWithRental("A002", 90, 4)};
       for (int i=0; i<lwrObj.length; i++){
           System.out.println("Enter phone number");
           lwrObj[i].setPhoneNumber(keyboard.nextLine());
       }
       boolean exit = false;
       while (!exit){
       System.out.println("Choose an option to sort the object arrays in ascending order, enter 1 for sort by equipment type, enter 2 for sort by contract number, and enter 3 for sort by price. Enter 0 to exit.");
       int option = keyboard.nextInt();
       if (option ==0){
           exit = true;
           System.out.println("Exit successfully");
       }else{
       LessonWithRental tempObj = null;
       for (int i=0; i<lwrObj.length; i++){
           for (int j=0; j<lwrObj.length; j++){
               if (option == 1){
                   if (lwrObj[j].getEquipmentType().compareTo(lwrObj[i].getEquipmentType())>0){
                       tempObj = lwrObj[i];
                       lwrObj[i]= lwrObj[j];
                       lwrObj[j]=tempObj;
                   }
               }
               if (option == 2){
                  if (lwrObj[j].getContractNumber().compareTo(lwrObj[i].getContractNumber())>0){
                       tempObj = lwrObj[i];
                       lwrObj[i]= lwrObj[j];
                       lwrObj[j]=tempObj;
                   }
               }
               if (option == 3){
                   if (lwrObj[i].getPrice() > lwrObj[j].getPrice()){
                       tempObj = lwrObj[i];
                       lwrObj[i]= lwrObj[j];
                       lwrObj[j]=tempObj;
                   }
               }
           }
       }
       for (int i=0; i<lwrObj.length; i++){           
           BadshahsRentalPriceWithMethods.calculateRentAndDisplayData(lwrObj[i]);
       }
       }
        }
    }
}
