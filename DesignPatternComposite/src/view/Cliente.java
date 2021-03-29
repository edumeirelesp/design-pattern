/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import model.TrechoComposto;
import model.TrechoSimples;

/**
 *
 * @author usuar
 */
public class Cliente {

    public static void main(String[] args) {
        TrechoSimples ts1 = new TrechoSimples("São Paulo", "Brasília", 500);
        TrechoSimples ts2 = new TrechoSimples("Brasília", "Recife", 300);
        TrechoSimples ts3 = new TrechoSimples("Recife", "Natal", 350);
        TrechoComposto tc1 = new TrechoComposto(ts2, ts3, 30);
        TrechoComposto tc2 = new TrechoComposto(ts1, ts2, 50);
        System.out.println(tc1.toString());
        System.out.println(tc2.toString());
    }
}
