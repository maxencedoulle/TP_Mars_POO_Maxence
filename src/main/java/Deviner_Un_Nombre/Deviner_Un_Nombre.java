/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Deviner_Un_Nombre;

import static java.lang.Math.random;
import static java.lang.StrictMath.random;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Formation
 */
public class Deviner_Un_Nombre {

    public static void main(String[] args) {

        try {

            Scanner sc = new Scanner(System.in);
            final Random random = new Random();
            int Valrandom = 0;
            int Compteur = 0;
            int Valsaisie = 0;
            boolean FinPartie = false;
            boolean fin = false;
            int BestScore = 0;

            List<Integer> ListeRandom = new ArrayList<Integer>();
            List<Integer> ListeCoup = new ArrayList<Integer>();

            while (FinPartie == false) {
                Valrandom = random.nextInt(100);
                Compteur = 0;
                while (Valsaisie != Valrandom) {
                    //System.out.println(Valrandom); // Affiche la valeur du Random 
                    while (!sc.hasNextInt()) { // Demande un nombre entier à l'utilisateur 
                        sc.next();
                        System.out.println(" Veuillez entrer un entier !");
                    }
                    Compteur++;
                    Valsaisie = sc.nextInt();  // Saisie clavier  
                    if (Valsaisie < Valrandom) {
                        System.out.println(" Trop bas !");
                    }
                    if (Valsaisie > Valrandom) {
                        System.out.println(" Trop Haut !");
                    }
                    if (Valsaisie == Valrandom) {
                        System.out.println(" Genial !!!!! ");
                    }
                }
                ListeRandom.add(Valrandom);
                ListeCoup.add(Compteur);

                System.out.println(" Voulez - vous rejouer oui ou non ?");
                String reponse = sc.next();
                if (reponse.equalsIgnoreCase("non")) { // Le equalsIgnoreCase ne prend pas en compte si oui ou non une Majuscule ou minuscule
                    FinPartie = true;
                }
            }
            BestScore = 0;
            int coup= ListeCoup.get(0);
            for (Integer id : ListeCoup) {
                if (coup > id) {
                    coup=id;
                }
            }
            BestScore=coup;
            System.out.println(" Votre meilleur score est de " + BestScore);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
// sasie clavier = sc.
