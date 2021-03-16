/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author usuar
 */
public abstract class SuperClasse {
    public void metodoPrincipal(){
        System.out.println("Metodo principal");
        metodoGancho();
    }
    
   protected abstract void metodoGancho();
       
   
}
