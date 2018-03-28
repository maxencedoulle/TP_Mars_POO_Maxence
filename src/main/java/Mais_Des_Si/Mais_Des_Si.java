
package Mais_Des_Si;

import java.util.Scanner;

/**
 *
 * @author Formation
 */
public class Mais_Des_Si {
    
    public static void main(String[] args) {
        
        
        try {
            Scanner sc = new Scanner (System.in);
            int age = 0;
            int taille = 0;
            
            System.out.println(" Saisiser votre âge :");
            System.out.println(" \b");
            
            while (! sc.hasNextInt()) {
                sc.next(); // De nouveau appel aux scanner
                System.out.println(" Veuillez saisir un ENTIER ");
            }
            
            age = sc.nextInt(); // Permet de récupérer une valeur et de passé à l'action suivante 
            System.out.println(" Saisir votre taille :");
            System.out.println(" \b ");
            
            while (! sc.hasNextInt()) {
                sc.next(); // De nouveau appel aux scanner
            }
            
            taille = sc.nextInt();
            
            if (age >20 && taille < 100) {
                System.out.println(" Vous êtes peut-être un nain adulte ? ");
            }
            
            if (age > 20 && taille > 200) {
                System.out.println(" Vous êtes un Géant adulte ");
            }
            
            if (age <3 && taille < 50) {
                System.out.println(" Vous êtes peut-être un Bébé ?");
            }
            
            if (age > 15 && age < 18 && taille > 150 && taille < 180) {
                System.out.println(" Vous êtes un ado ");
            } 
            
        } catch (Exception e) {
            
        }
    }
    
}
