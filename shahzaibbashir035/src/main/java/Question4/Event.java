/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question4;

import java.util.Scanner;

/**
 *
 * @author Shahzaib
 */
public class Event {
    private int Net ;
    private  int Price;
    static  int pp=35;
         
 private String Number;
 static final  int  co=50;
 private final int Member;
 public Event(String Number, int Member) {
        this.Number = Number;
        this.Member = Net;}

    public int getMember() {
         
        return Member;
       
    }
    public void setMember(int Member) {
        this.Member=Member;
    }
    public String getNumber() {
        return Number;
    }
    public void setNumber(String Number) {
    this.Number=Number;
    }
    public void setPrice(int Price) {
        this.Price = Price;         }
    
    public int getPrice() {
             return  (Price);   }
        public static void main(String[] args) {
 System.out.println("Khizer makes the food that makes it a Party");
        Scanner input = new Scanner(System.in);
       
        String c = input.nextLine();
        int a = input.nextInt();
        EventDemo e1=new EventDemo(c,a);
     
        e1.setNumber(c);
       String d =  e1.getNumber();
       System.out.println(" value = "+d);
          
          

       e1.Net(a);
       int number=e1.getMember();
        System.out.println(number);
         int b = pp*a;
        e1.setPrice(b);
        int getit= e1.getPrice();
        System.out.println(pp);
        System.out.println( getit);
        
        
        
    }

    private void Net(int a) {
        throw new UnsupportedOperationException("Not supported"); //To change body of generated methods, choose Tools | Templates.
    }

    
}
