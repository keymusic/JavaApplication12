/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication12;

/**
 *
 * @author Michael
 */
public class JavaApplication12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        final String strWoerter = "Liebe;Love; Licht;Light; Leben;Life"; // Jesus
        String strWortArray[] = strWoerter.split("; ");
        for (int i=0; i<strWortArray.length; i++) {
            System.out.println("#"+i+": "+strWortArray[i]);
        }
    }
    
}
