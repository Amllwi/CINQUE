/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cinque;

import java.util.Scanner;

/**
 *
 * @author AMAL
 */
public class CINQUE {

    /**
     * @param args the command line arguments
     */
    public class JavaApplication54 {

        /**
         * @param args the command line arguments
         */
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int intentos = 0;
            int anyo = 0;
            int siglo = 0;
            intentos = sc.nextInt();
            while (intentos != 0) {
                anyo = sc.nextInt();
                intentos--;
                siglo = (anyo - 1) / 100 + 1;
                System.out.println(siglo);
            }
     // SOY MARIAM
        }
    }
    //HOLA COMO ESTÁS
}
