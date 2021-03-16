/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import model.ClasseGancho;
import model.ClasseGanchoA;
import model.ClasseGanchoB;
import model.ClassePrincipal;

/**
 *
 * @author usuar
 */
public class Client {
    public static void main(String[] args){
        ClasseGancho cg = new ClasseGanchoA();
        ClassePrincipal cp = new ClassePrincipal(cg);
        
        cp.metodoPrincipal();
    }
}
