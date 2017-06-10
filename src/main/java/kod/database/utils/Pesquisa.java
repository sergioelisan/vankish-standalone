package kod.database.utils;

import kod.database.Dao;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.Restrictions;

import java.util.List;


public class Pesquisa<T> {
    private Class classe;

    public Pesquisa(Class c) {
        classe = c;
    }


    public T get(Integer id) {
        return new Dao(classe).get(id);
    }


    public List<T> list() {
        return new Dao(classe).list();
    }


    public List<T> eq(String field, Object data) {
        return custom(Restrictions.eq(field, data));
    }


    public List<T> between(String field, Object data, Object data2) {
        return custom(Restrictions.between(field, data, data2));
    }


    public List<T> custom(Criterion criterio) {
        return new Dao(classe).criterionSearch(criterio);
    }
}
