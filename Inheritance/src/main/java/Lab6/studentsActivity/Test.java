/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab6.studentsActivity;

/**
 *
 * @author princ
 */
public class Test {
    public static void main(String[] args) {
        Tablet nokia = new Tablet(new Modem(), new CardReader(), new IrisScanner(), 7, new Battery(), new FingerPrintScanner(), new Cam(), new CPU(), new RAM(), new HDD(), new MotherBoard(), new DataBus(), 1500);
        System.out.println(nokia);
        Laptop dell = new Laptop(14, new Battery(), new FingerPrintScanner(), new Cam(), new CPU(), new RAM(), new HDD(), new MotherBoard(), new DataBus(), 1500);
        System.out.println(dell);
        Computer hp = new Computer(new CPU(), new RAM(), new HDD(), new MotherBoard(), new DataBus(), 1500);
        System.out.println(hp);
    }
}
