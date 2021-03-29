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
public class TrechoSimples implements TrechoAereo{
    private String origem;
    private String destino;
    private double valor;
    
    public TrechoSimples(String origem, String destino, double valor){
        this.origem = origem;
        this.destino = destino;
        this.valor = valor;
    }

    @Override
    public String getOrigem() {
        return this.origem;
    }

    @Override
    public String getDestino() {
        return this.destino;
    }

    @Override
    public double getValor() {
        return this.valor;
    }

    @Override
    public String toString() {
        return "TrechoSimples{" + "origem=" + origem + ", destino=" + destino + ", valor=" + valor + '}';
    }
    
}
