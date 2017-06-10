package kod.database.utils;

import kod.exceptions.util.ErrorMessage;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;


public class HibernateUtil {
    private static final SessionFactory sessionFactory;

    static {
        try {
            sessionFactory = new AnnotationConfiguration().configure().buildSessionFactory();
        } catch (Throwable ex) {
            ErrorMessage.close("Erro na obtencao da sessao do Banco de dados\n" + ex.getMessage());
            throw new ExceptionInInitializerError(ex);
        }
    }

    public HibernateUtil() {
    }

    public static SessionFactory getSessionFactory() {
        return sessionFactory;
    }
}
