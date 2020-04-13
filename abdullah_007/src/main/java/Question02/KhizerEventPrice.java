
package Question02;
import java.util.Scanner;
public class KhizerEventPrice {
    
    public static void main(String[] args) {
        System.out.println("************************************");
        System.out.println("Khizer make food that make the party");
        System.out.println("************************************");
        Scanner input = new Scanner(System.in);
        System.out.println("Enter No of Guests : ");
        int guests=input.nextInt();
        int price = 35;
        int totalPrice;
        totalPrice= guests*price;
        System.out.println("\nNo of Guests : "+guests+"\nPrice Per Person = "+price+"\nTotal Price = "+totalPrice);
        if(guests>=50){
            boolean s=true;
            System.out.println("\nEvent is Large "+s);
        }
        else{
            boolean s=false;
            System.out.println("\nEvent is Small "+s);
    }
}
}
