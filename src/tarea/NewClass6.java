package tarea;


import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ISTLOJA1
 */
public class NewClass6 {
    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        System.out.println("ingrese un texto");
        String cadena;
         cadena = entrada.nextLine();
        
          
        String may = "ABCDEFGHIJKLMNOPKRSTUVWXYZ";
        String consonantes = "BCDFGHJKLMNPQRSTVWXYZbcdfghjklmnpqrstvwxyz";
        String minusculas = "abcdefghijklmnopqrstuvwxyz";
        String espacios = (" ");
        String vocales = ("AEIOUaeiou");

        int contarvocales = 0, contarconsonantes = 0, contarespacios = 0, contarminusculas = 0, contarmay = 0;
        for (int i = 0; i < cadena.length(); i++) {

            if (vocales.contains(cadena.charAt(i) + "")) {
                contarvocales++;
            }
            if (consonantes.contains(cadena.charAt(i) + "")) {
                contarconsonantes++;

            }
            if (espacios.contains(cadena.charAt(i) + "")) {
                contarespacios++;
            }

            if (minusculas.contains(cadena.charAt(i) + "")) {
                contarminusculas++;
            }

            if (may.contains(cadena.charAt(i) + "")) {
                contarmay++;
            }
        }
          System.out.println("vocales" + contarvocales + " consonantes" + contarconsonantes + " espacios" + contarespacios + " mayusculas" + contarmay + " minusculas" + contarminusculas);

        
    }
    
        
       
        
    }
    

    
