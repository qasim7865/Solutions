/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CateringQuestion3;

import CateringQuestion2.*;
import CateringQuestion1.*;

/**
 *
 * @author princ
 */
public class KhizarsMotto2 {
    private static String str = "Khizar's makes the food that makes it a party";
    private static int xAxis = str.length()+4;
    private static int yAxis = 3;
    public static void displayMottoWithBorder(){
        for (int i=0; i<yAxis; i++){
            for (int j=0; j<xAxis; j++){
                if (i!=1){
                    System.out.print("*");
                }
            }
            if (i==1){
                    System.out.print("**"+str+"**");
                }
            System.out.println();
        }
    }
}
