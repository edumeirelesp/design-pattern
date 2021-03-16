/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import model.SubClasseB;

/**
 *
 * @author usuar
 */
public class Cliente {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // hook method ultiliza o template method em sua solução.
        SubClasseB scb = new SubClasseB();
        
        scb.metodoPrincipal();
    }
    
}
