package br.pucpr.prog4.lojaVirtual.models;

import java.util.ArrayList;
import java.util.List;

public class ProdutoManager implements IProdutoManager{
    
    private static List<Produto> produtos;
    
    static {
        produtos = new ArrayList<Produto>();
        Produto p1 = new Produto();
        Produto p2 = new Produto();
        Produto p3 = new Produto();

        p1.setCod(1);
        p1.setNameProd("SMART TV");
        p1.setValue(2000.0);
        produtos.add(p1);
        p2.setCod(2);
        p2.setNameProd("CELULAR");
        p2.setValue(2500.0);
        produtos.add(p2);
        p3.setCod(3);
        p3.setNameProd("HD EXTERNO");
        p3.setValue(250.0);
        produtos.add(p3);
    }
    
    public List<Produto> obterTodos() {
        return produtos;
    }

    public Produto obterPorId(int id) {
        List<Produto> produtos = obterTodos();
        for(Produto p : produtos) {
            if(p.getCod() == id) {
                return p;
            }
        }
        return null;
    }
}
