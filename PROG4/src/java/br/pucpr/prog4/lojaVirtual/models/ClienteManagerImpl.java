/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.pucpr.prog4.lojaVirtual.models;

import br.pucpr.prog4.lojaVirtual.models.dao.IDaoManager;
import br.pucpr.prog4.lojaVirtual.models.dao.IPessoaDAO;
import br.pucpr.prog4.lojaVirtual.models.dao.JdbcDaoManager;

/**
 *
 * @author prisley.costa
 */
public class ClienteManagerImpl implements IClienteManager {

    @Override
    public Cliente cadastrar(Cliente cliente) {
        IDaoManager iManager;
        iManager = new JdbcDaoManager();
        
        try {
            iManager.iniciar();
            IPessoaDAO dao = iManager.getPessoaDAO();
            Cliente c;
            c = dao.inserir(cliente);
            iManager.confirmarTransação();
            iManager.encerrar();
            
        } catch () {
            
        }
    }   
}