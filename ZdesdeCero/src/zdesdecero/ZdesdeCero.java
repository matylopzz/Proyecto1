 
package zdesdecero;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
        
public class ZdesdeCero {
    
    public static Scanner teclado=new Scanner(System.in);
    
    public static void ejercicio1(){
        int []array = new int[4];
        ingresoArray(array);
        
        mostrarArray(array);
        

    }
    public static void ingresoArray(int[]a){
        for(int i=0; i<a.length;i++){
            System.out.println("iNGRESE ELEMENTOS: "+i);
            a[i]=teclado.nextInt();
        }    
    
    }
    public static void mostrarArray(int[]a){
        for (int i=0; i<a.length;i++){
            System.out.println("index "+ i +" Elemento --> "+a[i]);
        }
    }    
    /*    
    Ejercicio2: Crear un vectir  de 20 numeros reales correspondientes a los pesos de 20 personas 
    Obtener el peso mayor ,el peso menor y el peso medio (promedio) y enviar un mensaje si hay una persona con
    un peso mayor a 100kg.

    */
    
    public static void ejercicio2(){
        //double[]array = new double[4];
        ///ingresoArrayDouble(array);
        ///recorrerP(array);
        ArrayList <Double> lista=new ArrayList<>();
        ingresar2(lista,5);
        recorrerP2(lista);
    }
    
    public static void ingresar2(ArrayList<Double>list,int tam){
        System.out.println("Ingrese elemento: ");
        for(int i=0;i<tam;i++){
            list.add(teclado.nextDouble());
        }
        
        
    }
    public static void recorrerP2(ArrayList<Double>list){
        double menor=list.get(0);
        double mayor=list.get(0);
        double suma=0;
        for (int i=0;i<list.size();i++){
            if(list.get(i)>mayor){
                mayor=list.get(i);
            }else{
                if(list.get(i)<menor){
                    menor=list.get(i);
                    
                }
            }
            suma=suma+list.get(i);
        }
        System.out.println("------Resultados------");
        System.out.println("Maayor peso: "+mayor);
        System.out.println("Menor peso: "+menor);
        System.out.println("Promedio peso: "+suma/list.size());
        if(mayor>100){
            System.out.println("Hay un peso mayor a 100kg es el: "+mayor);
        }else{
            System.out.println("No se encontro un peso mayor a 100kg");
        }
    }
    
    public static void ingresoArrayDouble(double[] a){
        for (int i=0;i<a.length;i++){
            System.out.println("Ingrese elemento "+i+":");
            a[i]=teclado.nextDouble();
        }
    }
    public static void recorrerP(double[]a){
        double menor=a[0];
        double mayor=a[0];        
        double suma=0;
        for(int i=0;i<a.length;i++){
            if(a[i]>mayor){
                mayor=a[i];
            }else{
                if(a[i]<menor){
                    menor=a[i];
                }
            }
            suma=suma+a[i];   
        }
        System.out.println("------Resultados------");
        System.out.println("Maayor peso: "+mayor);
        System.out.println("Menor peso: "+menor);
        System.out.println("Promedio peso: "+suma/a.length);
        if (mayor>100){
                System.out.println("Hay un Peso mayor a 100kg con: "+mayor); 
         }  
    }
    /*
    Generar 20 numeros enteros entre 1 y 100 de forma aleatoria y contar cuanos 
    de esos numeros enteros son divisibles entre 5.
    
    */
    
    public static void ejercicio4(){
        ArrayList<Integer> list = new ArrayList<>();
        int contador=0;
        int numero=0;
        Random r=new Random();
        for(int i=0;i<5;i++){
            numero=r.nextInt(40)+1;
            list.add(numero); //no comienza en cero sino 1
            //System.out.println("Ingrese un numero: ");
            //int a = teclado.nextInt();
            if(numero%5==0){
                contador++;
                System.out.println("-----Resultados-----");
                System.out.println("El "+numero+" es divisible entre 5");
                System.out.println("Cantidad de divisibles -->"+contador);
                System.out.println(list.toString());
            }else{
                System.out.println("El "+numero+" no es divisible entre 5");
            }
            
            
        }
    }
    
