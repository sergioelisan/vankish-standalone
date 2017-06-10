package kod.vankish.logics;

import kod.database.Dao;
import kod.database.utils.Pesquisa;
import kod.vankish.pojo.Produto;


public class ProdutoLogics {
    private ProdutoLogics() {
    }

    public static Produto getProduto(Integer id) {
        return (Produto) new Pesquisa(Produto.class).get(id);
    }


    public static Produto getProdutoCodBarras(String codBarras) {
        return (Produto) new Pesquisa(Produto.class).eq("codBarras", codBarras).get(0);
    }


    public static Produto getProdutoDescricao(String descricao) {
        return (Produto) new Pesquisa(Produto.class).eq("descricao", descricao).get(0);
    }


    public static boolean isThereQuantidadeSuficiente(Produto p, int quantidade)
            throws Exception {
        if (p.getEstocado() >= quantidade) {
            return true;
        }
        throw new Exception("Quantidade insuficiente de produto");
    }


    public static void alteraProduto(Produto p) {
        new Dao(Produto.class).up(p);
    }
}
