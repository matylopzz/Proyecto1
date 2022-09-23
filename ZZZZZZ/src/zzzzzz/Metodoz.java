/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package zzzzzz;

/**
 *
 * @author Usuario
 */
public class Metodoz {
    
    
    //antes tenemos que establecer los elementos de la clase punteros
    Nodoz primero;
    Nodoz segundo;
    private int tamaño;
    private int tamanio;
    
    //llamamos a por  nombre de classe e inicializamos los punteros x=0
    public Metodoz()
    {
        primero = null;
        segundo = null;
        //int tamaño = 0 ;
        tamanio=0;
    }
    public void Metodoz()
    {
        tamaño = 0 ;
        tamanio =0;
    }
    
    public boolean estaVacia()
    {
        return primero==null;
    }
    /*
    public void getTamaño(int)          INCORRECTO
    {
        return = tamaño;
    } es un tipo entero el tamaño
    */ 
    public int getTamaño()
    {
        return  tamaño;
        
    }
    
    
    //ingresamos cuantos elementos vamos 
    //En clase nodo tenemos el tipo de datos q utilizaremos
    public void ingresoDatos(int datos)
    { 
        // lo llamamos de la clase donde incializamos el elemento
        Nodoz nuevo = new Nodoz();   //Nodoz es un const de enteros (int)
        nuevo.datos = datos;
        
        
        if (primero == null)
            
            //primeero= 34
            //segundo= 
            // 34->null
        {
        primero = nuevo;
        primero.siguiente = null ; //  null <-34-> null
        primero.anterior = null ; 
        segundo = primero;   
        
        }
        
        else;
        {
            //1º Insertamos el dato en la ultima casilla y crear una nueva "siguiente"
            segundo.siguiente = nuevo;        //nuevo=76 -- null <-34-> 76 
            //2º mi nuveo dato tiene que apuntar al anterior y sobrescribirlo por el ultimo que seria el mismo
            nuevo.anterior = segundo;
            nuevo.siguiente = null;
            segundo = nuevo ;
           
        }
        tamaño++;
        
        
    }
    
    public void ingresoAlFinal(int datos)
    {
        Nodoz fin = new Nodoz();
        fin.datos = datos;
        //Ahora fin tiene los datos (el valor de los datos)
        if(primero==null)
        {
            
            segundo = fin;
            fin.siguiente = null;
            fin.anterior = null;
            primero = segundo;
        }
        else
        {
            primero.anterior = fin;
            fin.siguiente = primero;
            fin.anterior = null;
            primero = fin;
           
        }
        tamaño++;
    }
    //donde esten los 4 escribir los numeros tales -> 9
     public void insertarPorReferencia(int referencia , int datos)
       {
           Nodoz ref = new Nodoz();
           //asiganmos un valor 
           ref.datos = datos;
           //la lista no sea vacia 
           if(primero!=null)
           {
               //tenemos que buscar por referencia 
               if(buscarReferencia(referencia))
               {
                   Nodoz aux = primero;
                   
                   //Recorrer la lista hasta llegar al nodo deseado 
                   while(ref != referencia)
                   {
                       aux = aux.siguiente;
                   }
                   // Crear un respaldo de la continuacion de la lista 
                   Nodoz siguienteFinal = aux.siguiente;
                   //Unir la continuacion de la lista con el nuevo nodo
                   
                   aux=ref;
                   aux=siguienteFinal;
                   
                   
                   
               }
           }
           
           
       }
    public boolean buscarReferencia(int referencia)
    {
        //Hcer una copia del lista
        Nodoz aux = primero;
        //Bandera para ver si encontramops el valor
        boolean encontrado = false;
        //recorrer lista  hasta llegar hasta eel final de la lista ;
        while(aux!=null && encontrado!=true)
        {
            //ver si el valor del nodo es igual al de la referencia 
            if(aux.datos==referencia)
            {
                encontrado = true;
            }
            else
            {
                aux = aux.siguiente;
            }
            
        }
        
        return encontrado;   
    }
    

    public void mostrarDelUltimoDatos()
    {
       Nodoz actual = new Nodoz();
       actual = segundo;
       while(actual!=null)
       {
           System.out.println(actual.datos);
           actual = actual.anterior; 
       }

    }
        public void mostrarNormal()
        {
            Nodoz inicio = new Nodoz();
            inicio = primero;
            while(inicio!=null)
            {
                System.out.println(inicio.datos);
                inicio = inicio.siguiente;
            }
            System.out.println("Fin del siclo");
            System.out.println("--------------------");
            tamanio++;
        }
        
      


       public void mostrarNormal2()
       {
           Nodoz ver = new Nodoz();
           ver = primero;
           while(ver!=null)
           {
               System.out.println("--> "+ ver.datos);
               ver = ver.siguiente;

           }
       } 
       public void mostrarFinal()
       {
           Nodoz op = new Nodoz();
           op = segundo;
           while(op!=null)
           {
               System.out.println("Marcha atras --> "+op.datos);
               op = op.anterior;

           }

       }
       


            
}
