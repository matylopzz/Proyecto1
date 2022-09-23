/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package listadoblev2;

/**
 *
 * @author Usuario
 */
public class ListDouble {
    
    //elementos del lista
    
    nodo primero; //posiciones con elementos 
    nodo ultimo;
    
    //inicializamos los contenedores
    public ListDouble()
    {
        primero=null;
        ultimo=null;
    }
    
    public void ingresarElemento(int dato)
    {
        nodo nuevo = new nodo(); // constructor
        nuevo.dato = dato;      //nuevo la variable dato es nuemero(elemento)
        
        if (primero==null)
            // dato=43
        { 
            primero = nuevo; 
            primero.siguiente = null; //  34-> null
            primero.anterior=null;    // null <-34-> null 
            ultimo = primero;  //aca el ult y el primero son 34
        }
        else
        {
            ultimo.siguiente = nuevo;
            nuevo.anterior = ultimo;
            nuevo.siguiente = null;
            ultimo = nuevo;
        }
            
    }
    
    public void MostrarLista()
    {
        nodo actual = new nodo();
        actual = ultimo;
        while(actual!=null)
        {
            System.out.println(actual.dato);
            actual = actual.anterior; 
        }
    }
    
    
}
