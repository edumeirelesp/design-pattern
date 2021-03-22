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
public class AcoesLogger implements Observador{

    @Override
    public void mudancaQuantidade(String acao, Integer qtd) {
        System.out.println("Alterada a quantidade de acoes "+ acao + " para " + qtd);
    }
    
}
