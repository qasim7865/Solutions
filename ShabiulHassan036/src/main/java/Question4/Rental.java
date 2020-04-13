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

    public final class Rental {
    public final int hour=60;
    public final int hourRate=40;
    private String contractNumber ;
    private int hours;
    private int minutes;
    private int price;
    public Rental(String ContractNumber,int minutes){
        setContractNumber(ContractNumber);
        setHoursAndMinutes(minutes);
        
    }
    public Rental(){
        this("A000",0);
    }
    public void setContractNumber(String contractNumber){
        this.contractNumber=contractNumber;
    }
    public void setHoursAndMinutes(int mins){
        this.hours=mins/60;
        this.minutes=mins;
        this.price=(hours*40)+mins%60;
    }

    public String getContractNumber() {
        return contractNumber;
    }

    public int getHours() {
        return hours;
    }

    public int getMinutes() {
        return minutes;
    }

    public int getPrice() {
        return price;
    }
    
}
