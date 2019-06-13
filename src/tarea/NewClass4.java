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
public class NewClass4 {
    public static void main(String[] args) {
        Scanner entrada =new Scanner (System.in);
        String dia;
               System.out.println("ingrese el dia de la semana");
               dia = entrada.nextLine();
               if (dia.equals("lunes")||dia.equals("martes")||dia.equals("miercoles")||dia.equals("jueves")||dia.equals("viernes")) 
               System.out.println("dias laborables");
               else
                   if (dia.equals("sabado")||dia.equals("domingo"))
                          System.out.println("dias no laborables");
               else
                       System.out.println("ingrese un dia a la semana");
                      }  
}