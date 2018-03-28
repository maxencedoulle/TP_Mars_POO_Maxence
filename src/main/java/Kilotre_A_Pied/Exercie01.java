/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Kilotre_A_Pied;

import java.util.Scanner;
import static jdk.nashorn.internal.objects.NativeRegExp.source;

/**
 *
 * @author Formation
 */
public class Exercie01 {

    public static void main(String[] args) {

        try {
            for (int j = 1; j <= 15; j++) {
                if (j == 1) {
                    System.out.println("1 kilomètre à pied, ça use, ça use, " + "\n" + " 1 kilomètre à pied ça use les souliers.  ");
                    System.out.println(" \b ");
                }

                else  { // Pour ajouter le "S" aux killométre jusuq'a 15
                    System.out.println( j + "kilomètres à pied, ça use, ça use, " + "\n" + j +"  kilomètres à pied ça use les souliers. ");
                    System.out.println(" \b");
                }
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }

}
