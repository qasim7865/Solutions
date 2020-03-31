package Question6;

import java.util.Scanner;

public class EventDemo {
    public static void main(String[] args){
        int inputValues;
        int numberValues;
        Scanner keyboard=new Scanner(System.in);
        System.out.println("Enter number of guests>> ");
        inputValues= keyboard.nextInt();
        while(inputValues<=5 || inputValues>=100){
            System.out.println(" Please come to my event! "); 
            inputValues=keyboard.nextInt();
        }
        
    }
}
