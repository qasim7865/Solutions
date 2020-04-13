package khizarseventprice;

import java.util.Scanner;

/**
 *
 * @author M.Hamza
 */
public class KhizarsEventPrice {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input=new Scanner(System.in);
        boolean c;
        int a;
        int b;
        System.out.println("Enter the number of guests");
        a=input.nextInt();
        b=a*35;
        System.out.println("Number of guests are  " +a);
        System.out.println("Price per guest is $35");
        System.out.println("Total price is "+b);
        if (a>=50)
        {
            c=true;
            System.out.println(c);
        }
        else
        {
            c=false;
            System.out.println(c);
        }
    }
    
}

