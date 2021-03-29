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
public class TrechoComposto {
    private TrechoAereo primeiro;
    private TrechoAereo segundo;
    private double taxaconexao;
    
    public TrechoComposto(TrechoAereo primeiro, TrechoAereo segundo, double taxaconexao){
        this.primeiro = primeiro;
        this.segundo = segundo;
        this.taxaconexao = taxaconexao;
        
        if(primeiro.getDestino() != segundo.getOrigem()){
            throw new RuntimeException("O primeiro destino "+" Não é igual a origem do segundo.");
        }
    }

    public TrechoAereo getPrimeiro() {
        return primeiro;
    }

    public TrechoAereo getSegundo() {
        return segundo;
    }

    public double getTaxaconexao() {
        return primeiro.getValor() + segundo.getValor() + taxaconexao;
    }

    @Override
    public String toString() {
        return "\n<<< Escala >>>\n" + "================================\n"
                + "Primeiro voo:\n" + "[Destino=" + primeiro.getDestino() + "]" + " [Origem=" + primeiro.getOrigem() + "]" 
                + " [Valor sem taxa=" + primeiro.getValor() + "]" + " [Valor com taxa=" + getTaxaconexao() + "]"
                + "\nSegundo voo:\n" + "[Destino=" + segundo.getDestino() + "]" + " [Origem=" + segundo.getOrigem() + "]" + 
                " [Valor sem taxa=" + segundo.getValor() + "]" + " [Valor com taxa=" + getTaxaconexao() + "]"
                +"\n================================";
    }
    
}
