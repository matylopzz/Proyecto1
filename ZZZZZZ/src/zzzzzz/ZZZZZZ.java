/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package zzzzzz;

/**
 *
 * @author Usuario
 */
public class ZZZZZZ {

   
    public static void main(String[] args) {
        
        Metodoz list = new Metodoz();
        
        list.ingresoDatos(34);
        list.ingresoDatos(74);
        list.ingresoDatos(96);
        list.ingresoDatos(33);
        
        System.out.println("Cantidad de lista: " + list.getTamaño());
        list.mostrarNormal();
        System.out.println("Boolean Valor: " + list.buscarReferencia(33));
        list.insertarPorReferencia(96, 11);
         
        
        

    }
      
    
}
