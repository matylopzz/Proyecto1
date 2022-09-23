/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package recursividad;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class NewClass {
    
    int nroinvertido(int num,int inv ) {
        
        if (num>0){
            return nroinvertido(num/10,num%10+inv*10);
        }
        else{
        return inv;
        }
    }
    public static void main(String[] args) {
        NewClass numInv=new NewClass();
        Scanner sc=new Scanner(System.in);
        int num, inv=0;
        
        System.out.println("Ingrese Numero: ");
        num= sc.nextInt();
        System.out.println("El numero invertido es: " + numInv.nroinvertido(num, inv) );
        
        
        
        
    }
    
}
