package utils;

import org.hibernate.Session;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

public class SessionFactory {
   static Session session;

    public static Session getSession() {
        if (null == session) {
            synchronized (SessionFactory.class) {
                if (null == session) {
                    StandardServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder().configure().build();
//                    org.hibernate.SessionFactory sessionFactory = new MetadataSources(serviceRegistry).buildMetadata().buildSessionFactory();
                    org.hibernate.SessionFactory sessionFactory=  new Configuration()
                            .configure()
                            .buildSessionFactory();

                    session = sessionFactory.getCurrentSession();
                }
            }
        }
        return session;
    }

    public void setSession(Session session) {
        this.session = session;
    }

    public static void closeSession() {
        if (null != session) {
            if (session.isOpen()) {
                session.close();
            }
        }
    }

}
