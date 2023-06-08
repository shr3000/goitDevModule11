package client;

import hibernate.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.List;

public class CrudClientService {
    private HibernateUtil util;

    public Client getById(Long id) {
        util = HibernateUtil.getInstance();
        Session session = util.getSessionFactory().openSession();
        Client  client = session.get(Client.class, id);
        session.close();
        return client;
    }

    public List<Client> getAll() {
        util = HibernateUtil.getInstance();
        Session session = util.getSessionFactory().openSession();
        List fromClient = session.createQuery("from Client").list();
        session.close();
        return fromClient;
    }

    public void update(long id, String name) {
        util = HibernateUtil.getInstance();
        Session session = util.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        Client client = session.get(Client.class, id);
        client.setName(name);
        session.persist(client);
        transaction.commit();
        session.close();
    }


    public void deleteById(long  id) {
        util = HibernateUtil.getInstance();
        Session session = util.getSessionFactory().openSession();
            Transaction transaction = session.beginTransaction();
                Client client = session.get(Client.class, id);
                session.remove(client);
            transaction.commit();
        session.close();
    }


    public void create(String name) {
        util = HibernateUtil.getInstance();
        Session session = util.getSessionFactory().openSession();
            Transaction transaction = session.beginTransaction();
                Client client1 = new Client();
                client1.setName(name);
                session.persist(client1);
            transaction.commit();
        session.close();
    }
}
