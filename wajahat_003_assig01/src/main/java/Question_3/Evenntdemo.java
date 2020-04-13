package Question_3;
import java.util.Scanner;
public class Evenntdemo {
        String eveNt_number;

    public String getEveNt_number() {
        return eveNt_number;
    }

    public void setEveNt_number(String eveNt_number) {
        this.eveNt_number = eveNt_number;
    }
    
    public static  int Methos1(){
    Scanner input=new Scanner(System.in);
    System.out.print("ENTER THE TOTAL NO OF PEOPLE = ");
    int y=input.nextInt();
    return y;
    }
    
    public static  void Methos1(String name){
        System.out.println(name);}
     public static  void Methos1(int No){
         int PriceperPerson = 35;
        System.out.println("PRICE PER MAN "+" "+PriceperPerson +"$");
        int TOTAL_PRICE=(PriceperPerson*No);
        System.out.println("TOTAL COST IS = " + TOTAL_PRICE+"$");
        
        if (No>50){
            boolean y=true;
            System.out.println("\"EVENT IS LARGE\" = "+y);
            } 
        else 
        {boolean y=false;
            System.out.println("\"EVENT IS LARGE\" = "+y);}
     }
 public static void main(String[] args) {
        Methos1("************************************************\n"+"\"|Khizer's makes the food that makes it a Party|\""+"\n\"**********************************************");

        Evenntdemo obj = new Evenntdemo ();
        Scanner input=new Scanner(System.in);
         System.out.print("ENTER Event_number = ");
        String x= input.nextLine();
        obj.setEveNt_number(x);
         String w = obj.getEveNt_number();
        System.out.println("Your Event Number = "+"|_________{"+ w+"}_________|");
        int z= Methos1();
     	   Methos1(z);
 } 
}
