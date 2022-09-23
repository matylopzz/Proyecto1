/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package listasdobleenlazadas;

/**
 *
 * @author Usuario
 */
public class NodoDoble {
    public int dato;
    NodoDoble siguiente, anterior;
    
    //Construc si no hay ndos
    public NodoDoble(int el)
    {
        this(el,null,null);
    }
    
    //Contruc si hay nodos existentes
    public NodoDoble(int el, NodoDoble s, NodoDoble a)
    {
        dato= el;
        siguiente = s;
        anterior = a;
    }

}
