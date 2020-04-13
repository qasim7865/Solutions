
package Question03;
import java.util.Scanner;
public class KhizerEventPriceWithMethod {
    public static int guestsMethod(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter No of Guests : ");
        int guests=input.nextInt();
        return guests;
    }
    public static void displayDataMethod(int x){
        int totalPrice, price=35;
        totalPrice= x*price;
        System.out.println("Price of Event "+totalPrice);
        if(x>=50){
            System.out.println("\nEvent is Large ");
        }
        else{
            System.out.println("\nEvent is Small ");
        }
    }
    public static void main(String[] args) {
        int y = guestsMethod();
        EventDemo.khizarMotto2();
        displayDataMethod(y);
    }
}
