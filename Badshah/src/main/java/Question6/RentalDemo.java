/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question6;



/**
 *
 * @author princ
 */
public class RentalDemo {
    public static void main(String[] args) {
        boolean run=true;
        while(run){
            int minutes = BadshahsRentalPriceWithMethods.getInput();
            if(minutes <60 || minutes >7200){
                run = false;
            }
            Rental obj1 = new Rental();
            obj1.setHoursAndMinutes(minutes);
            if (obj1.getAdditionalMinutesForRental()==0){
                for (int i=0; i<obj1.getHoursForRental(); i++){
                    System.out.println("Coupon good for 10 percent off next rental");
                }
            }
            BadshahsRentalPriceWithMethods.calculateRentAndDisplayData(obj1);
        }
    }
    
}
