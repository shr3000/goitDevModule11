package hibernate;


import lombok.Getter;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import tickets.Ticket;
import client.Client;
import planets.Planet;
public class HibernateUtil {
    private static HibernateUtil INSTANCE;

    static {
        INSTANCE  = new HibernateUtil();
    }
    @Getter
    private SessionFactory sessionFactory;
    private HibernateUtil() {
        sessionFactory = new Configuration().
                addAnnotatedClass(Client.class).
                addAnnotatedClass(Ticket.class).
                addAnnotatedClass(Planet.class).
                buildSessionFactory();
    }

    public static HibernateUtil getInstance() {
        return INSTANCE;
    }

    public void close() {
        if (sessionFactory != null) {
            sessionFactory.close();
        }
    }

    public static void main(String[] args) {
        HibernateUtil util = HibernateUtil.getInstance();
        Session session = util.sessionFactory.openSession();
        Client client = session.get(Client.class, 1L);
        System.out.println("client 1 " + client);
        session.close();
    }

}
