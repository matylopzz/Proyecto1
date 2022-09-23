/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package listasdobleenlazadas;

import javax.swing.JOptionPane;

/**
 *
 * @author Usuario
 */
public class ListaDoble {
    
    //Punteros
    private NodoDoble inicio, fin;
    
    //constructor
    public ListaDoble()
    {
        inicio=fin=null; // seriacomo int x=0; doble=0
        
    }
    public boolean estaVacia()
    {
        return inicio==null;
    }
    //metodo agregar al final
    public void agregarFinal(int el)
    {
        if(!estaVacia())
        {//para cargar datos elemento seguido punteros
            fin = new NodoDoble(el,null,fin);
            fin.anterior.siguiente=fin;
        }
        else
        {
            inicio=fin=new NodoDoble(el);
        }
    }
    //metodo para agregar al inico
    public void agregarIncio(int el)
    {
        if(!estaVacia())
        {
            inicio = new NodoDoble(el,inicio,null);
            inicio.siguiente.anterior = inicio;
            
        }
        else
        {
            inicio=fin=new NodoDoble(el);
        }
    }
    //Metodo para mostrar lista
    
    public void mostrarListaInicioFin()
    {
        if(!estaVacia())
        {
            String datos = "<=>";
            NodoDoble auxiliar = inicio;
            while(auxiliar!=null)
            {
                datos = datos + auxiliar.dato;
                auxiliar = auxiliar.siguiente;
            }
            JOptionPane.showMessageDialog(null,datos,"list inicio fin",
                    JOptionPane.INFORMATION_MESSAGE);
        }
        
    }
    //metodo para mostrar adelante atras
    public void mostrarListaFinInicio()
    {
        if(!estaVacia())
        {
            String datos = "<=>";
            NodoDoble auxiliar = fin;
            while(auxiliar!=null)
            {
                datos = datos + auxiliar.dato;
                auxiliar = auxiliar.anterior;
            }
            JOptionPane.showMessageDialog(null,datos,"list inicio fin",
                    JOptionPane.INFORMATION_MESSAGE);
        } 
    }
}
