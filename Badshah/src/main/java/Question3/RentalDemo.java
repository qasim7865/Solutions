/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question3;

/**
 *
 * @author princ
 */
public class RentalDemo {
    public static void main(String[] args) {
       Rental obj = new Rental();
       obj.setHoursAndMinutes(BadshahsRentalPriceWithMethods.getInput());
       obj.setContractNumber(BadshahsRentalPriceWithMethods.getContractNumber());
       BadshahsRentalPriceWithMethods.calculateRentAndDisplayData(obj);
    }
    
}
