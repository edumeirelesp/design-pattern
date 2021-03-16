/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.model;

/**
 *
 * @author usuar
 */
public class CarrinhoNulo extends Carrinho{
    
    @Override
    public double getValor(){
        return 0.0;
    }
    
    @Override
    public int getTamanho(){
        return 0;
    }
    
    @Override
    public String getName(){
        return  "UnName";
    }
}
