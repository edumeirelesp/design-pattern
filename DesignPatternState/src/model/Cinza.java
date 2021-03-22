/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.List;

/**
 *
 * @author usuar
 */
public class Cinza extends Cor{

    @Override
    void assumiu(No no, List<No> list) {
        for(No adj : no.getAdjacentes())
            adj.buscaProfundidade(list);
        no.setCor(new Preto(), list);
        
    }
}
