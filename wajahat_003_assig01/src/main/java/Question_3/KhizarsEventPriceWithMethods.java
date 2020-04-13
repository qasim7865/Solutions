package Question_3;
import java.util.Scanner;
public class KhizarsEventPriceWithMethods {
    public static  int Methos1(){
    Scanner input=new Scanner(System.in);
    System.out.print("ENTER THE TOTAL NO OF PEOPLE = ");
    int y=input.nextInt();
    return y;
    } 
// method for the Total_Price when the per_price is set	 and this method as well set the event //capacity if event is grater than 50 people than  
    public static  void Methos1(String name){
        System.out.println(name);}
     public static  void Methos1(int No){
         int PriceperPerson = 35;
        System.out.println("PRICE PER MAN"+" "+PriceperPerson +"$");
        int TOTAL_PRICE=(PriceperPerson*No);
        System.out.println("TOTAL COST IS =" + TOTAL_PRICE+"$");
        
        if (No>50){
            boolean y=true;
       System.out.println("\"EVENT IS LARGE\" = "+y);
            } 
        else 
        {boolean y=false;
            System.out.println("\"EVENT IS LARGE\" = "+y);}
     }
     // main method in which only three calling statemet 
public static void main(String[] args) {
Methos1("|Khizer's makes the food that makes it a Party|\""+"\n\"**********************************************\"");
 int z= Methos1();
     	   Methos1(z);
 } 
}
