package planets;

import hibernate.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class CrudPlanetService {
    private HibernateUtil hibernateUtil;


    public Planet  getPlanetById(String id) {
        hibernateUtil = HibernateUtil.getInstance();
        Session session =hibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        Planet  planet = session.get(Planet.class, id);
        session.close();
        return planet;
    }

    public void  createPlanet(Planet planet) {
        hibernateUtil = HibernateUtil.getInstance();
        Session session =hibernateUtil.getSessionFactory().openSession();
            Transaction transaction =session.beginTransaction();
                session.persist(planet);
            transaction.commit();
        session.close();
    }
}

