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
public class Caracter {
    
    private int cant;
    private char caracter;
    
    public Caracter(){
        cant=0;
        caracter=' ';
    }
    
    public int getCant(){
        return cant;
    }
    public void setCant(int cant){
        this.cant=cant;
    }
    public char getCaracter(){
        return caracter;
    }
    public void setCaracter(char caracter){
        this.caracter=caracter;
    }
}
