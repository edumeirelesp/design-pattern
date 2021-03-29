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
public class Elemento {
    private Object valor;
    private Elemento proximo;

    public Elemento(Object valor) {
        this.valor = valor;
    }

    public Elemento getProximo() {
        return proximo;
    }

    public void setProximo(Elemento proximo) {
        this.proximo = proximo;
    }

    public Object getValor() {
        return valor;
    }
    
    public int contar(){
        if (this.proximo == null){
            return 1;
        }
        return 1 + proximo.contar();
    }
}
