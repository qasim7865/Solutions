/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.inheritance;

import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author princ
 */
public class Test {
    public static void main(String[] args) {
        int year = 120;
        int month = 03;
        int day = 20;
        Date myDate = new Date(year,month,day);
        System.out.println(myDate);
    }
}
