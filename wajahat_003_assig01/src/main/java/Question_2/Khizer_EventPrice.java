package Question_2;
import java.util.Scanner;
public class Khizer_EventPrice{
public static void main(String[] args) {
System.out.println("*********************************");
           System.out.println("\"Khizer make food that make the party\"");
         System.out.println("*********************************");
         Scanner input=new Scanner(System.in);
        System.out.print("PEOPLE NUMBER ON AN EVENT =");
        int NoofPeople = input.nextInt();
        System.out.println("___________________________");
        int PriceperPerson = 35;
        System.out.println("PRICE PER MAN "+PriceperPerson +"$");
        int TOTAL_PRICE=(PriceperPerson*NoofPeople);
        System.out.println("TOTAL COST IS =" + TOTAL_PRICE+"  Only");
        if (NoofPeople>50){
            boolean y=true;
            System.out.println("EVENT IS LARGE"+y);
}
        else 
        {boolean y=false;
            System.out.println("EVENT IS large "+ y);
}}}
