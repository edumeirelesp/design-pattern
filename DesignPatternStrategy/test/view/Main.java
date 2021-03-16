/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import br.com.estacionamento.algoritm.Calculo15Minutos;
import br.com.estacionamento.algoritm.CalculoDiaria;
import br.com.estacionamento.conta.ContaEstacionamento;



/**
 *
 * @author usuar
 */
public class Main {
    public static void main(String[]args){
        // pattern strategy
        
        ContaEstacionamento ce = new ContaEstacionamento();
        //ce.setCalculo(new Calculo15Minutos());
        ce.setCalculo(new CalculoDiaria());
        System.out.println(ce.valorConta());
        
    }
}
