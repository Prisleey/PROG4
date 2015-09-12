package br.pucpr.prog4.lojaVirtual.models.dao;

public interface IDaoManager 
{
    void iniciar() throws DaoException;
    void encerrar();
    void confirmarTransação();
    void abortarTransação();
    IPessoaDAO getPessoaDAO();
}
