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
public class Rental {
    public final static int MINUTES_IN_HOUR = 60;
    public final static int HOURLY_RENT = 40;
    
    
    private String contractNumber;
    private int hoursForRental;
    private int additionalMinutesForRental;
    private int price;

    public Rental(String contractNumber, int minutes) {
        setContractNumber(contractNumber);
        setHoursAndMinutes(minutes);
    }

    public Rental() {
        this("A000",0);        
    } 

    public void setContractNumber(String contractNumber) {
        this.contractNumber = contractNumber;
    }
    
    public void setHoursAndMinutes(int minutes){
        this.hoursForRental = minutes / 60;
        this.additionalMinutesForRental = minutes % 60;
        if (additionalMinutesForRental>=1 && additionalMinutesForRental<=40){
            this.price = (hoursForRental * HOURLY_RENT) + additionalMinutesForRental;
        } else if (additionalMinutesForRental>40 && additionalMinutesForRental<=59){
            this.price = (hoursForRental * HOURLY_RENT)+ HOURLY_RENT;
        }else{
            this.price = (hoursForRental * HOURLY_RENT);
        }
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
