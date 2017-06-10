package kod.vankish.logics;

import kod.database.Dao;
import kod.database.utils.Pesquisa;
import kod.vankish.pojo.Usuario;

import java.util.ArrayList;
import java.util.List;


public class UsuarioLogics {
    public static String Lista = "-- Usuarios --";


    public UsuarioLogics() {
    }

    public void add(Usuario u) {
        new Dao(Usuario.class).add(u);
    }


    public void up(Usuario u) {
        new Dao(Usuario.class).up(u);
    }


    public void rm(Integer id) {
        new Dao(Usuario.class).rm((Usuario) new Pesquisa(Usuario.class).get(id));
    }


    public Usuario sch(String login) {
        return (Usuario) new Pesquisa(Usuario.class).eq("nome", login).get(0);
    }


    public Usuario get(Integer id) {
        return (Usuario) new Pesquisa(Usuario.class).get(id);
    }


    public List<String> getUsers() {
        List<String> lista = new ArrayList();
        try {
            lista.add(Lista);

            for (Usuario f : new Pesquisa(Usuario.class).list()) {
                lista.add(f.getNome());
            }
        } catch (IndexOutOfBoundsException e) {
            lista.add("Nenhum Usuario cadastrado");
        }

        return lista;
    }


    public boolean isSenhaValida() {
        return true;
    }


    public boolean isLoginValido() {
        return true;
    }
}
