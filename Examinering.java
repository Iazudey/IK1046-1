IK1046
======
package labb1;

import java.text.NumberFormat;
import java.util.Scanner;
import javax.swing.JOptionPane;


public class Labb1Examinerande {
    
     public static void main(String[] args) {
        
         NumberFormat formatering = NumberFormat.getInstance();
         
         System.out.println("Ange radie: ");
         Scanner input = new Scanner(System.in);
         
         double radie = input.nextDouble();
         double area = (Math.PI * Math.pow(radie, 2));
         double diameter = (radie + radie);
         double omkrets = (2 * Math.PI * radie);
         
         JOptionPane.showMessageDialog(null, "Diameter: " + 
         formatering.format(diameter) + 
         "\n" +"Area: "+ formatering.format(area) + "\nOmkrets: " + 
         formatering.format(omkrets), "Angiven radie: "+ 
         formatering.format(radie), JOptionPane.INFORMATION_MESSAGE);
         
         
         
    }
}
