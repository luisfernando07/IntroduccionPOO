/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea;

/**
 *
 * @author ISTLOJA1
 */
public class computadora {
    
//    declaro atributos
    private int año;
    private String modelo;
    private String marca;
    private double capacidadprocesador;
    private boolean portatil;
//    declaro metodos
    public void guardarInformacion (){
        System.out.println("Hola soy la computadora y guardo informacion");
    }
    public void leerInformacion(){
        System.out.println("Hola soy la computadora y leo informacion");
    }
         public void imprimirInformacion (String info){
               System.out.println(info); 
         }
        public static void main(String[] args) {
            computadora primerobjeto = new computadora();
            primerobjeto.guardarInformacion();
            primerobjeto.imprimirInformacion("hola");
            primerobjeto.imprimirInformacion("chao");
            
        }
    
  }

