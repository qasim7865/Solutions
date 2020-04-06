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
public class Vehicle {
    
    String fuelCapacity;
    
    public void fuelCapacity(String fuelCapacity){
        System.out.println(this.fuelCapacity);
        System.out.println("Default fuel capacity");
    }
    
    public void capacity(){
        System.out.println("Default weight capacity");
    }
    
    public void applyBrakes(){
        System.out.println("Brakes are applying");
    }
}
