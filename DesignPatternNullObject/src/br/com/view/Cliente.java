/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.view;

import br.com.model.Carrinho;
import br.com.model.FactoryCarrinho;


/**
 *
 * @author usuar
 */
public class Cliente {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Carrinho car = FactoryCarrinho.createCarrinho(null);
        
        car.getTamanho();
        
        System.out.println(car.getName()); // Falta popular, caso não seja nulo
    }
    
}
