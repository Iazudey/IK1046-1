IK1046
======
package labb1;

// importerar de verktyg som beskrivits i 
// instruktionen för labben. 
import java.text.NumberFormat;
import java.util.Scanner;
import javax.swing.JOptionPane;

//Vårt objekt i den här övningen finnes nedanför i form av Labb1examinerande. 
public class Labb1Examinerande {
    
    //anropar till java att det är här som den ska börja läsa!
     public static void main(String[] args) {
        
         // Formaterar resultet alltså outputen på programmet så att det blir max tre decimaler
         NumberFormat formatering = NumberFormat.getInstance();
         
         //skriver ut frågan som står i konsollen i samband med att man startar programmet
         System.out.println("Ange radie: ");
         
         // Anropar scannern att det är nu den ska användas.(användaren skall skriva in ett värde). 
         Scanner input = new Scanner(System.in);
         
        // Sätter att radien är lika med inputen som kommer in från systemet.
        //Vi har ett exempel på variabel/identifierare i form av radien.
        // Ett exempel på metod är nextDouble(); här! 
        //den här kodraden och de tre nedanför är våra argument. 
         double radie = input.nextDouble();
         
         // Formler för att räkna ut omkrets, area och diameter.
         //Ett exempel på datatyp vi använder här är double. 
         double area = (Math.PI * Math.pow(radie, 2));
         // Här tilldelas diameterns värde i form av radie*2. 
         double diameter = (radie + radie);
         double omkrets = (2 * Math.PI * radie);
         
         // Skriver ut outputen/resultatet från programmet på en JOptionPane alltså dialogruta.
         //Här nedanför har vi exempel på när vi använder oss av operatorer i form av +
         JOptionPane.showMessageDialog(null, "Diameter: " + 
         formatering.format(diameter) + 
         "\n" +"Area: "+ formatering.format(area) + "\nOmkrets: " + 
         formatering.format(omkrets), "Angiven radie: "+ 
         formatering.format(radie), JOptionPane.INFORMATION_MESSAGE);
         
         
         
    }
}
