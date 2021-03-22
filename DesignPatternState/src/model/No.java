/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Implementação da Busca em Profundidade Utilizando State
 * @author usuar
 */
public class No {
    private Set<No> adjacentes = new HashSet<>();
    private Cor cor;
    private String name;

    public No(String name) {
        cor = new Branco();
        this.name = name;
    }
    
    public void buscaProfundidade(List<No> list){
        cor.busca(this, list);
    }

    public Set<No> getAdjacentes() {
        return adjacentes;
    }

    public void setAdjacentes(No adj) {
        adjacentes.add(adj);
    }

    public Cor getCor() {
        return cor;
    }

    public void setCor(Cor cor, List<No> list) {
        this.cor = cor;
        cor.assumiu(this, list);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "name=" + name;
    }
    
    
}
