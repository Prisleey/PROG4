
package br.pucpr.prog4.lojaVirtual.models;

import java.util.Date;

public class Cliente {
    private int id;
    private String tipoPessoa;
    private Date dataNasc;
    private String nome;
    private String cpf;
    private String sexo;
    
    public Cliente() {
        
    }

    public String getNome() {
        return nome;
    }
    
    public String getCpf() {
        return cpf;
    }

    public String getSexo() {
        return sexo;
    }

    public String getTipoPessoa() {
        return tipoPessoa;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public void setTipoPessoa(String tipoPessoa) {
        this.tipoPessoa = tipoPessoa;
    }    

    public Date getDataNasc() {
        return dataNasc;
    }

    public void setDataNasc(Date dataNasc) {
        this.dataNasc = dataNasc;
    }
}