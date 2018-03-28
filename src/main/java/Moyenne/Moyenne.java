/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Moyenne;

import java.util.Scanner;

/**
 *
 * @author Formation
 */
public class Moyenne {

    private static Scanner sc = new Scanner(System.in);

    public static int DemanderUnNombreEntier() {
        int nombreE = 0;
        System.out.println(" Entrer un nombre entier :");
        System.out.println(" \b ");
        nombreE = sc.nextInt(); // Permet d'aller à l'étape suivante
        return nombreE;
    }

    public static double DemanderUnNombreReel() {
        double nombreR = 0;
        System.out.println(" Entrer un nombre réel : ");
        nombreR = sc.nextDouble();
        System.out.println(" \b ");
        return nombreR;
    }
    
    public static void Affiche_Somme_Nombre () {
        double somme_Nombre = 0;
        
        
    }

    public static void main(String[] args) {
        int NombreEntier = 0;
        double NombreReel = 0;
        
        try {
            NombreEntier = DemanderUnNombreEntier();
            
            for (int i = 0; i < NombreEntier; i++) { 
                NombreReel = NombreReel + DemanderUnNombreReel();
            }
                
            System.out.println(" Votre somme est de :" + NombreReel); 
            System.out.println(" Moyenne : " + NombreReel / NombreEntier);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            
        }
        
    }
    
}

// += = SOMME
