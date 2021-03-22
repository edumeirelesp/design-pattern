/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.util.ArrayList;
import java.util.List;
import model.No;

/**
 *
 * @author usuar
 */
public class Client {

    public static void main(String[] args) {
        No a = new No("A");
        No b = new No("B");
        No c = new No("C");
        No d = new No("D");
        No e = new No("E");
        No f = new No("F");
        No g = new No("G");
        No h = new No("H");
        a.setAdjacentes(b);
        b.setAdjacentes(c);
        c.setAdjacentes(d);
        d.setAdjacentes(b);
        a.setAdjacentes(e);
        e.setAdjacentes(f);
        f.setAdjacentes(c);
        f.setAdjacentes(g);
        f.setAdjacentes(h);
        a.setAdjacentes(h);
        List<No> l = new ArrayList<>();
        a.buscaProfundidade(l);
        for (No n : l) {
            System.out.println(n);
        }

    }
}
