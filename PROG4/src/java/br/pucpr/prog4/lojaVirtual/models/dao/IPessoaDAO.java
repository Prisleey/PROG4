/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.pucpr.prog4.lojaVirtual.models.dao;

import br.pucpr.prog4.lojaVirtual.models.Cliente;

/**
 *
 * @author prisley.costa
 */
public interface IPessoaDAO {
    public Cliente inserir(Cliente pessoa);
}
