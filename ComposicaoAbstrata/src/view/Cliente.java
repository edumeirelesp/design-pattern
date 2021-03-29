/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import model.Elemento;

/**
 *
 * @author usuar
 */
public class Cliente {
    public static void main(String[] args){
        
        Elemento ob = new Elemento(args);
        
        System.out.println(ob.contar());
     
    }
}
