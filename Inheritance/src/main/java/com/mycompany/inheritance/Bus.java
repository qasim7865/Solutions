/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.inheritance;

/**
 *
 * @author princ
 */
public class Bus extends Vehicle{
    
    public void applyBrakes(){
        super.applyBrakes();
        System.out.println("child class applying brakes");
    }
    
    public static void main(String[] args) {
        Bus b1 = new Bus();
        b1.applyBrakes();
    }
}
