package org.example;
public class ProductDescription {

    private String descricao;
    private double valorLata;
    private double valorCaixa;

    public ProductDescription(String descricao, double valorLata, double valorCaixa) {
        this.descricao = descricao;
        this.valorLata = valorLata;
        this.valorCaixa = valorCaixa;
    }

    public String getDescricao() {
        return descricao;
    }

    public double getValorLata() {
        return valorLata;
    }

    public double getValorCaixa() {
        return valorCaixa;
    }

}
