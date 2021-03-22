/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import javax.swing.JFrame;

/**
 *
 * @author usuar
 */
public class GraficoBarras implements Observador {

    private DefaultCategoryDataset dataset;
    private JFrame frame = new JFrame();

    public GraficoBarras() {
        ataset = new DefaultCategoryDataset();
        JFreeChart chart = ChartFactory.createBarChart(
                "Carteira de Ações", "Siglas",
                "Quantidade", dataset, PlotOrientation.VERTICAL,
                false, true, false);
        ChartPanel chartPanel = new ChartPanel(chart);
        frame.setContentPane(chartPanel);
        frame.setSize(500, 270);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    @Override
    public void mudancaQuantidade(String acao, Integer qtd) {
        dataset.setValue(qtd, "Quantidade", acao);
    }

}
