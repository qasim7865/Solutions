/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question5;



/**
 *
 * @author princ
 */
public class RentalDemo {
    public static void main(String[] args) {
        Rental obj1 = new Rental(BadshahsRentalPriceWithMethods.getContractNumber(),BadshahsRentalPriceWithMethods.getInput());
        Rental obj2 = new Rental (BadshahsRentalPriceWithMethods.getContractNumber(),BadshahsRentalPriceWithMethods.getInput());
        Rental obj3 = new Rental (BadshahsRentalPriceWithMethods.getContractNumber(),BadshahsRentalPriceWithMethods.getInput());
        BadshahsRentalPriceWithMethods.calculateRentAndDisplayData(obj1);
        BadshahsRentalPriceWithMethods.calculateRentAndDisplayData(obj2);
        BadshahsRentalPriceWithMethods.calculateRentAndDisplayData(obj3);
        
    }
}
