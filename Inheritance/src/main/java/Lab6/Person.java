/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab6;

import java.util.Date;

/**
 *
 * @author princ
 */
public class Person {
    protected String name;
    String cnic;
    Date dateOfBirth;
    String country;

    public Person(String name, String cnic, Date dateOfBirth, String country) {
        this.name = name;
        this.cnic = cnic;
        this.dateOfBirth = dateOfBirth;
        this.country = country;
    }

    public Person() {
        name = "defaultName";
        cnic= "00000-00000000-0";
        dateOfBirth = new Date();
        country = "Pakistan";
    }
    
    
    
    protected void displayName(){
        System.out.println(name +"in person class");
    }
    
    public void displaycnic(){
        System.out.println(cnic);
    }
}
