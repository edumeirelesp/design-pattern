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
public class Branco extends Cor{

    @Override
    void busca(No no, List<No> list) {
        no.setCor(new Cinza(), list);
    }
}
