/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question8;



/**
 *
 * @author princ
 */
public class RentalDemo {
    public static void main(String[] args) {
       Rental[] objects = {new Rental(), new Rental(), new Rental()};
       for (int i=0; i<objects.length; i++){
           String contractNumber = BadshahsRentalPriceWithMethods.getContractNumber();
           String phoneNumber = BadshahsRentalPriceWithMethods.getPhoneNumber();
           int minutes = BadshahsRentalPriceWithMethods.getInput();
           objects[i].setContractNumber(contractNumber);
           objects[i].setHoursAndMinutes(minutes);
           objects[i].setPhoneNumber(phoneNumber);
       }
       for (int i=0; i<objects.length; i++){           
           BadshahsRentalPriceWithMethods.calculateRentAndDisplayData(objects[i]);
       }
       
    }
    
}
