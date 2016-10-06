/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hdt7;

/**
 *
 * @author Diego H
 */
public class Cadena{
    
    public Caracter[] Arreglo(String cadena){
        char[] ar=cadena.toCharArray();
        Caracter[] array=new Caracter[ar.length];
        
        char car;
        int cont=0;
        for(int i=0;i<ar.length;i++){
            Caracter c=new Caracter();
            car=ar[i];
            c.setCaracter(car);
            for (int j=0;j<ar.length;j++){
                if (ar[j]==car){
                    cont++;
                }
            }
           
           c.setCant(cont);
           array[i]=c;
           cont=0;
        }
        return array;
    } 
    
    
}
