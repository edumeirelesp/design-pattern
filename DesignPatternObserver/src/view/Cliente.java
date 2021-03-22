/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import model.AcoesLogger;
import model.CarteiraDeAcoes;
import model.GraficoBarras;

/**
 *
 * @author usuar
 */
public class Cliente {

    public static void main(String[] args) throws Exception {
        GraficoBarras gb = new GraficoBarras();
        AcoesLogger al = new AcoesLogger();
        CarteiraDeAcoes c = new CarteiraDeAcoes();
        c.addObservador(gb);
        c.addObservador(al);
        Thread.sleep(2000);
        c.adicionaAcoes("COMP02", 200);
        Thread.sleep(2000);
        c.adicionaAcoes("EMP34", 400);
        Thread.sleep(2000);
        c.adicionaAcoes("ACDF89", 300);
        Thread.sleep(2000);
        c.adicionaAcoes("EMP34", -200);
        Thread.sleep(2000);
        c.adicionaAcoes("COMP02", 150);

    }
}
