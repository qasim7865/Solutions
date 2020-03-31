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
public class Rental {
    public final static int MINUTES_IN_HOUR = 60;
    public final static int HOURLY_RENT = 40;
    
    
    private String contractNumber;
    private int hoursForRental;
    private int additionalMinutesForRental;
    private int price;

    public void setContractNumber(String contractNumber) {
        this.contractNumber = contractNumber;
    }
    
    public void setHoursAndMinutes(int minutes){
        this.hoursForRental = minutes / 60;
        this.additionalMinutesForRental = minutes % 60;
        this.price = (hoursForRental * HOURLY_RENT) + additionalMinutesForRental;
    }

    public String getContractNumber() {
        return contractNumber;
    }

    public int getHoursForRental() {
        return hoursForRental;
    }

    public int getAdditionalMinutesForRental() {
        return additionalMinutesForRental;
    }

    public int getPrice() {
        return price;
    }
    
}
