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
public class NewClass7 {
    public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);

        String frase;
        System.out.println("escriba una frase");
        frase = entrada.nextLine();
        int contador = 0;
        for (int i = 0; i < frase.length(); i++) {
            contador++;

        }
        if (contador <= 10) {
            System.out.println(frase.replace("e", "u"));
        } else {
            System.out.println(frase.replace("o", "i"));
        }

    }
}


