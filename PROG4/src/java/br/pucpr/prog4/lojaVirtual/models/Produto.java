package br.pucpr.prog4.lojaVirtual.models;


public class Produto {
    
    private String nameProd;
    private int cod;
    private double value;

    public Produto() {
    
    }
    
    public String getNameProd() {
        return nameProd;
    }

    public void setNameProd(String nameProd) {
        this.nameProd = nameProd;
    }

    public int getCod() {
        return cod;
    }

    public void setCod(int cod) {
        this.cod = cod;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }

    
}
