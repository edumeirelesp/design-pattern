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
public class ClassePrincipal {
    private ClasseGancho cg;

    public ClassePrincipal(ClasseGancho cg) {
        this.cg = cg;
    }
    
    public void metodoPrincipal(){
        //Logica
        System.out.println(cg.metodoGancho());
        //Logica
    }

    public ClasseGancho getCg() {
        return cg;
    }

    public void setCg(ClasseGancho cg) {
        this.cg = cg;
    }
}
