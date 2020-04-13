/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab6;

/**
 *
 * @author princ
 */
public class Test {
    public static void main(String[] args) {
        Student a = new Student();
        Person b = new Student();
        Object c = new Student();
        
        System.out.println(c instanceof Student);
        
        Student j = (Student) c;
        
        int d = 10;
        float e = 10;
        double f = 10;
        
        
        int h = (int) f;
    }
}
