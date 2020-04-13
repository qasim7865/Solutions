
package question5;

import java.util.Scanner;

public class Rental {
    public final static int l=60;
    public final static int d=40;
    private String contractNumber;
    private int noOfHours;
    private int noOfMinutes;
    private int price;
    public static String b;
    public int a;
    
    public Rental(String contractNumber,int a){
        this.contractNumber = contractNumber;
        setHoursAndMinutes(a);
    }
    public Rental(){
        
    }
    
    public String input1(){
        
        
        System.out.println("Contract no");
        Scanner input=new Scanner(System.in);
        String b=input.nextLine();
        contractNumber=b;
        return contractNumber;
    }
    public int input(){
        
        
        System.out.println("enter no of minutes");
        Scanner input=new Scanner(System.in);
        a=input.nextInt();
        return a;
    }
    public void setContractNumber(String contractNumber) {
        this.contractNumber = contractNumber;
    }
    
    public void setHoursAndMinutes(int a){
        if(a<60){
           noOfHours=0; 
           noOfMinutes=a;
           price=40;
        }
        else{
        int z;
        noOfHours=a/60;
        z=noOfHours*60;
        noOfMinutes=a-z;
        price=noOfHours*40+noOfMinutes;
        
        }
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
    public Rental lc(Rental q, Rental z){
        if (q.a>z.a){
            return q;
        }
        else{
            return z;
        }
    }
}
