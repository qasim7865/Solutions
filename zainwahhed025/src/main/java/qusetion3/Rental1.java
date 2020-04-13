/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package qusetion3;

import java.util.Scanner;
import static qusetion3.Rental.a;

/**
 *
 * @author Zain Waheed
 */
public class Rental1 {
    public final static int l=60;
    public final static int d=40;
    private String contractNumber;
    private int noOfHours;
    private int noOfMinutes;
    private int price;
    public static String b;
    
    public String input1(){
        
        
        System.out.println("Contract no");
        Scanner input=new Scanner(System.in);
        b=input.next(b);
        return b;
    }
    
    public void setContractNumber(String contractNumber) {
        this.contractNumber = contractNumber;
    }
    
    public int setHoursAndMinutes(int a){
        int z;
        noOfHours=a/60;
        z=noOfHours*60;
        noOfMinutes=a-z;
        price=noOfHours*40+noOfMinutes;
        return price;
    }
public void disp(){
        
        
        System.out.println("Hours"+noOfHours);
        System.out.println("Minutes"+ noOfMinutes);
        
        
        System.out.println("Rental Cost="+price);
    }
    public String getContractNumber() {
        return contractNumber;
    }

    public int getNoOfHours() {
        return noOfHours;
    }

    public int getNoOfMinutes() {
        return noOfMinutes;
    }

    public int getHours() {
        return noOfHours;
    }
    
}
