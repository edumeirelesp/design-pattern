/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.estacionamento.conta;

import br.com.estacionamento.algoritm.CalculoValor;

public class ContaEstacionamento { // classe principal
    private CalculoValor calculo; 
    private long inicio;
    private long fim;

    public CalculoValor getCalculo() {
        return calculo;
    }

    public void setCalculo(CalculoValor calculo) {
        this.calculo = calculo;
    }

    public long getInicio() {
        return inicio;
    }

    public void setInicio(long inicio) {
        this.inicio = inicio;
    }

    public long getFim() {
        return fim;
    }

    public void setFim(long fim) {
        this.fim = fim;
    }
    
    public String valorConta(){
        return calculo.calcular();
    }
}
