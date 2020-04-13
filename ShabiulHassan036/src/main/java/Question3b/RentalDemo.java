/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question3b;

/**
 *
 * @author Laptop
 */
public class RentalDemo {
    public static void main(String[] args){
        Rental a=new Rental();
        a.setContractNumber("A123");
        a.setHoursAndMinutes(70);
        BadshahsRentalPrice b=new BadshahsRentalPrice();
        b.getDetail(a.getMinutes(), a.getContractNumber());
    }
    
}
