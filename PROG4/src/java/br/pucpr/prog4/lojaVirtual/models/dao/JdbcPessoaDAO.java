/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.pucpr.prog4.lojaVirtual.models.dao;

import br.pucpr.prog4.lojaVirtual.models.Cliente;
import java.sql.Connection;
import java.sql.PreparedStatement;

/**
 *
 * @author prisley.costa
 */
public class JdbcPessoaDAO implements IPessoaDAO{

    private Connection conexao;
    
    public void setConexão(Connection conexao) {
        this.conexao = conexao;
    }

    @Override
    public Cliente inserir(Cliente cliente) {
        String sql;
        sql = "INSERT INTO cliente("
                + "nome,"
                + "dataNascimento,"
                + "tipo,"
                + "sexo,"
                + "cpf) "
                + " VALUES (?, ?, ?, ?, ?);";

        PreparedStatement ps;
        try {
            ps = conexao.prepareStatement(sql);
            ps.setString(1, cliente.getNome());
            java.sql.Date dataSQL = new java.sql.Date(cliente.getDataNasc().getTime());
            ps.setDate(2, dataSQL);
            ps.setString(3, cliente.getTipoPessoa());
            ps.setString(4, cliente.getSexo());
            ps.setString(5, cliente.getCpf());
            ps.executeUpdate();
            return cliente;
            
        } catch (Exception ex) {
            throw new DaoException("Ocorreu um erro ao inserir um cliente " + ex.getMessage());
        }
    }
}
