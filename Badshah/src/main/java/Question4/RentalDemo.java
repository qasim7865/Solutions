/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question4;



/**
 *
 * @author princ
 */
public class RentalDemo {
    public static void main(String[] args) {
        Rental objDefault = new Rental();
        Rental objData = new Rental (BadshahsRentalPriceWithMethods.getContractNumber(),BadshahsRentalPriceWithMethods.getInput());
        BadshahsRentalPriceWithMethods.calculateRentAndDisplayData(objDefault);
        BadshahsRentalPriceWithMethods.calculateRentAndDisplayData(objData);
        
    }
}
