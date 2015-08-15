package br.pucpr.prog4.lojaVirtual.models;

import java.util.ArrayList;
import java.util.List;

public class ProdutoManager implements IProdutoManager{
    
    @Override
    public List<Produto> obterTodos() {
        List<Produto> produtos;
        produtos = new ArrayList<Produto>();
        Produto p1 = new Produto();
        Produto p2 = new Produto();
        Produto p3 = new Produto();

        p1.setCod(1);
        p1.setNameProd("SMART TV");
        p1.setValue(2000.0);
        p2.setCod(2);
        p2.setNameProd("CELULAR");
        p2.setValue(2500.0);
        p3.setCod(3);
        p3.setNameProd("HD EXTERNO");
        p3.setValue(250.0);

        produtos.add(p1);
        produtos.add(p2);
        produtos.add(p3);

        return produtos;
    }
}