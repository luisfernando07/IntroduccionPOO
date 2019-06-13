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
public class NewClass8 {
     public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("ingrese el radio");
        double area,radio;
        radio = entrada.nextDouble();
        area = Math.PI * Math.pow(radio, 2);
        System.out.println("el area es : "+ area);
    }

}


