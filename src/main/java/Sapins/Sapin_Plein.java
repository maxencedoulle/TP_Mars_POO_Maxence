package Sapins;

import java.util.Scanner;

/**
 *
 * @author Formation
 */
public class  Sapin_Plein {
    
    public static void main(String[] args) {
        
    }

    static Scanner sc = new Scanner(System.in); // STATIC : permet de récupérer plusieures fois le SCANNER

    public void AfficherSapins() {
        int h = sc.nextInt();
        int bt = (h * 2) - 1;

        for (int i = 1; i <= h; i++) { // Les niveaux 
            String chaîne = "";
            int bn = (i * 2) - 1;
            for (int j = 1; j <= ((bt - bn) / 2); j++) {
                chaîne += " ";
            }
            for (int j = 2; j <= bt; j++) {
                if (bt > 0) {
                    chaîne += "*";
                }
            }
            for (int j = 1; j <= ((bt - bn) / 2); j++) {
                chaîne += " ";
            }
            System.out.println(chaîne);
        }
    }
}
