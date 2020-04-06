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
public class Test {
    public static void main(String[] args) {
        Vehicle vehObj = new Vehicle();
        Vehicle busObj = new Bus();
        
        System.out.println(busObj instanceof Vehicle);
    }
}
