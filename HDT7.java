/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hdt7;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
/**
 *
 * @author Diego H
 */
public class HDT7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado=new Scanner(System.in);
        String cadena=teclado.nextLine();
        char[] c=cadena.toCharArray();
        Caracter[] cad=new Caracter[c.length];
        Cadena cd=new Cadena();
        cad=cd.Arreglo(cadena);
        List <Caracter> lista1=new ArrayList<Caracter>();
        List <Caracter> lista2=new ArrayList<Caracter>();
        
        for (int i=0;i<cad.length;i++){
            Caracter q=cad[i];
            lista1.add(q);
            lista2.add(q);
        }
        
        Caracter q=new Caracter();
        char w;
        Caracter e=new Caracter();
        char r;
        for (int i=0;i<lista1.size();i++){
            q=lista1.get(i);
            w=q.getCaracter();
            
            for(int j=0;j<lista2.size();j++){
                e=lista2.get(j);
                r=e.getCaracter();
                if (r==w && i!=j){
                    lista2.remove(j);
                    
                   i++;
                }
                
            }
            
        }
        
        for(int i=0;i<lista2.size();i++){
            q=lista2.get(i);
            w=q.getCaracter();
            System.out.print(w);
        }
    }
}
    