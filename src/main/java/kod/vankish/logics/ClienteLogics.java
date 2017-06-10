package kod.vankish.logics;

import kod.database.Dao;
import kod.database.utils.Pesquisa;
import kod.exceptions.util.ErrorMessage;
import kod.vankish.pojo.Cliente;


public class ClienteLogics {
    public ClienteLogics() {
    }

    public static Cliente get(Integer id) {
        return (Cliente) new Pesquisa(Cliente.class).get(id);
    }


    public static String maisComprado(Cliente c) {
        ErrorMessage.advert("Funcao ainda nao implementada");
        return null;
    }


    public static void up(Cliente c) {
        new Dao(Cliente.class).up(c);
    }
}
