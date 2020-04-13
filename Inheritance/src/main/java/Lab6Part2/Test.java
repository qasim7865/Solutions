/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab6Part2;

/**
 *
 * @author princ
 */
public class Test {
    public static void main(String[] args) {
        Invoice inv1 = new Invoice(1,new RegularCustomer(1000, 1, "Qasim", 'm'), 15000);
        
        System.out.println(inv1.getAmountAfterDiscount());
    }
}
