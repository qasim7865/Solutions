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
public class Rental {
    public final static int MINUTES_IN_HOUR = 60;
    public final static int HOURLY_RENT = 40;
    
    
    private String contractNumber;
    private int hoursForRental;
    private int additionalMinutesForRental;
    private int price;
    
    private String contactPhoneNumber;
    
    private int equipmentType;
    private final String[] equipmentName={"personal WaterCraft","pontoon Boat", "Row Boat", "Canoe", "Kayak","Beach Chair", "Umbrella", "Others"};

    public Rental(String contractNumber, int minutes) {
        setContractNumber(contractNumber);
        setHoursAndMinutes(minutes);
    }

    public Rental() {
        this("A000",0);        
    } 

    public void setContractNumber(String contractNumber) {
        if (contractNumber.length()==4){
            if (Character.isLetter(contractNumber.charAt(0)) && Character.isDigit(contractNumber.charAt(1)) && Character.isDigit(contractNumber.charAt(2)) && Character.isDigit(contractNumber.charAt(3))){
                String newContractNumber = contractNumber.replace(contractNumber.charAt(0), Character.toUpperCase(contractNumber.charAt(0)));
                this.contractNumber = newContractNumber;
            }
        }else{
            this.contractNumber = "A000";
        }        
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
    
    public String getPhoneNumber() {
        return contactPhoneNumber.replaceFirst("(\\d{3})(\\d{3})(\\d+)", "($1) $2-$3");
    }

    public void setPhoneNumber(String phoneNumber) {
        StringBuilder phone = new StringBuilder(15);
        for (int i=0; i<phoneNumber.length(); i++){
            if (Character.isDigit(phoneNumber.charAt(i))){
                 phone.append(phoneNumber.charAt(i));
            }
        }
        if (phone.length()!=10){
            phone=null;
            phone = new StringBuilder(10);
            phone.append("0000000000");
        }
        this.contactPhoneNumber = phone.toString();
    }

    public String getEquipmentType() {        
        return equipmentName[equipmentType];
    }

    public void setEquipmentType(int equipmentType) {
        if (equipmentType>equipmentName.length){
            this.equipmentType = 7;
        }else{
        this.equipmentType = equipmentType;
        }
    }   
    
}
