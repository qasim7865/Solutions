/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question4;

/**
 *
 * @author Laptop
 */
public class RentalDemo {
    public static void main(String[] args){
        Rental a=new Rental("B123",80);
        Rental b=new Rental();
        BadshahsRentalPrice.getDetail(a.getMinutes(), a.getContractNumber());
        BadshahsRentalPrice.getDetail(b.getMinutes(), b.getContractNumber());
        
    }
    
}
