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
public class facturas {
    
    private int tamaño;
    private String modelo;
    private String diseño;
    private boolean venta;
    public void facturaproductos (){
        System.out.println("vendo productos de calidad");
    }
    public void leerInformacion(){
        System.out.println("entrago productos de calidad");
    }
    public void imprimirventas (String ventas){
               System.out.println(ventas); 
    }
    public static void main(String[] args) {
            facturas primerobjeto = new facturas();
            primerobjeto.facturaproductos();
            primerobjeto.imprimirventas("precios");
            primerobjeto.imprimirventas("total");
}  
}
   
