/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package qusetion3;

/**
 *
 * @author Zain Waheed
 */
public class RentalDemo {
    public static void main(String[]args){
    Rental1 fd=new Rental1();
    Rental sp=new Rental();
    String rt=fd.input1();
    int yh=sp.input();
    fd.setContractNumber(rt);
    fd.setHoursAndMinutes(yh);
    sp.motto();
    sp.disp();
    
    }
}
