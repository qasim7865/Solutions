/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question8;

/**
 *
 * @author Laptop
 */
public class RentalDemo {
    public static void main(String[] args){
        Rental a=new Rental("E567",76);
        a.setTypeOfEquipment(2);
        Rental b=new Rental("A123",60);
        b.setTypeOfEquipment(10);
        Rental[] array=new Rental[2];
        array[0]=a;
        array[1]=b;
        for(int i=0;i<=array.length;i++){
            BadshahsRentalPrice.getDetail(array[i].getMinutes(), array[i].getContractNumber());
            System.out.println("Type of equipment: "+array[i].getTypeOfEquipment());
        }
        
       
    }
    
}