    /*
    Ejercicio Nº9
    -Crea una matriz de 3x3 con los numeros del 1 al 9.Mostrar por 
     pantalla,matriz
    
    */
    public static void ejercicio9(){
        int[][]matriz=new int[3][3];
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                System.out.println("Ingrese elemento: "+i+","+j);
                matriz[i][j]=teclado.nextInt();
                
            }
        }
        for(int i=0;i<3;i++){
            System.out.print("\n");
            for(int j=0;j<3;j++){
                System.out.print("\t"+matriz[i][j]);
            }
        }
    }
    /*
    Generar un vector y eliminar un elemento soliciutado por el usuario, sin dejar
    hueco al momento de eliminar el vector. 
    */
    public static void ejercicio3tp2(){
        double []vector = new double[5]; // [4,7,8,7,9] --> [4,7,7,9]
        ingresoArrayDouble(vector);
        eliminarPos(vector,2);
        mostrarDouble(vector);
        
        
    }
    public static void eliminarPos(double[]a,int pos){
        
        for(int i=pos;i<a.length-1;i++){
            a[i]=a[i+1];
        }
        
    }
    public static void mostrarDouble(double[]a){
        for(int i=0;i<a.length-1;i++){
            System.out.println("Elemento "+ i +" : "+ a[i]);
        }
    }
    /*
    Dada una lista  de numeros enteros, separala en dos listas ordenada de menor
    a mayor: la primera con los numeros pares y la segunda con los numeros 
    impares
    */
    public static void ejercicio5(){
        int[]vector={1,5,8,7,9,6,2,4,3}; //listP={8,6,2,4} --- listI={1,5,7,9,3}
        int tamP=0;
        int tamI=0;
        int []listP;
        int []listI;
        for (int i=0;i<vector.length;i++){
            if (vector[i]%2==0){
                tamP ++;
            }
            else{
                tamI ++;
            }
        }
        listP = new int[tamP];
        listP = new int[tamI];
        
        for(int i=0;i<vector.length;i++){
            if (vector[i]%2==0){
                listP[tamP]=vector[i];
                tamP--;
            }
            else{
                listI[tamI]=vector[i];
                tamI--;
            }
        }
        insercionDirecta(listP);
        insercionDirecta(listI);
        mostrarArray(listP);
        mostrarArray(listI);
        
    }
        public static void insercionDirecta(int[]vector){
        int p, j;
        int aux;
        for(p = 1;p<vector.length;p++){        //desde el seg elem hasta el final
            aux = vector[p];                   //guardamos el elemento y comparamos 
            j = p-1;                           //con el anterior mientras queden
            while((j>=0) && (aux<vector[j])){  //y el el aux menor q los de la izq
                vector[j+1] = vector[j];       //se desplaza a la derecha
                j--;
            }
            vector[j+1]=aux;                    //colocamos aux en su sitio
        }
    }
        
    public static void ejercicio5TP2(){
        System.out.println("ingrese una palabra: ");
        String cadena = teclado.next();
        String cadena2;
        int j=0;
        for(int i;cadena.length();i>=0;i--){

        }
    }
    /*
 Escriba un programa que determine la cantidad de vocales y consonantes
    de una palabra.
    */  
    
    public static void ejercicio7T(){
        System.out.println("Ingrese una palabra:");
        String palabra=teclado.next();
        int CantV=0;
        int CantC=0;
        //char[] vocales= {"a","e","i","o","u","A","E","I","O",'U'};
        char[] vocales = {'a','e','i''o','u'};
        for (int i=0;i<palabra.length();i++){
            if (pertenece(vocales,palabra.charAt(i)/*Trae el caracter segun el indice*/)){
                CantV++;
            }
            else{
                if (pertenece(vocales,palabra.charArt(i))==false){
                    CantC++;
                }
            }
        }
    }
    System.out.println("Cantidad de vocales: "+ CantV);
    System.out.println("Cantidad de consonantes: "+ CantC);
}

    public static void main(String[] args) {
        
       /// ejercicio1();
       ///ejercicio2();
       //ejercicio4();
       //ejercicio9();
       //ejercicio3tp2();
       //ejercicio5();
    }
    
}
