/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question10;

/**
 *
 * @author princ
 */
public class LessonWithRental extends Rental {
    private boolean lessonRequired;
    private final String[] instructorName = {"Qasim", "Ali", "Zia", "Yahya", "Khan", "Rida", "Salma", "Saima"};
    private int instructorId;
    public LessonWithRental(String contractNumber, int minutes, int equipmentType) {
        super(contractNumber, minutes);
        setEquipmentType(equipmentType);
        this.instructorId=equipmentType;
        if (equipmentType ==0 || equipmentType ==1){
            lessonRequired=true;
        }else{
            lessonRequired=false;
        }
    }

    public String getInstructorName() {
        String data = "The equipment type " + getEquipmentType() + "required the lesson " + lessonRequired + " by the instructor " + instructorName[instructorId];
        return data;
    }
    
    
    
}
