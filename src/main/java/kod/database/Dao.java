package kod.database;

import kod.database.utils.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Criterion;

import java.io.Serializable;
import java.util.List;


public class Dao<T> {
    private final Session session;
    private Transaction transaction;
    private Class classe;

    public Dao() {
        session = getSession();
    }

    public Dao(Class classe) {
        session = getSession();
        this.classe = classe;
    }


    private Session getSession() {
        return HibernateUtil.getSessionFactory().openSession();
    }


    public void beginTransaction() {
        transaction = session.beginTransaction();
    }


    public void commit() {
        transaction.commit();
        transaction = null;
    }


    public boolean hasTransaction() {
        return transaction != null;
    }


    public void rollback() {
        transaction.rollback();
        transaction = null;
    }


    public void close() {
        session.close();
    }


    public void add(T u) {
        beginTransaction();
        session.save(u);
        commit();
    }


    public List<T> list() {
        return session.createCriteria(classe).list();
    }


    public void rm(T u) {
        beginTransaction();
        session.delete(u);
        commit();
    }


    public void up(T u) {
        beginTransaction();
        session.merge(u);
        commit();
    }


    public Object get(Serializable obj) {
        return session.load(classe, obj);
    }


    public List<T> criterionSearch(Criterion restrinction) {
        return session.createCriteria(classe).add(restrinction).list();
    }
}
