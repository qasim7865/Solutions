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
public class Faculty extends Person{
    String employmentType;
    double salary;
    Date dateOfEmployment;

    public Faculty(String employmentType, double salary, Date dateOfEmployment, String name, String cnic, Date dateOfBirth, String country) {
        super(name, cnic, dateOfBirth, country);
        this.employmentType = employmentType;
        this.salary = salary;
        this.dateOfEmployment = dateOfEmployment;
    }

    public Faculty(String employmentType, double salary, Date dateOfEmployment) {
        this.employmentType = employmentType;
        this.salary = salary;
        this.dateOfEmployment = dateOfEmployment;
    }
    
    
    public void display(){
        System.out.println(name);
    }
}
