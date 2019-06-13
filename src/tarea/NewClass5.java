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
public class NewClass5 {
    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);
        String l1;
	String l2;
	System.out.print("escriba una palabra: ");
	l1=teclado.nextLine();
	System.out.print("escriba otra palabra: ");
	l2=teclado.nextLine();
	if(l1== null ? l2== null : l1.equals(l2))
           
            System.out.println("Son iguales");
	else
            System.out.println("No son iguales");
    }
}
    

