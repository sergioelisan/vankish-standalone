package kod.vankish.logics;

import kod.database.Dao;
import kod.exceptions.util.ErrorMessage;
import kod.vankish.pojo.*;

import javax.swing.*;
import java.math.BigDecimal;
import java.util.List;


public class VendasLogics {
    private VendasLogics() {
    }

    public static Produto alteraQuantidadeProduto(Produto p, int quantidade) {
        try {
            if (ProdutoLogics.isThereQuantidadeSuficiente(p, quantidade)) {
                p.setEstocado(p.getEstocado() - quantidade);
            }
            return p;
        } catch (Exception e) {
            ErrorMessage.advert("Quantidade insuficiente de produto");
        }
        return null;
    }


    public static void done(boolean devendo, Venda venda, List<Itemvendido> itensVendidos) {
        try {
            String mensagem = "Venda concluida com sucesso!\n";

            if (devendo) {
                registraFiado(venda);
                venda.setTotal(BigDecimal.ZERO);
                mensagem = mensagem + "Divida registrada no cadastro do cliente: " + venda.getCliente().getNome();
            }

            registraVenda(venda);
            registraItensVendidos(venda, itensVendidos);
            updateStock(itensVendidos);

            CaixaLogics.credita(venda.getTotal().doubleValue(), "Venda Registrada.");

            JOptionPane.showMessageDialog(null, mensagem);
        } catch (Exception e) {
            ErrorMessage.advert("Erro na operacao de venda!\n" + e.getMessage());
        }
    }


    private static void updateStock(List<Itemvendido> itensVendidos) {
        for (Itemvendido iv : itensVendidos) {
            new Dao(Produto.class).up(iv.getProduto());
        }
    }


    private static void registraItensVendidos(Venda venda, List<Itemvendido> itensVendidos) {
        for (Itemvendido iv : itensVendidos) {
            iv.setId(new ItemvendidoId(venda.getIdVenda().intValue(), iv.getProduto().getCodigo().intValue()));
            iv.setVenda(venda);
            Dao<Itemvendido> dao = new Dao(Itemvendido.class);
            dao.add(iv);
            dao.close();
        }
    }


    private static void registraVenda(Venda venda) {
        Dao<Venda> dao = new Dao(Venda.class);
        dao.add(venda);
        dao.close();
    }


    private static void registraFiado(Venda venda) {
        Cliente c = venda.getCliente();
        c.setSaldo(c.getSaldo().subtract(venda.getTotal()));
        ClienteLogics.up(c);
    }
}
