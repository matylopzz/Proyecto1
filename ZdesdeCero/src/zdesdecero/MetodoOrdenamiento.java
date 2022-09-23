
package zdesdecero;


public class MetodoOrdenamiento {
    
    public static void Seleccion(int[]vector){
        int i, j, menor, pos, tmp;
        for(i=0;i<vector.length-1;i++){      //tomamos como menor el primero
            menor = vector[i];               //de los elementos q quedan
            pos=i;
            for(j=i+1;j<vector.length;j++){  //lo guardo en pos y busco un elem
                if (vector[j]<menor){        //menor al actual
                    menor=vector[j];
                    pos=j;
                }
                
            }
            if (pos!=i){                  //si hay alguno menor se intercambia
                tmp = vector[i];
                vector[i] = vector[pos];
                vector[pos]= tmp;
            }
        }
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
    public int busquedaSecuencial(int[]arreglo,int dato){
        int posicion = -1;
        for(int i=0; i< arreglo.length;i++){
            if(arreglo[i]==dato){
                posicion =i;
                break;
            }
        }
        return posicion;
    }
    
    public static int busquedaBinaria(int []arreglo,int dato){
        int inicio=0;
        int fin= arreglo.length-1;
        int pos;
        while (inicio<=fin){
            pos=(inicio+fin)/2;
            if(arreglo[pos]==dato){
                return pos;
            }else if(arreglo[pos]<dato){
                inicio=pos+1;
            }else{
                fin = pos-1;
            }
        }
        return -1;
    }
}
