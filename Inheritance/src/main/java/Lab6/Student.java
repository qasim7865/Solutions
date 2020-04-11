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
public class Student extends Person {
    String programEnrolled;
    String universityName;
    int semesterNumber;

    public Student(String programEnrolled, String universityName, int semesterNumber) {
        this.programEnrolled = programEnrolled;
        this.universityName = universityName;
        this.semesterNumber = semesterNumber;
    }

    public Student(String name, String cnic, Date dateOfBirth, String country, String programEnrolled, String universityName, int semesterNumber) {
        super(name, cnic, dateOfBirth, country);
        this.programEnrolled = programEnrolled;
        this.universityName = universityName;
        this.semesterNumber = semesterNumber;
    }

    public Student() {
        super();
        this.programEnrolled = "CS";
        this.universityName = "CUI";
        this.semesterNumber = 3;
    }
    
    
    
    
    
    public void displayName(){
        System.out.println(name +"in child class");
    }
    
    public void displayUniversity(){
        System.out.println(universityName);
    }
    
    public void test(){
        this.displayName();
        super.displayName();
    }
}
